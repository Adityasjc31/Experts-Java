class Display
{
    public static void display(long x,int n)
    {
        String s="";
        CountDigits t = new CountDigits();
        CountDigits.n=n;
        t.countDigits();
        for(int i=0;i<CountDigits.c;i++)
        {
            s=s+" ";
        }
        System.out.print(n);
        System.out.print("∣");
        System.out.println((int)x);
        System.out.println(s+"¯¯¯");
    }

    public static void display(long x , int r ,int n)
    {
        String s="";
        CountDigits t = new CountDigits();
        CountDigits.n=n;
        t.countDigits();
        for(int i=0;i<CountDigits.c;i++)
        {
            s=s+" ";
        }
        System.out.print(n);
        System.out.print("∣");
        System.out.println((int)x+"\t"+r);
        System.out.println(s+"¯¯¯");
    }
}