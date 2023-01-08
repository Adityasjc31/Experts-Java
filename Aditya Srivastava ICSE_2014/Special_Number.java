class Special_Number extends A
{
    public static void main(String args [])
    {
        System.out.println("Enter Two-Digit Number");int n=sc.nextInt();
        int s=0;
        if(n>9 && n<100)
        {
            for(int x=n;x!=0;x=x/10)
            {
                int d=x%10,f=1;
                for(int y=1;y<=d;y++)
                {
                    f=f*y;
                }
                s=s+f;
            }
        }
        if(n==s)
        {
            System.out.println("Two-Digit Special Number");
        }
        else
        {
            System.out.println("Not a Two-Digit Special Number");
        }
    }
}