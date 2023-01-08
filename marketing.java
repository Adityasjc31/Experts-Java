import java.util.*;
class marketing
{
    static double pr[]=new double[30];
    static String ar1[]=new String[30];
    static String ar2[]=new String[30];
    static int ar3[]=new int[30];
    static int inp[]=new int[30];
    static String stok[]={"pencil","pen","t-shirt","book","box","tiffin","bag","wheat","rice","flour","millet","chips","fruits","juice","socks","shoes","jeans","pants","slipper","jacket","handbag","belts","toys","carpet","bottles","mobile","laptop","CDs","watch","eggs"};
    static String code[]={"AA1","AA2","AA3","AA4","AA5","AA6","AA7","AA8","AA9","BB1","BB2","BB3","BB3","BB5","BB6","BB7","BB8","BB9","CC1","CC2","CC3","CC4","CC5","CC6","CC7","CC8","CC9","DD1","DD2","DD3"};
    static int quan[]={100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100};
    static double price[]={20-0.1,10-0.1,250-0.1,200-0.1,50-0.1,100-0.1,500-0.1,300-0.1,70-0.1,50-0.1,90-0.1,150-0.1,120-0.1,65-0.1,30-0.1,500-0.1,600-0.1,3000-0.1,1300-0.1,900-0.1,250-0.1,350-0.1,200-0.1,400-0.1,500-0.1,250-0.1,9000-0.1,25000-0.1,6000-0.1,10-0.1};
    public static int ind(String s)
    {
        char ch=s.charAt(0);
        if(ch>='a'&&ch<='z')
        {
            for(int i=0;i<30;i++)
            {
                if(stok[i].equals(s))
                {
                    return i;
                }
            }
        }
        else if(ch>='A'&&ch<='Z')
        {
            for(int i=0;i<30;i++)
            {
                if(code[i].equals(s))
                {
                    return i;
                }
            }
        }
        return-1;
    }
    static String name="";
    static String num="";
    static String it="";
    static int sno[]=new int[30];
    public static void purchase(int f)
    {
        Scanner sc=new Scanner (System.in);
        int c=f;
        System.out.print("\f");
        System.out.println("\t\t\t\t ......WELCOME TO SUPER MARKET.....");
        System.out.println("S.no\t\tITEM NAME\t\tPRICE\t\tCODE\t\tQUANTITY");
        System.out.println("press 1 to stop billing else start purchasing and 's' any time to see item list");

        for(;!(it.equals("1"));)
        {

            it=sc.next();
            int inde=ind(it);

            if(it.equals("1"))
            {
                end();
                return;

            }
            else if(it.equalsIgnoreCase("s"))
            {

                show();
                purchase(c);
            }
            else if(inde==-1)
            {
                System.out.println("no such item kindly re-enter:");

                correct(c);
            }

            System.out.print("enter quantity:\t");
            inp[c-1]=sc.nextInt();
            correct2(it);

            ++c;
            System.out.print("\f");
            dis(it,c-1);

        }
    }

    public static void correct2(String s)
    {
        Scanner sc=new Scanner (System.in);
        int in=ind(s);int i;
        for( i=0;i<30;i++)
        {
            if(inp[i]>quan[in])
            {
                System.out.println("we have only: "+quan[i]+"\nenter again");
                inp[i]=sc.nextInt();

            }
        }
    }

    public static void end()
    {
        dis2();
        System.out.println("\t\t\t\t\t...THANKS FOR SHOPPING...");
    }

    public static void dis(String s,int d)
    {

        Scanner sc=new Scanner (System.in);
        String it="";int c=d;String g;
        int ic=ind(s);
        
        ar1[d-1]=s;
        g=stok[ic];
        ar2[d-1]=g;
        ar3[d-1]=quan[ic];
        pr[d-1]=price[ic];
        sno[d-1]=d;
        System.out.println("\t\t\t\t ......WELCOME TO SUPER MARKET......");
        star();
        System.out.println("CUSTOMER NAME:\t"+name+"\nMOBILE NUMBER:\t"+num);
        System.out.println("S.no\tITEM NAME\tPRICE\tCODE\tQUANTITY\t YOUR QUANTITY\tAMOUNT");
        star();
        for(int j=0;sno[j]!=0;j++)
        {
            double p=inp[j]*pr[j];
            System.out.println(+sno[j]+"\t"+ar2[j]+"\t\t"+pr[j]+"\t"+ar1[j]+"\t"+ar3[j]+"\t\t  "+inp[j]+"\t\t"+(p));

        }
        star();
        tot();
    }

