package school;

import static javax.swing.GroupLayout.Alignment.BASELINE;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
class Modify_Market extends Reaiter implements ItemListener
{
    public Modify_Market(boolean b)
    {}

    public void itemStateChanged(ItemEvent e) 
    {
        super.a="Modify";
        if(itn.isSelected()&& e.getSource()==itn)
        {
            Name.main(null);
        }
        else if(itp.isSelected() && e.getSource()==itp)
        {
            Name.main(null);
            Price.main(null);
        }
        else if(itc.isSelected()&& e.getSource()==itc)
        {
            Name.main(null);
            Code.main(null);
        }
        else if(itq.isSelected() && e.getSource()==itq)
        {
            Name.main(null);
            Quantity.main(null);
        }
        try{
        writer(true);}catch(Exception e1){}
    }

    public Modify_Market()
    {
        modifier();
    }

    void createLayout(JComponent... arg)
    {
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addComponent(arg[0])
            .addComponent(arg[1])
            .addComponent(arg[2])
            .addComponent(arg[3])
        );

        gl.setVerticalGroup(gl.createParallelGroup(BASELINE)
            .addComponent(arg[0])
            .addComponent(arg[1])
            .addComponent(arg[2])
            .addComponent(arg[3])

        );
        gl.linkSize(itn,itp,itq,itc);

