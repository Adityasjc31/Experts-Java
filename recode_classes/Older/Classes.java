import java.util.*;
import java.io.*;
import javax.swing.*;
public class Classes extends info_class
{
    public static void main(String args[])
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        Classes c = new Classes();
        c.main();
    }

    static class Filter implements FilenameFilter
    {
        public boolean accept(File fn,String name)
        {
            return (name.indexOf('.')==-1);
        }
    }

    public static String[] report(String dir)
    {
        String f[] = new File(dir).list(new Filter());
        return f;
    }

    public void main()
    {
        String folders[] = null;
        String mch;
        do
        {
            folders = report("E:\\class_records\\");
            Scanner sc = new Scanner(System.in);
            System.out.print("");
            for(int x=0;x<folders.length;x++)
            {
                System.out.println((x+1)+" - Classes for "+folders[x]);
            }
            System.out.println("(-355) - Revert a class\n(-366) - Display a record");
            System.out.println((folders.length+1) + "- Exit");
            System.out.println("To add custom class type the name of the class instead of choosing\nEnter the Choice");
            mch = sc.nextLine();
            int ch=0;
            if(mch.length() == 0)
            {
                continue;
            }
            if(Character.isDigit(mch.charAt(0)))
                ch=Integer.parseInt(mch);
            record r=null;
            String t="",starttime=null,endtime=null;
            if(ch>=1 && ch<=folders.length || (Character.isLetter(mch.charAt(0)) && Character.isLetter(mch.charAt(mch.length()-1))))
            {
                System.out.print("If the class is of 1 hour press enter else type the duration : ");
                //sc.nextLine();
                t= sc.nextLine();
                if(t.equalsIgnoreCase("cancel"))
                {
                    continue;
                }
                if(t.length() == 0)
                {
                    t="1.0";
                }
                if(!(Character.isLetter(mch.charAt(0)) && Character.isLetter(mch.charAt(mch.length()-1))))
                {
                    mch = folders[ch-1];
                    System.out.println("Selected Class : "+mch);
                }
                ClassOver over = new ClassOver(mch,Double.parseDouble(t));
                System.out.println("Number of classes done : "+over.getHours());
                if(over.isOver())
                {
                    if(over.isMore())
                    {
                        double more = over.chancesOFAnyClass();
                        String what = (more<=0 ? "has been":"will get");
                        System.out.println("Month class "+what+" "+(more<=0 ? "already over" : "over after")+" : "+(more<0  ? (more-more) : more));
                        sc.nextLine();
                        if(more<=0)
                            continue;
                    }
                    else
                    {
                        System.out.println("Today is the last Class of "+mch);
                    }
                }
                System.out.println("Press enter when the class starts to record starting time...");
                String y = sc.nextLine();

                if(y.equalsIgnoreCase("cancel"))
                {
                    continue;
                }
                starttime = record.getDate();
                System.out.println("Class started at "+ starttime+"\n");
            }

            Timer timer = new Timer();
            String live_timer="";
            BackFailureCheck bfc  = null;
            String change=null;

            if(t.length()==0)
            {
                r = new record(mch,starttime);
            }
            else
            {
                r = new record(mch,starttime,Double.parseDouble(t));
            }
            switch(ch)
            {
                case -355:
                System.out.println("Select classname");
                for(int x=0;x<folders.length;x++)
                {
                    System.out.println((x+1)+" - Classes for "+folders[x]);
                }
                System.out.println("Enter your Choice");
                int c = sc.nextInt();
                Revert revert=null;
                System.out.println("Enter class number");
                int cn = sc.nextInt();
                revert  = new Revert(folders[c-1],cn);
                sc.nextLine();
                System.out.println("Press enter to revert");
                sc.nextLine();
                if(revert!=null)
                {
                    revert.revert();
                    System.out.println("\nReverted\nPress Enter key to continue");
                    sc.nextLine();
                }
                break;

                case -366:
                System.out.println("Select classname");
                for(int x=0;x<folders.length;x++)
                {
                    System.out.println((x+1)+" - Classes for "+folders[x]);
                }
                System.out.println("Enter your choice");
                c = sc.nextInt();
                record.read(folders[c-1]);
                System.out.println("Press Enter to continue");
                new Scanner(System.in).nextLine();
            }
            if(ch == folders.length+1)
            {
                System.out.println("Exited");
            }
            else if(ch>folders.length+1)
            {
                System.out.println("Wrong Choice");
                try
                {
                    Thread.sleep(1200);
                }
                catch(Exception e){}
            }
            setClassname(mch);
            bfc = new BackFailureCheck();

            //System.out.println(info_class.getClassname());
            /*boolean bt=true;
            if(bt)
            {
            timer.classname();
            break;
            }*/

            if(ch>=1 && ch<=folders.length || (Character.isLetter(mch.charAt(0)) && Character.isLetter(mch.charAt(mch.length()-1))))
            {
                if(bfc.test())
                {
                    System.out.println("Last Timer found : "+bfc.time()+" for the "+mch+" class");
                    System.out.println("if you want to use the above timer then type use else press enter key");
                    String verify = sc.next();
                    sc.nextLine();
                    if(verify.equalsIgnoreCase("use"))
                    {
                        timer = new Timer(bfc.hours(),bfc.minutes(),bfc.seconds());
                    }
                }
                else
                {
                    r.setStartTime(starttime);
                    setStartTime(starttime);
                    r.write(false);
                }

                System.out.println("Class will end when you will close the live timer window");
                timer.Timer();
                timer.trigger(true);
                timer.start();
                endtime=record.getDate();
                live_timer = timer.getTime();
                System.out.println("Ended on : "+endtime+"\nLive Timer : "+live_timer+"\nIf you want to change class number type the number of class to be changed to : ");
                r.setEndTime(endtime);
                r.setLiveTimer(live_timer);
                change = sc.nextLine();
                if(change.length()!=0)
                {
                    if(Character.isDigit(change.charAt(0)))
                    {
                        r.setClassNo(Integer.parseInt(change));
                    }
                }
                r.write(true);
            }
        }
        while(!mch.equalsIgnoreCase((folders.length+1)+""));
    }

    private void main_old()
    {
        String mch;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - Classes for Physics\n2 - Classes for Chemistry\n3 - Classes for Mathematics\n4 - Classes for Computer\n5 - Revert a class\n6 - Display a class record\n7 - Exit");
            System.out.println("To add custom class type the name of the class instead of choosing\nEnter the Choice");
            mch = sc.nextLine();
            int ch=0;
            if(Character.isDigit(mch.charAt(0)))
                ch=Integer.parseInt(mch);
            record r=null;
            String t=null,starttime=null,endtime=null;
            if(ch>=1 && ch<=4 || (Character.isLetter(mch.charAt(0)) && Character.isLetter(mch.charAt(mch.length()-1)))  )
            {
                System.out.print("If the class is of 1 hour press enter else type the duration : ");
                //sc.nextLine();
                t= sc.nextLine();
                if(t.equalsIgnoreCase("cancel"))
                {
                    continue;
                }

                switch(ch)
                {
                    case 1:
                    mch="Physics";
                    break;

                    case 2:
                    mch="Chemistry";
                    break;

                    case 3:
                    mch="Mathematics";
                    break;

                    case 4:
                    mch="Computer";
                    break;
                }

                ClassOver over = new ClassOver(mch);
                if(over.isOver())
                {
                    System.err.println("Today is the last Class of "+mch);
                    if(over.isMore())
                    {
                        System.out.println("Month class has been over already");
                        continue;
                    }
                }
                else
                {
                    System.out.println("Number of classes done : "+over.getHours());
                }
                System.out.println("Press enter when the class starts to record starting time...");
                String y = sc.nextLine();

                if(y.equalsIgnoreCase("cancel"))
                {
                    continue;
                }
                starttime = record.getDate();
                System.out.println("Class started at "+ starttime+"\n");
            }

            Timer timer = new Timer();
            String live_timer="";
            BackFailureCheck bfc  = null;
            String change=null;
            switch(ch)
            {
                case 0:
                if(t.length()==0)
                {
                    r = new record(mch,starttime);
                }
                else
                {
                    r = new record(mch,starttime,Double.parseDouble(t));
                }
                break;

                case 1:
                mch="Physics";
                if(t.length()==0)
                {
                    r = new record("Physics",starttime);
                }
                else
                {
                    r = new record("Physics",starttime,Double.parseDouble(t));
                }
                break;

                case 2:
                mch="Chemistry";
                if(t.length()==0)
                {
                    r = new record("Chemistry",starttime);
                }
                else
                {
                    r = new record("Chemistry",starttime,Double.parseDouble(t));
                }
                break;

                case 3:
                mch="Mathematics";
                if(t.length()==0)
                {
                    r = new record("Mathematics",starttime);
                }
                else
                {
                    r = new record("Mathematics",starttime,Double.parseDouble(t));
                }
                break;

                case 4:
                mch="Computer";
                if(t.length()==0)
                {
                    r = new record("Computer",starttime);
                }
                else
                {
                    r = new record("Computer",starttime,Double.parseDouble(t));
                }
                break;

                case 5:
                System.out.println("Select classname\n1 - Physics\n2 - Chemistry\n3 - Mathematics\n4 - Computer\nEnter your choice");
                int c = sc.nextInt();
                Revert revert=null;
                System.out.println("Enter class number");
                int cn = sc.nextInt();
                switch(c)
                {
                    case 1:
                    revert  = new Revert("Physics",cn);
                    break;

                    case 2:
                    revert  = new Revert("Chemistry",cn);
                    break;

                    case 3:
                    revert  = new Revert("Mathematics",cn);
                    break;

                    case 4:
                    revert  = new Revert("Computer",cn);
                    break;
                }
                sc.nextLine();
                System.out.println("Press enter to revert");
                sc.nextLine();
                if(revert!=null)
                {
                    revert.revert();
                    System.out.println("\nReverted\nPress Enter key to continue");
                    sc.nextLine();
                }
                break;

                case 6:
                System.out.println("Select classname\n1 - Physics\n2 - Chemistry\n3 - Mathematics\n4 - Computer\n5 - Class added by yourself\nEnter your choice");
                c = sc.nextInt();
                switch(c)
                {
                    case 1:
                    record.read("Physics");
                    break;

                    case 2:
                    record.read("Chemistry");
                    break;

                    case 3:
                    record.read("Mathematics");
                    break;

                    case 4:
                    record.read("Computer");
                    break;

                    case 5:
                    System.out.println("Enter the class name");
                    sc.nextLine();
                    String x=sc.nextLine();
                    record.read(x);
                    break;
                }
                System.out.println("Press Enter to continue");
                new Scanner(System.in).nextLine();

                case 7:
                System.out.println("Exited.");
                break;

                default:
                System.out.println("Wrong Choice");
            }
            setClassname(mch);
            bfc = new BackFailureCheck();

            //System.out.println(info_class.getClassname());
            /*boolean bt=true;
            if(bt)
            {
            timer.classname();
            break;
            }*/

            if(ch>=1 && ch<=4 || (Character.isLetter(mch.charAt(0)) && Character.isLetter(mch.charAt(mch.length()-1))))
            {
                if(bfc.test())
                {
                    System.out.println("Last Timer found : "+bfc.time()+" for the "+mch+" class");
                    System.out.println("if you want to use the above timer then type use else press enter key");
                    String verify = sc.next();
                    sc.nextLine();
                    if(verify.equalsIgnoreCase("use"))
                    {
                        timer = new Timer(bfc.hours(),bfc.minutes(),bfc.seconds());
                    }
                }
                else
                {
                    r.setStartTime(starttime);
                    setStartTime(starttime);
                    r.write(false);
                }

                System.out.println("Class will end when you will close the live timer window");
                timer.Timer();
                timer.trigger(true);
                timer.start();
                endtime=record.getDate();
                live_timer = timer.getTime();
                System.out.println("Ended on : "+endtime+"\nLive Timer : "+live_timer+"\nIf you want to change class number type the number of class to be changed to : ");
                r.setEndTime(endtime);
                r.setLiveTimer(live_timer);
                change = sc.nextLine();
                if(change.length()!=0)
                {
                    if(Character.isDigit(change.charAt(0)))
                    {
                        r.setClassNo(Integer.parseInt(change));
                    }
                }
                r.write(true);
            }
        }
        while(!mch.equalsIgnoreCase("7"));
    }

    public void setClassname(String t)
    {
        cname=t;
    }

    public void setStartTime(String t)
    {
        starttime = t;
    }
}