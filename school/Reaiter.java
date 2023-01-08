package school;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.nio.*;
class Reaiter extends JFrame implements ActionListener,ItemListener
{
    protected static DefaultListModel model1;
    protected static Temp_Detail td=new Temp_Detail();
    protected static String[] item,item_code,UserId,password;
    protected static int item_quantity[];
    protected static double item_price[],bill;
    protected static String na,phno,add,cid;
    protected static int Truth=-1;
    protected static String[] ing,icg,ipg,iqg;
    protected static int qut;
    protected static  int wq;
    protected static String b = "Via which",str1,tp;
    protected static int p;
    protected static double t2;
    protected static String password1 = "Allow Access to me !!!";
    protected static JComboBox<String> box;
    protected static JLabel display;
    protected static String a="Your Choice",pass,fileo;
    protected static boolean b1;
    protected static boolean entered;
    protected static String t;
    protected static void CustomerEntered()
    {
    }

    protected static void remrrt(String s)
    {
        File_creation("Quantities_temp_taken");
        try
        {
            unhide(fileo);
            FileWriter fw = new FileWriter(fileo);
            BufferedWriter br = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(br);
            pw.println("Quantities_taken\tItem\tItem_Price\tItem_Code");
            for(int x=0;x<icg.length;x++)
            {
                if(!icg[x].equals("-1"))
                {
                    pw.println(iqg[x]+"\t"+ing[x]+"\t"+ipg[x]+"\t"+icg[x]);
                }
                else
                {
                    bill=0;
                    //bill-=(Double.valueOf(ipg[x])*Double.valueOf(iqg[x]));
                    //System.out.println(bill);
                }
            }
            pw.close();
            br.close();
            fw.close();
            hide(fileo);
        }
        catch(Exception e)
        {
        }
    }

    private static void File_creation(String s)
    {
        String file="C:\\Mall_Marketing\\";
        try
        {
            File create = new File(file);
            boolean iscreated = create.mkdirs();

            if(iscreated)
            {
                System.out.printf("\nSuccessfully created : "+create.getCanonicalPath());
                hide(file);
            }
            File f = new File(file+s+".txt");
            iscreated = f.createNewFile();

            fileo=f.getAbsolutePath();
            if (iscreated) 
            {
                System.out.printf("\nSuccessfully created new file, path:%s",f.getCanonicalPath());
                if(s.equals("Array"))
                {
                    writer(false);
                    hide(file+s+".txt");
                }
                else if(s.equalsIgnoreCase("Quantities_temp_taken"))
                {
                    quantity_temp_writer(false);
                    hide(file+s+".txt");
                }
                else if(s.equals("User"))
                {
                    FileWriter fw = new FileWriter(file+s+".txt");
                    BufferedWriter br = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(br);
                    pw.println("Administrator\nAditya Zeus");
                    pw.close();
                    br.close();
                    fw.close();
                    hide(file+s+".txt");
                }
                else if(s.equalsIgnoreCase("Passwords"))
                {
                    FileWriter fw = new FileWriter(file+s+".txt");
                    BufferedWriter br = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(br);
                    pw.println("Administrator\nAditya Zeus Company");
                    pw.close();
                    br.close();
                    fw.close();

                    hide(file+s+".txt");
                }
            }
        }
        catch(Exception e)
        {
        }
    }

    private static void hide(String file)throws Exception
    {
        Path p = Paths.get(file);
        DosFileAttributes dos = Files.readAttributes(p, DosFileAttributes.class);
        Files.setAttribute(p, "dos:hidden", true);
        //         System.out.println(dos.isHidden());
    }

    private static void unhide(String file)throws Exception
    {
        Path p = Paths.get(file);
        DosFileAttributes dos = Files.readAttributes(p, DosFileAttributes.class);
        Files.setAttribute(p, "dos:hidden", false);
        //         System.out.println(dos.isHidden());
    }

    public void actionPerformed(ActionEvent a)
    {
        String cmd=a.getActionCommand();
        if(cmd.equalsIgnoreCase("Exit"))
        {
            System.exit(0);
        }
    }

    public void itemStateChanged(ItemEvent it)
    {
        a=String.valueOf(it.getItem());
        display.setText(a);
        repaint();
        String cmd=String.valueOf(it.getItem());

        if(cmd.equalsIgnoreCase("Modify"))
        {
            dispose();
            Password pa=new Password();
            pa.main(null);
        }
        if(cmd.equalsIgnoreCase("Hello Customer"))
        {
            dispose();
            CustomerDetail cd = new CustomerDetail();
            cd.main(null);
        }
        if(cmd.equalsIgnoreCase("Status"))
        {
            Status s = new Status();
            s.main();
        }
    }

