package school;
import java.util.*;
class Customer_Detail extends Array_Market
{
    private static int qua;
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

    public static void product_price_Code(int c)throws Exception
    {
        System.out.print("\f");
        System.out.println("name of the customer : "+name);
        System.out.println("phone number of "+name+" : "+ph_no);
        System.out.println("address of "+name+ " : "+address);
        System.out.println("Sl.No\tItem Code\t\t\tProduct Price\t\t\tProduct Name\t\tNumber of quantities\t\tEnter the quantity");
        print[d]=(c+"\t"+item_code[in]+tabadder(3-reqtab(item_code[in]),item_code[in])+item_price[in]+"\t\t\t\t"+item[in]+tabadder(2-reqtab(item[in]),item[in])+item_quantity[in]+tabadder(2-reqtab(item_quantity[in]+""),item_quantity[in]+"")+"\t");
        for(int x=0;x<=d;x++)
        {
            if(print[x]!=null)
            {
                System.out.print(print[x]);
            }
            else 
            {
                break;
            }
            if(x<d)
            {
                System.out.println();
            }
            if(x==d && item_quantity[in]>0)
            {
                String xy=new Scanner(System.in).nextLine();
                if(xy.equalsIgnoreCase("quit"))
                {
                    Detail_Display.AnyClose();
                }
                qua=Integer.parseInt(xy);
                if(item_quantity[in]-qua<0)
                {
                    System.out.print("Wrong Input\nEnter the quantity again : ");
                    xy=new Scanner(System.in).nextLine();
                    if(xy.equalsIgnoreCase("quit"))
                    {
                        Detail_Display.AnyClose();
                    }
                    qua=Integer.parseInt(xy);
                    if(item_quantity[in]-qua<0)
                    {
                        Detail_Display.Restarting();
                        b=false;
                        for(int y=0;y<30;y++)
                        {
                            print[y]=null;
                            printbill[y]=null;
                        }
                    }
                }
                print[d]=(c+"\t"+item_code[in]+tabadder(3-reqtab(item_code[in]),item_code[in])+item_price[in]+"\t\t\t\t"+item[in]+tabadder(2-reqtab(item[in]),item[in])+item_quantity[in]+tabadder(2-reqtab(item_quantity[in]+""),item_quantity[in]+"")+"\t"+qua);
                printbill[d]=(c+"\t"+item_code[in]+tabadder(3-reqtab(item_code[in]),item_code[in])+item_price[in]+"\t\t\t\t"+item[in]+tabadder(2-reqtab(item[in]),item[in])+"\t"+qua);
            }
        }
        d++;
    }

    public static void input()throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the customer : ");name=sc.nextLine();

        if(name.equalsIgnoreCase("quit"))
        {
            Detail_Display.AnyClose();
        }
        System.out.print("Enter phone number of "+name+" : ");ph_no=sc.nextLine();

        if(ph_no.equalsIgnoreCase("quit"))
        {
            Detail_Display.AnyClose();
        }
        System.out.print("Enter address of "+name+ " : ");address=sc.nextLine();

        if(address.equalsIgnoreCase("quit"))
        {
            Detail_Display.AnyClose();
        }
        String hold="";int c=1;
        System.out.println("Sl.No\tItem Code\t\tProduct Price\t\tProduct Name\t\t\tNumber of quantities\t");
        do
        {
            if(c!=1 && b)
            {
                System.out.print("Type yes if you want to give more items else type no : ");hold=sc.nextLine();

                if(hold.equalsIgnoreCase("quit"))
                {
                    Detail_Display.AnyClose();
                }
            }

            if(!hold.equalsIgnoreCase("no"))
                System.out.print(c+"\t");

            if(!hold.equalsIgnoreCase("no") && b)
            {
                String itname=sc.nextLine();
                if(itname.equalsIgnoreCase("quit"))
                {
                    Detail_Display.AnyClose();
                }
                in=Modify_Market.BinarySearch(itname);
                if(in>=0)
                {
                    product_price_Code(c);
                    if(b && item_quantity[in]>0)
                    {
                        bill=qua*item_price[in]+bill;
                        item_quantity[in]-=qua;
                        c++;
                    }
                    else if(b && item_quantity[in]<=0)
                    {
                        System.out.print("\nThe quantity of product is 0");
                        for(int z=0;z<=10;z++){Thread.sleep(500);}
                        return ;
                    }
                    else
                    {
                        return ;
                    }
                }
                else
                {
                    System.out.println("No such item in the store "+itname);
                }
            }
        }while(!hold.equalsIgnoreCase("no"));
    }
}