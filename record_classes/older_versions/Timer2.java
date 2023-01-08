package recode_classes.older_versions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Timer2 extends JFrame implements ActionListener
{
    private int hrs,mins,secs;
    private JLabel l;
    private JButton b,increment,decrement;
    private String cond,cname;
    private PowerFailure pf;
    public Timer2()
    {
        hrs=mins=secs=0;
    }

    public Timer2(int h,int m,int s)
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
        increment = new JButton("+1 min");
        decrement = new JButton("-1 min");

        add(l);
        add(b);
        add(increment);
        add(decrement);

        setSize(238,75);
        setAlwaysOnTop(true);
        setTitle("Timer");

        b.addActionListener(this);
        increment.addActionListener(this);
        decrement.addActionListener(this);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        pack();
        setVisible(true);
    }

    public void trigger()
    {
        cond="";
        pf = new PowerFailure(cname,getTime());
    }

    public void classname()
    {
        cname=info_class.getClassname();
    }

    public void start()
    {
        pf.start();
        while(isOpened())
        {
            pf.setExcecution(true);
            for(int x=0;cond.length()==1 && isOpened();)
            {
                pf.update(getTime());
                pf.setWriteable(false);
            }
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
            pf.update(ptime);

            l.setText("Time : "+ptime);
            try
            {
                pf.suspend();
                Thread.sleep(1000);
                pf.resume();
            }
            catch(Exception e){}
        }
        pf.setExcecution(false);
        pf.stop();
        System.out.println(pf.deleteFile());
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
        if(cond==increment)
        {
            mins++;
            l.setText("Time : "+format());
        }

        if(cond==decrement)
        {
            if(mins>0)
            {
                mins--;
                l.setText("Time : "+format());
            }
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

    public void delete()
    {
        this.dispose();
        remove(l);
        remove(b);
    }
}