    protected static boolean search(String ar[],String s)
    {
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x].equalsIgnoreCase(s))
            {
                Truth=x;
                return true;
            }
        }
        return false;
    }

    public static void writer(boolean b)throws Exception
    {
        FileWriter f ;
        try
        {
            f= new FileWriter(fileo);
        }
        catch(Exception e)
        {
            f=new FileWriter(fileo);
        }
        BufferedWriter br =new BufferedWriter(f);
        PrintWriter pw = new PrintWriter(br);
        if(b)
        {
            for(int in=0;in<item.length;in++)
                pw.println(in+1+"\t"+item[in]+"\t"+item_price[in]+"\t"+item_code[in]+"\t"+item_quantity[in]);

            //pw.println(in+1+"\t"+item[in]+tabadder(3-reqtab(item[in]),item[in])+item_price[in]+"\t\t\t\t"+item_code[in]+tabadder(2-reqtab(item_code[in]),item_code[in])+item_quantity[in]+tabadder(2-reqtab(item_quantity[in]+""),item_quantity[in]+""));
        }
        else
        {
            for(int in=0;in<Array_Market.item.length;in++)
                pw.println(in+1+"\t"+Array_Market.item[in]+"\t"+Array_Market.item_price[in]+"\t"+Array_Market.item_code[in]+"\t"+Array_Market.item_quantity[in]);
            // pw.println(in+1+"\t"+item[in]+tabadder(3-reqtab(item[in]),item[in])+item_price[in]+"\t\t\t\t"+item_code[in]+tabadder(2-reqtab(item_code[in]),item_code[in])+item_quantity[in]+tabadder(2-reqtab(item_quantity[in]+""),item_quantity[in]+""));
        }
        pw.close();
        br.close();
        f.close();
    }

    public static void read()throws Exception
    {
        UserID_Pass();
        FileReader fr;
        File_creation("Array");
        Scanner sc;
        try
        {
            fr=new FileReader(fileo);
            sc=new Scanner(fr);

            int n = count(fr);

            item=new String[n];

            item_code=new String[n];
            item_price=new double[n];
            item_quantity=new int[n];

            int in=0;
            while(sc.hasNextLine())
            {
                StringTokenizer st = new StringTokenizer(sc.nextLine(),"\t");
                String t=st.nextToken();
                item[in]=st.nextToken();
                item_price[in]=Double.valueOf(st.nextToken());
                item_code[in]=st.nextToken();

                item_quantity[in]=Integer.valueOf(st.nextToken());
                //System.out.println(in+1+"\t"+item[in]+tabadder(3-reqtab(item[in]),item[in])+item_price[in]+"\t\t\t\t"+item_code[in]+tabadder(2-reqtab(item_code[in]),item_code[in])+item_quantity[in]+tabadder(2-reqtab(item_quantity[in]+""),item_quantity[in]+""));

                in++;
            }
            sc.close();
            fr.close();
            quantity_temp_writer(false);
        }
        catch(NumberFormatException e1)
        {
            System.out.println(e1.getMessage()+"   NFE");
        }
        catch(Exception e)
        {
        }
    }

    private static int count(FileReader fr)throws Exception
    {
        fr=new FileReader(fileo);
        Scanner sc=new Scanner(fr);
        int c=0;
        while(sc.hasNextLine())
        {
            sc.nextLine();
            c++;
        }
        return c;
    }

    public static void temp_read()
    {
        FileReader fr;
        File_creation("Quantities_temp_taken");
        Scanner sc;
        try
        {
            fr=new FileReader(fileo);
            sc=new Scanner(fr);

            int n = count(fr);

            iqg=new String[n-1];
            icg=new String[n-1];
            ipg=new String[n-1];
            ing=new String[n-1];

            int in=0;
            sc.nextLine();
            while(sc.hasNextLine())
            {
                StringTokenizer st = new StringTokenizer(sc.nextLine(),"\t");
                iqg[in]=st.nextToken();
                ing[in]=st.nextToken();
                ipg[in]=st.nextToken();
                icg[in]=st.nextToken();

                //                 System.out.println(in+1+"\t"+iqg[in]+tabadder(3-reqtab(iqg[in]),iqg[in])+ing[in]+"\t\t\t\t"+ipg[in]+tabadder(2-reqtab(ipg[in]),ipg[in])+icg[in]+tabadder(2-reqtab(icg[in]+""),icg[in]+""));
                in++;
            }
            sc.close();
            fr.close();
        }
        catch(NumberFormatException e1)
        {
            System.out.println(e1.getMessage()+"   NFE");
        }
        catch(Exception e)
        {
        }
    }

    public static void quantity_temp_writer(boolean b)
    {
        FileWriter f ;
        File_creation("Quantities_temp_taken");
        try
        {
            unhide(fileo);
            if(b)
            {
                f= new FileWriter(fileo,true);
            }
            else
            {
                f= new FileWriter(fileo);
            }
            BufferedWriter br =new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(br);
            if(b)
            {
                pw.println(qut+"\t"+item[wq]+"\t"+item_price[wq]+"\t"+item_code[wq]);
            }
            else
            {
                pw.println("Quantities_taken\tItem\tItem_Price\tItem_Code");
            }

            pw.close();
            br.close();
            f.close();
            hide(fileo);
        }
        catch(Exception e)
        {
        }
    }

    public static void UserID_Pass()
    {
        File_creation("User");
        FileReader f;
        try
        {
            f = new FileReader(fileo);
            Scanner sc = new Scanner(f);
            int n=count(f);
            UserId=new String[n];
            n=0;
            while(sc.hasNextLine())
            {   
                UserId[n++]=sc.nextLine();
            }

            File_creation("Passwords");
            f = new FileReader(fileo);
            sc = new Scanner(f);
            n=count(f);
            password=new String[n];
            n=0;
            while(sc.hasNextLine())
            {   
                password[n++]=sc.nextLine();
            }
        }
        catch(Exception e)
        {
        }
    }

    private static String tabadder(int n,String s)
    {
        String t="";
        int l=s.length();
        for(int x=1;x<=8-l;x++)
        {
            t=t+" ";
        }

        for(int x=0;x<n;x++)
        {
            t=t+"\t";
        }
        return t;
    }

    private static int reqtab(String s)
    {
        return s.length()>=16 ? (s.length()/8) - 1 :0;
    }
}