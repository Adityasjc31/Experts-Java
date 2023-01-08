package school;
class Detail_Display extends Array_Market
{
    public static void AnyClose()throws Exception
    {
        writer(true);
        Close();
    }

    public static void Choice()
    {
        System.out.println("If you want to change price type \"item price\"\nIf you want to change quantity type \"item quantity\"\nIf you want to change items type \"item\"\nIf you want to change item code type\"item code\"");
    }

    public static void Bill_Display()
    {
        System.out.print("\f");
        startline();
        System.out.println("name of the customer : "+name);
        System.out.println("phone number of "+name+" : "+ph_no);
        System.out.println("address of "+name+ " : "+address);
        line();
        System.out.println("Sl.No\tItem Code\t\t\tProduct Price\t\t\tProduct Name\t\tNumber of quantities taken\t\t");
        for(int x=0;x<print.length;x++)
        {
            if(printbill[x]!=null)
            {
                System.out.println(printbill[x]);
            }
        }
    }

    public static void errorpass()throws Exception
    {
        System.out.print("Number of times you have give the wrong password : "+(n/30)+"\nWrong Password");
        for(int x=n;x>=0;x--)
        {
            Thread.sleep(x==n ? 2000 : 1000);
            System.out.print("\fThe program will resume after "+x+" seconds.");
        }
        n=n*2;
    }

    public static void itemdetail(int in)
    {
        if(in!=-1)
        {
            System.out.println("Item Code : "+item_code[in]);
            System.out.println("Item Name : "+item[in]);
            System.out.println("Item Price(per) : "+item_price[in]);
            System.out.println("Item in your stock : "+item_quantity[in]);
        }
        line();
    }

    public static void Close()throws Exception
    {
        int c=0,c1=1;String t=".";
        while(c<=6)
        {
            System.out.print("\fSee you Later"+t);
            Thread.sleep(200);
            if(c1==3)
            {
                c1=0;
                t=".";
            }
            else
            {
                t=t+'.';
            }
            c++;
            c1++;
        }
        System.out.print("\f");
        System.exit(100);
    }

    public static void Restarting()throws Exception
    {
        System.out.println("Wrong Input\nProgram will restart after");
        for(int x=30;x>=0;x--)
        {
            Thread.sleep(1000);
            System.out.print("\fThe program will restart after "+x+" seconds.");
        }
        int c=0,c1=1;String t=".";
        while(c<=25)
        {
            System.out.print("\fRestarting"+t);
            Thread.sleep(500);
            if(c1==3)
            {
                c1=0;
                t=".";
            }
            else
            {
                t=t+'.';
            }
            c++;
            c1++;
        }
    }

    public static void Modify()throws Exception
    {
        int c=0,c1=1;String t=".";
        while(c<=25)
        {
            System.out.print("\fModifing"+t);
            Thread.sleep(200);
            if(c1==3)
            {
                c1=0;
                t=".";
            }
            else
            {
                t=t+'.';
            }
            c++;
            c1++;
        }
        System.out.print("\fModified.......\n");
    }

    public static void startline()
    {
        for(int x=0;x<=18;x++)
        {
            System.out.print("---");
            if(x==19/2)
            {
                System.out.print("||World of AS(Aditya Srivastava)||");
            }
            int c=0;
            if(x%5==0 && x!=0)
            {
                System.out.print("AS");
            }
            while(c<=30000000)
            {
                c++;
            }
        }
        System.out.println("--");
    }

    public static void line()
    {
        String h="";
        if(!lm)
        {
            h="--------------------";
        }
        for(int x=0;x<=30;x++)
        {
            System.out.print("---"+h);
            int c=0;
            if(lm)
            {
                while(c<=30000000)
                {
                    c++;
                }
            }
        }
        System.out.println();
    }
}