        pack();
    }

    public static void main(String[] args) 
    {
        Mall_Marketing.main(null);

        EventQueue.invokeLater(() ->
            {
                Modify_Market ex = new Modify_Market();
                ex.setVisible(true);
            }
        );
    }
    static JRadioButton itn,itp,itq,itc;
    ButtonGroup bg = new ButtonGroup();
    public void modifier()
    {
        itn = new JRadioButton("Item Name Modification", false);
        itn.addItemListener(this);

        itp = new JRadioButton("Item Price Modification", false);
        itp.addItemListener(this);

        itq = new JRadioButton("Item Quantities Modification", false);
        itq.addItemListener(this);

        itc = new JRadioButton("Item Code Modification", false);
        itc.addItemListener(this);

        setResizable(false);
        bg.add(itn);
        bg.add(itp);
        bg.add(itq);
        bg.add(itc);
        createLayout(itn,itp,itq,itc);
        setSize(780, 100);
        setTitle("Changes To Be Done in Items");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    static int BinarySearch(String t)
    {
        int b=item_code.length;
        int f=-1;
        for(int x=0;x<b;x++)
        {
            if(item_code[x].equalsIgnoreCase(t))
            {
                f=x;
                break;
            }
        }
        return f;
    }

    public static void whichModify()throws Exception
    {
        Detail_Display.line();
        Detail_Display.Choice();
        System.out.println("Enter what do you want to modify");
        String s=new Scanner(System.in).nextLine();
        if(s.equalsIgnoreCase("quit"))
        {
            Detail_Display.AnyClose();
        }
        Detail_Display.line();
        if(s.equalsIgnoreCase("Item List") || s.equalsIgnoreCase("Items Lists") || s.equalsIgnoreCase("Items List") || s.equalsIgnoreCase("Item Lists")|| s.equalsIgnoreCase("Changes to me made in item list") || s.equalsIgnoreCase("Changes to be made in items lists")|| s.equalsIgnoreCase("Items") || s.equalsIgnoreCase("Item") || s.equalsIgnoreCase("Item Lists") || s.equalsIgnoreCase("Modify Item") || s.equalsIgnoreCase("Modify Item List") || s.equalsIgnoreCase("Modify Item Lists") || s.equalsIgnoreCase("Modification of Item")  || s.equalsIgnoreCase("Modification of Item Lists")  || s.equalsIgnoreCase("Modification of Item List"))
        {
            System.out.println("You Need Admin Rights to continue type the password");
            String t=new Scanner(System.in).nextLine();
            if(t.equalsIgnoreCase("quit"))
            {
                Detail_Display.AnyClose();
            }
            if(t.equals(password1))
            {
                modifyList();
            }
            else 
            {
                Detail_Display.errorpass();
                System.out.print("\f");
            }
        }
        else if(s.equalsIgnoreCase("Item price") || s.equalsIgnoreCase("Item prices") || s.equalsIgnoreCase("Items price") || s.equalsIgnoreCase("Items prices")|| s.equalsIgnoreCase("Changes to be made in item price") || s.equalsIgnoreCase("Changes to be made in items prices")|| s.equalsIgnoreCase("Items") || s.equalsIgnoreCase("Item") || s.equalsIgnoreCase("Item prices") || s.equalsIgnoreCase("Modify Item") || s.equalsIgnoreCase("Modify Item price") || s.equalsIgnoreCase("Modify Item prices") || s.equalsIgnoreCase("Modification of Item")  || s.equalsIgnoreCase("Modification of Item prices")  || s.equalsIgnoreCase("Modification of Item price"))
        {
            modifyprices();
        }
        else if(s.equalsIgnoreCase("Item quantity") || s.equalsIgnoreCase("number of items") || s.equalsIgnoreCase("number of item") || s.equalsIgnoreCase("number of Items") || s.equalsIgnoreCase("numbers of items")|| s.equalsIgnoreCase("Changes to be made in number of items") || s.equalsIgnoreCase("Changes to be made in numbers of items")|| s.equalsIgnoreCase("number of Items") || s.equalsIgnoreCase("number of Item") || s.equalsIgnoreCase("number of item") || s.equalsIgnoreCase("Modify Item") || s.equalsIgnoreCase("Modify number of items") || s.equalsIgnoreCase("Modify number of item") || s.equalsIgnoreCase("Modification of Item")  || s.equalsIgnoreCase("Modification of number of item")  || s.equalsIgnoreCase("Modification of number of items"))
        {
            modifyitemsnumber();
        }
        else if(s.equalsIgnoreCase("Item code") || s.equalsIgnoreCase("Item codes") || s.equalsIgnoreCase("Items code") || s.equalsIgnoreCase("Items codes")|| s.equalsIgnoreCase("Changes to be made in item code") || s.equalsIgnoreCase("Changes to be made in items codes")|| s.equalsIgnoreCase("Items") ||s.equalsIgnoreCase("Item codes") || s.equalsIgnoreCase("Modify Item") || s.equalsIgnoreCase("Modify Item code") || s.equalsIgnoreCase("Modify Item codes") || s.equalsIgnoreCase("Modification of Item")  || s.equalsIgnoreCase("Modification of Item codes")  || s.equalsIgnoreCase("Modification of Item code"))
        {
            modifycodes();
        }
        Detail_Display.line();
    }

    private static void modifycodes()throws Exception
    {
        Detail_Display.line();
        System.out.println("Enter the code of the item you want to modify");
        String t=new Scanner(System.in).nextLine();
        if(t.equalsIgnoreCase("quit"))
        {
            Detail_Display.AnyClose();
        }
        int f=-1;
        f=BinarySearch(t);
        boolean b=checkandreplacetheitem(f," item code ");
        if(b && p!=-1)
        {
            item_code[p]=tp;
        }
    }

    private static void modifyitemsnumber()throws Exception
    {
        Detail_Display.line();
        System.out.println("Enter the code of the item of whose prices you want to modify");
        String t=new Scanner(System.in).nextLine();
        if(t.equalsIgnoreCase("quit"))
        {
            Detail_Display.AnyClose();
        }
        int f=-1;
        f=BinarySearch(t);
        boolean b=checkandreplacetheitem(f," number of items ");
        if(b && p!=-1)
        {
            item_quantity[p]=(int)t2;
        }
    }

    private static void modifyprices()throws Exception
    {
        Detail_Display.line();
        System.out.println("Enter the code of the item of whose prices you want to modify");
        String t=new Scanner(System.in).nextLine();
        if(t.equalsIgnoreCase("quit"))
        {
            Detail_Display.AnyClose();
        }
        int f=-1;
        f=BinarySearch(t);
        boolean b=checkandreplacetheitem(f," price ");
        if(b && p!=-1 && t2!=-1)
        {
            item_price[p]=t2;
        }

    }

    private static void modifyList()throws Exception
    {
        Detail_Display.line();
        System.out.println("Enter the code of the item you want to modify");
        String t=new Scanner(System.in).nextLine();
        if(t.equalsIgnoreCase("quit"))
        {
            Detail_Display.AnyClose();
        }
        int f=-1;
        f=BinarySearch(t);
        boolean b=checkandreplacetheitem(f,"");
        if(b && p!=-1)
        {
            item[p]=t;
        }

    }

    private static boolean checkandreplacetheitem(int f,String s)throws Exception
    {
        Detail_Display.line();
        if(f!=-1)
        {
            String t1="";
            Detail_Display.itemdetail(BinarySearch(item_code[f]));
            if(s.equals(" item code "))
            {
                System.out.println("Enter the" +s+ " to be changed from "+item_code[f]+s+" : ");
                t1=new Scanner(System.in).nextLine();
                if(t1.equalsIgnoreCase("quit"))
                {
                    Detail_Display.AnyClose();
                }
                Detail_Display.Modify();
                item_code[f]=t1;
            }
            else if(s.equals(" number of items "))
            {
                System.out.println("Enter the" +s+ " to be changed from "+item_quantity[f]+s+" : ");
                t1=new Scanner(System.in).nextLine();
                if(t1.equalsIgnoreCase("quit"))
                {
                    Detail_Display.AnyClose();
                }
                Detail_Display.Modify();;
                item_quantity[f]+=Integer.parseInt(t1);
            }
            else if(s.equals(" price "))
            {
                System.out.println("Enter the item " +s+ " to be changed from "+item_price[f]+s+" : ");
                t1=new Scanner(System.in).nextLine();
                if(t1.equalsIgnoreCase("quit"))
                {
                    Detail_Display.AnyClose();
                }
                Detail_Display.Modify();
                item_price[f]=Double.parseDouble(t1);
            }
            else
            {
                System.out.print("Enter the item " +s+ " to be changed by \""+item[f]+s+"\" to : ");
                t1=new Scanner(System.in).nextLine();
                if(t1.equalsIgnoreCase("quit"))
                {
                    Detail_Display.AnyClose();
                }
                Detail_Display.Modify();
                item[f]=t1;
            }
            Detail_Display.itemdetail(BinarySearch(item_code[f]));
            for(int x=0;x<10;x++){Thread.sleep(1000);}
            return true;
        }
        else
        {
            return recheck(s);
        }
    }

    private static boolean recheck(String s)throws Exception
    {
        System.out.println("The information you have provided is wrong\nPlease provide correct information only");
        if(s.equalsIgnoreCase(""))
        {
            modifyList();
            return true;
        }
        else if(s.equalsIgnoreCase(" price "))
        {
            modifyprices();
            return true;
        }
        else if(s.equalsIgnoreCase(" item code "))
        {
            modifyitemsnumber();
            return true;
        }
        else if(s.equalsIgnoreCase(" number of items "))
        {
            modifycodes();
            return true;
        }
        else
        {
            return false;
        }
    }

    /*private static boolean adder(String t,String s)throws Exception
    {
    Detail_Display.line();
    String t1="",h="",ic="";double ip=0.0;int noc=0;
    if(s.equals(""))
    {
    System.out.println(t+" is not still in the mall\nif you wanted to add this "+t+" enter the position else press any key");
    t1=new Scanner(System.in).nextLine();
    }
    else
    {
    System.out.println(t+" is not still in the mall\nif you wanted to add this "+t+" First give the position of item \""+t+"\"\nelse press any key");
    h=new Scanner(System.in).nextLine();
    if(Character.isDigit(h.charAt(0)) && Integer.parseInt(h)>=1 && Integer.parseInt(h)<=30)
    {
    System.out.println("Enter password to add");
    t1=new Scanner(System.in).nextLine();
    if(t1.equals(password))
    {
    if(t1.length()!=0)
    {
    System.out.println("Enter the item code of "+t);
    ic=new Scanner(System.in).nextLine();

    System.out.println("Enter the price of "+t);
    ip=new Scanner(System.in).nextDouble();

    System.out.println("Enter the number of items of "+t);
    noc=new Scanner(System.in).nextInt();
    }
    }
    else
    {
    Detail_Display.errorpass();
    System.out.print("\f");
    }
    }
    else
    {
    Detail_Display.line();
    if(Integer.parseInt(h)>0)
    System.out.println("No Place to put items Store is already full you can only replace any item");
    else 
    System.out.println("Sorry !!! Try again");
    Detail_Display.line();
    }
    }
    if(t1.equals(password))
    {
    Detail_Display.Modify();;
    if(h.length()!=0 && Character.isDigit(h.trim().charAt(0)))
    {
    p=Integer.parseInt(h)-1;

    item[p]=ic;

    item_code[p]=t;

    item_price[p]=ip;

    item_quantity[p]=noc;

    Detail_Display.itemdetail(BinarySearch(t));
    return true;
    }
    else
    {
    return false;
    }
    }
    else
    {
    return false;
    }
    }*/
}