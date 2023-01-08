package recode_classes.older_versions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class Timer extends JFrame implements ActionListener
{
    private int hrs,mins,secs;
    private JLabel l;
    private JButton b;
    private String cond,cname;
    private File f;
    public void Timer()
    {
        setLayout(new FlowLayout());
        l= new JLabel("Time : "+hrs+":"+mins+":"+secs);
        b=new JButton("Stop");
        add(l);
        add(b);
        setVisible(true);
        pack();
        setSize(238,75);
        setAlwaysOnTop(true);
        setTitle("Timer");
        b.addActionListener(this);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public void trigger()
    {
        cond="";
    }

    public void classname()
    {
        System.out.println(cname=((info_class.getClassname()==null) ? "test" : info_class.getClassname()));
    }
    
    public void start()
    {
        while(isOpened())
        {
            for(int x=0;cond.length()==1 && isOpened(););
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
            
            l.setText("Time : "+h+" : "+m+" : "+s);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
    
    public void actionPerformed(ActionEvent evt)
    {
        String tc=evt.getActionCommand();
        if(tc.equals("Stop"))
        {
            cond=" ";
            b.setText("Start");
        }
        
        if(tc.equals("Start"))
        {
            cond="";
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