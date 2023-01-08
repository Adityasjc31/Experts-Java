package record_classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.text.*;
public class Timer_ extends JFrame implements ActionListener
{
    private boolean backup;
    protected boolean isClickedToggleButton = false;
    private int hrs,mins,secs;
    protected JLabel l;
    protected JButton b,increment,decrement;
    protected String cond,cname;
    private JComboBox jcb;
    private PowerFailure pf;
    public Timer_()
    {
        hrs=mins=secs=0;
    }

    public Timer_(int h,int m,int s)
    {
        hrs=h;
        mins=m;
        secs=s;
    }

    public void Timer()
    {   
        classname();
        setLayout(new FlowLayout());
        l= new JLabel("Time : "+format());
        b=new JButton("Stop");
        String ar[]={"min","sec","hr"};
        jcb=new JComboBox<String>(ar);

        increment = new JButton("+1 min");
        decrement = new JButton("-1 min");

        add(l);
        add(b);
        add(jcb);
        add(increment);
        add(decrement);

        setSize(238,75);
        setAlwaysOnTop(true);
        
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMMM, dd yyyy");
        
        String d1 = sdf.format(d);

        setTitle("Time_"+d1);

        b.addActionListener(this);
        increment.addActionListener(this);
        decrement.addActionListener(this);
        jcb.addActionListener(this);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        pack();

        JFrame.setDefaultLookAndFeelDecorated(true);
    }
    
    public String getTimeStamp()
    {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMMM, dd yyyy  hh:mm:ss a  zzzz");
        String d1 = sdf.format(d);

        return d1;
    }
    
    public void View()
    {
        setVisible(true);
    }
    
    public void trigger(boolean backup)
    {
        cond="";
        this.backup = backup;
        if(backup)
            pf = new PowerFailure(cname,getTime());
    }

    public void classname()
    {
        cname=info_class.getClassname();
    }
    
    public void start()
    {
        if(backup)
            pf.start();
        while(isOpened())
        {
            try
            {
                if(isActive())
                {
                    setOpacity(0.99f);
                }
                else
                {
                    setOpacity(0.20f);
                }
            }
            catch(Exception e)
            {
            }
            if(backup)
                pf.setExcecution(true);
            for(int x=0;cond.length()==1 && isOpened();)
            {
                if(backup)
                {
                    pf.update(getTime());
                    pf.setWriteable(false);
                }
                
            }
            if(backup)
                pf.setWriteable(true);
            secs++;

            if(secs==60)
            {
                secs=0;
                mins++;
                if(mins==60)
                {
                    mins=0;
                    hrs++;
                }
            }
            String ptime = format();
            //System.out.println(pf.isAlive());
            //pf.update(ptime);

            l.setText("Time : "+ptime);
            try
            {
                if(backup)
                    pf.suspend();
                Thread.sleep(1000);
                if(backup)
                    pf.resume();
            }
            catch(Exception e){}
        }
        if(backup)
        {
            pf.setExcecution(false);
            pf.stop();
            boolean b = pf.deleteFile();
            System.out.println(b);
        }
        /*if(b==false)
        {
        b = pf.deleteConfirm();
        }*/
        //pf.destroy();
    }

    private String format()
    {
        String h="";
        if((hrs+"").length()==1)
        {
            h="0"+hrs;
        }
        else
        {
            h=""+hrs;
        }

        String m="";
        if((mins+"").length()==1)
        {
            m="0"+mins;
        }
        else
        {
            m=""+mins;
        }

        String s="";
        if((secs+"").length()==1)
        {
            s="0"+secs;
        }
        else
        {
            s=secs+"";
        }
        return h+" : "+m+" : "+s;
    }

    public void actionPerformed(ActionEvent evt)
    {
        String tc=evt.getActionCommand();
        Object cond = evt.getSource();
        if(cond == jcb)
        {
            String time = jcb.getSelectedItem().toString();
            increment.setText("+1 "+time);
            decrement.setText("-1 "+time);
        }

        if(cond==increment)
        {
            String time = jcb.getSelectedItem().toString();
            if(time.equals("min"))
            {
                mins++;
                if(mins == 60)
                {
                    mins = 0;
                    hrs++;
                    jcb.setSelectedIndex(2);
                }
            }
            else if(time.equals("sec"))
            {
                secs++;
                if(secs == 60)
                {
                    secs = 0;
                    mins++;
                    jcb.setSelectedIndex(0);
                }
            }
            else if(time.equals("hr"))
            {
                hrs++;
            }
            l.setText("Time : "+format());
        }

        if(cond==decrement)
        {
            String time = jcb.getSelectedItem().toString();
            if(time.equals("min"))
            {
                mins--;
                if(mins <= 0)
                {
                    mins = 0;
                    jcb.setSelectedIndex(1);
                }
            }
            else if(time.equals("sec"))
            {
                secs--;
                if(secs < 0)
                {
                    secs = 0;
                }
            }
            else if(time.equals("hr"))
            {
                hrs--;
                if(hrs<=0)
                {
                    hrs=0;
                    jcb.setSelectedIndex(0);
                }
            }
            l.setText("Time : "+format());
        }

        if(tc.equals("Stop"))
        {
            this.cond=" ";
            b.setText("Start");
            isClickedToggleButton = true;
        }

        if(tc.equals("Start"))
        {
            this.cond="";
            b.setText("Stop");
        }
    }

    public boolean isOpened()
    {
        if(isVisible())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getTime()
    {
        return hrs+":"+mins+":"+secs+"( "+hrs+" hrs "+mins+" mins "+secs+" sec(s) )";
    }
    
    public int getHours()
    {
        return hrs;
    }

    public int getMinutes()
    {
        return mins;
    }
    
    public int getSeconds()
    {
        return secs;
    }
    
    public void delete()
    {
        this.dispose();
        remove(l);
        remove(b);
    }
}