package record_classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.text.*;
public class Timer extends JFrame implements ActionListener,MouseListener
{
    private boolean backup;
    private int hrs,mins,secs;
    protected JLabel l;
    private JLabel hideShow;
    protected JButton b,increment,decrement;
    private String cond,cname;
    private JComboBox jcb;
    private PowerFailure pf;
    public Timer()
    {
        hrs=mins=secs=0;
    }

    public Timer(int h,int m,int s)
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
        hideShow  = new JLabel(">");
        String ar[]={"min","sec","hr"};
        jcb=new JComboBox<String>(ar);

        increment = new JButton("+1 "+ar[0]);
        decrement = new JButton("-1 "+ar[0]);
        add(l);
        add(b);
        add(jcb);
        add(increment);
        add(decrement);
        add(hideShow);

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
        hideShow.addMouseListener(this);
        increment.addMouseListener(this);
        decrement.addMouseListener(this);

        increment.setVisible(false);
        decrement.setVisible(false);
        jcb.setVisible(false);
        increment.setToolTipText("Hold to increment it continuously");
        decrement.setToolTipText("Hold to decrement it continuously");
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(318,75));

        pack();

        JFrame.setDefaultLookAndFeelDecorated(true);
        setVisible(true);
    }
    boolean pressed = false; 
    public void mouseExited(MouseEvent evt)
    {
    }

    public void mouseEntered(MouseEvent evt)
    {
    }

    public void mouseReleased(MouseEvent evt)
    {
        pressed = false;
    }
    Evaluate ob;
    public void mousePressed(MouseEvent evt)
    {
        pressed = true;
        Object cond = evt.getSource();
        ob = new Evaluate(cond);
        ob.start();
    }

    public void mouseClicked(MouseEvent evt)
    {
        Object ob = evt.getSource();
        if(ob == hideShow)
        {
            if(hideShow.getText().equalsIgnoreCase("<"))
            {
                hideShow.setText(">");
                increment.setVisible(false);
                decrement.setVisible(false);
                jcb.setVisible(false);
                hideShow.setToolTipText("Show more options");
            }
            else
            {
                hideShow.setText("<");
                increment.setVisible(true);
                decrement.setVisible(true);
                jcb.setVisible(true);
                hideShow.setToolTipText("Minimize more options");
            }
            pack();
        }
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

    public class Evaluate extends Thread
    {
        Object cond;
        public Evaluate(Object cond)
        {
            this.cond = cond;
        }

        public void run()
        {
            if(cond==increment)
            {
                //                 System.out.println("Entered");
                do
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
                    //                     System.out.println("Repaint");
                    l.setText("Time : "+format());
                    try
                    {
                        Thread.sleep(500);
                    }
                    catch(Exception e)
                    {
                    }
                }
                while(pressed);
                //                 System.out.println("Exited");
            }

            if(cond==decrement)
            {
                do
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
                    try
                    {
                        Thread.sleep(500);
                    }
                    catch(Exception e)
                    {
                    }

                }
                while(pressed);
            }
        }
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

        if(tc.equals("Stop"))
        {
            this.cond=" ";
            b.setText("Start");
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

    public int getTimeInSeconds()
    {
        return hrs*60*60 + mins*60 + secs;
    }

    public void delete()
    {
        this.dispose();
        remove(l);
        remove(b);
    }
}