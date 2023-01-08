package Game;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUIGAME extends JFrame implements ActionListener
{
    private static String pname[],name;
    private static String time[];
    private static long ttime=0L;
    private JLabel tell,ctell,question,text,qname;
    private JTextField input,ipname;
    private JButton ok;
    public GUIGAME()
    {
        init();
        read();
    }
    
    private void init()
    {
        setLayout(new GridLayout(9,6));
        Font f = new Font("Algerian",Font.BOLD,20);
        tell=new JLabel("***************Welcome you to the guessing game(\"Only Seven Chances allowed\")***************");
        tell.setFont(f);
        tell.setForeground(Color.RED);
        Font f1 = new Font("Times New Roman",Font.BOLD,16);
        question = new JLabel("The Number taken by the computer is between 1 - 100");
        qname = new JLabel("Enter Your name :");
        ipname = new JTextField(5);
        text = new JLabel("Enter the number below :");
        question.setFont(f1);
        text.setFont(f1);
        qname.setFont(f1);
        input = new JTextField(5);
        add(tell);
        ctell=new JLabel("Number of Chances Left "+(7-count));
        ctell.setFont(f1);
        add(ctell);
        add(question);
        add(qname);
        add(ipname);
        add(text);
        add(input);
        input.addActionListener(this);
        ok=new JButton("Ok");
        ok.addActionListener(this);
        add(ok);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private int count;
    private static long it,ft;
    public void actionPerformed(ActionEvent e)
    {
        remove(ipname);
        count++;
        if(count==1)
            it=System.currentTimeMillis();
        int n=Integer.valueOf(input.getText());
        ctell.setText("Number of Chances Left "+(7-count));
        if(count>6)
        {
            remove(input);
            remove(ok);
            remove(ctell);
            remove(question);
            remove(text);
            remove(qname);
            tell.setText("You LOST!! Better luck Next Time");
            SCORERS();
            add(arp);
        }
        else if(n==num)
        {
            remove(input);
            remove(ok);
            remove(question);
            remove(text);
            remove(qname);
            tell.setText("You WON!! CONGRATULATION");

            name=ipname.getText();
            ft=System.currentTimeMillis();
            ttime=ft-it;
            timeConverter();
            ctell.setText("Time taken to complete : "+minutes+":"+seconds);
            write();
            SCORERS();
            add(arp);
        }
        else if(num<n)
        {
            qname.setText("Entered Number is bigger than the number is it to be");
            text.setText("Enter smaller number");
        }
        else
        {
            qname.setText("Entered Number is smaller than the number is it to be");
            text.setText("Enter bigger number");
        }
        pack();
    }
    private JScrollPane arp;
    private JTextArea ar ;
    private void SCORERS()
    {
        ar= new JTextArea(10,15);
        arp=new JScrollPane(ar);
        String s="Scores of different People :-\n";
        for(int x=0;x<pname.length;x++)
        {
            s=s+pname[x]+"\t"+time[x]+"\n";
        }
        ar.setText(s);
        ar.setEditable(false);
        setLayout(new FlowLayout());
        pack();
    }
    
    private static int countLines(FileReader fr)
    {
        Scanner sc =null;int c=0;
        try
        {
            sc = new Scanner(fr);
            sc.useDelimiter(",");
            while(sc.hasNextLine())
            {
                sc.nextLine();
                c++;
            }
        }
        catch(Exception e)
        {
        }
        finally
        {
            try
            {
                sc.close();
                fr.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Unable to close the file("+e.getMessage()+")","Error",JOptionPane.ERROR_MESSAGE);
            }
            return c;
        }
    }

    private static void sort()
    {
        try
        {
            for(int x=0;x<pname.length;x++)
            {
                int i=x;
                int it=timetoseconds(i);
                for(int y=x+1;y<pname.length;y++)
                {
                    int fi=timetoseconds(y);
                    if(it>fi)
                    {
                        i=y;
                    }
                }
                String t=pname[x];
                pname[x]=pname[i];
                pname[i]=t;

                t=time[x];
                time[x]=time[i];
                time[i]=t;
            }
        }
        catch(Exception e)
        {
        }
    }

    private static int timetoseconds(int i)
    {
        int in=time[i].indexOf(':');
        int min=Integer.valueOf(time[i].substring(0,in))*60;
        int sec=Integer.valueOf(time[i].substring(in+1));
        return min+sec;
    }

    public static void read()
    {
        FileReader fr=null;
        Scanner sc =null;
        try
        {
            fr = new FileReader("e:\\PlayerData.txt");
            int n=countLines(fr);
            pname = new String[n];
            time=new String[n];

            fr = new FileReader("e:\\PlayerData.txt");
            sc = new Scanner(fr);
            for(int x=0;x<n;x++)
            {
                StringTokenizer st  =new StringTokenizer(sc.nextLine(),",");
                pname[x]=st.nextToken();
                time[x]=st.nextToken();
                //                 System.out.println(pname[x]+"\t"+time[x]);
            }
        }
        catch(Exception e)
        {
        }
        finally
        {
            try
            {
                sc.close();
                fr.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Unable to close the file("+e.getMessage()+")","Error",JOptionPane.ERROR_MESSAGE);
            }
            finally
            {
                sort();
            }
        }
    }

    public static void write()
    {
        timeConverter();
        FileWriter fw=null;
        BufferedWriter bw=null;
        PrintWriter pw=null;
        try
        {
            fw=new FileWriter("e:\\PlayerData.txt",true);
            bw=new BufferedWriter(fw);
            pw=new PrintWriter(bw);
            pw.println(name+","+minutes+":"+seconds);
            pw.close();
            bw.close();
            fw.close();
            if(pname!=null)
            {
                read();
                fw=new FileWriter("e:\\PlayerData.txt");
                bw=new BufferedWriter(fw);
                pw=new PrintWriter(bw);
                for(int x=0;x<pname.length;x++)
                {
                    pw.println(pname[x]+","+time[x]);
                }
            }
        }
        catch(Exception e)
        {
        }
        finally
        {
            try
            {
                pw.close();
                bw.close();
                fw.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Unable to close the file("+e.getMessage()+")","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static long minutes,seconds;
    private static void timeConverter() 
    {
        minutes = TimeUnit.MILLISECONDS.toMinutes(GUIGAME.ttime);
        seconds = TimeUnit.MILLISECONDS.toSeconds(GUIGAME.ttime);
    }
    private static int num;
    public static void main(String arg [])
    {
        GUIGAME ob = new GUIGAME();
        ob.setVisible(true);
        num=(int)(Math.random()*100);
    }
}