package school;
class temp extends Array_Market
{
    private static String tabadder(int n)
    {
        String t="";
        for(int x=0;x<n;x++)
        {
            t=t+"\t";
        }
        return t;
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

    public static void see()
    {
        System.out.print("\f");
        System.out.println("name of the customer : Aditya");
        System.out.println("phone number of Aditya : 9415601973");
        System.out.println("address of Aditya : 467/5/2A Ramanad Nagar Allahapur,Allahabad");
        System.out.println("Sl.No\tItem Name\t\t\tProduct Price\t\t\tProduct Code\t\tNumber of quantities\t\tEnter the quantity");
        for(int in=0;in<30;in++)
            System.out.println(in+1+"\t"+item[in]+tabadder(3-reqtab(item[in]),item[in])+item_price[in]+"\t\t\t\t"+item_code[in]+tabadder(2-reqtab(item_code[in]),item_code[in])+item_quantity[in]+tabadder(2-reqtab(item_quantity[in]+""),item_quantity[in]+"")+"\t");
    }

    public static void main(String args [])
    {
        System.out.println("{");
        for(int x=1;x<=30;x++)
        {
            System.out.print("\"\"");
            if(x!=30)
                System.out.print(",");
            if(x%5==0 && x!=30)
            {
                System.out.println();
            }
        }
        System.out.println("\n}");
    }
}