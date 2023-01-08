package school;

import java.util.*;
class Status_See extends Array_Market 
{
    public static String tabadder(int n,String s)
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

    public static int reqtab(String s)
    {
        return s.length()>=16 ? (s.length()/8) - 1 :0;
    }

    public static void Status()throws Exception
    {
        System.out.println("Sl.No\tItem Name\t\t\tProduct Price\t\t\tProduct Code\t\tNumber of quantities");
        for(int in=0;in<30;in++)
            System.out.println(in+1+"\t"+item[in]+tabadder(3-reqtab(item[in]),item[in])+item_price[in]+"\t\t\t\t"+item_code[in]+tabadder(2-reqtab(item_code[in]),item_code[in])+item_quantity[in]+tabadder(2-reqtab(item_quantity[in]+""),item_quantity[in]+""));
        System.out.println("Press any key to continue");
        String m=new Scanner(System.in).nextLine();
        if(m.equalsIgnoreCase("quit"))
        {
            Detail_Display.AnyClose();
        }
    }
}