    public static void dis2()
    {
        System.out.print("\f");

        System.out.println("\t\t\t\t ......WELCOME TO SUPER MARKET......");
        System.out.println("CUSTOMER NAME:\t"+name+"\nMOBILE NUMBER:\t"+num);
        star();
        System.out.println("S.no\tITEM NAME\tPRICE\tCODE\tQUANTITY\t YOUR QUANTITY \t\tAMOUNT");
        star();
        for(int j=0;sno[j]!=0;j++)
        {
            double p=inp[j]*pr[j];
            System.out.println(+sno[j]+"\t"+ar2[j]+"\t\t"+pr[j]+"\t"+ar1[j]+"\t"+ar3[j]+"\t\t  "+inp[j]+"\t\t"+p);

        }
        star();
        tot();
    }

    public static void tot()
    {
        double to=0.0,gst=0.0,cgst=0.0;
        for(int i=0;i<inp.length;i++)
        {
            cgst=cgst+(3-0.1*inp[i]*pr[i])/100;
            gst=gst+(7-0.1*inp[i]*pr[i])/100;
            to=to+(inp[i]*pr[i]);
        }
        to+=gst+cgst;
        System.out.println("\t\t\t\t\t\t\t\t\tCGST= Rs "+gst+"\n\t\t\t\t\t\t\t\t\tSGST= Rs "+cgst+"\n\t\t\t\t\t\t\t\t\tGRAND TOTAL =Rs "+to);
    }

    public static void star()
    {
        System.out.println();
        for(int i=1;i<=150;i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void correct(int p)
    {
        Scanner sc=new Scanner (System.in);
        String scd=sc.next();
        if(scd.equals("s"))
        {
            show();
            System.out.println("re enter");
            correct(p);
        }
        else
        {
            System.out.print("\f");
            it=scd;
            dis(scd,p);
        }
    }

    public static void show()
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("\f");
        System.out.println("\t\t\t\t\tAVALIBILITY OF ITEMS");
        System.out.println("S.no\t\tITEMS\t\tCODE\t\tPRICE\t\tQUANTITY");
        for(int i=0;i<=29;i++)
        {
            System.out.println((i+1)+"\t\t"+stok[i]+"\t\t"+code[i]+"\t\t"+price[i]+"\t\t"+quan[i]);
        }
        System.out.println("press any key to continue");
        String s=sc.next();
    }
     static int m=1,n;
    public static void cho()
    {
        System.out.println("\t\t\t\t ......WELCOME TO SUPER MARKET......");        
        Scanner sc=new Scanner (System.in);
        if(m==1)
        {
            System.out.println("PRESS 1 FOR MODIFICATION \nPRESS 'S' TO SEE ITEM LIST \nPRESS 3 TO PURCHASE");
             n=sc.nextInt();
             m++;
        }
        if(n==1)
        {
        }
        else if(n==2)
        {
            show();
        }
        else if(n==3)
        {
            System.out.print("\f");
        System.out.println("\t\t\t\t ......WELCOME TO SUPER MARKET......");            
            System.out.println("Enter customer name");
            name=sc.next();
            System.out.print("\f");
                    System.out.println("\t\t\t\t ......WELCOME TO SUPER MARKET......");
            System.out.println("Enter mobile number");
            num=sc.next();
            purchase(1);
        }
        else
        {
            System.out.print("\f");
            System.out.println("\t\t\t\t ......WELCOME TO SUPER MARKET......");
            System.out.println("WRONG CHOICE\nENTER CORRECT CHOICE");
            n=sc.nextInt();
            cho();
        }
    }
        public static void main(String args[])
        {

        cho();
    }
}


