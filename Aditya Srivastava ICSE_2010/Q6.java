class Q6 extends A
{
    public void compute()
    {
        for(int x=1 ;x<=15 ;x++)
        {
            System.out.println("Enter name "+x+" :");
            String n=sc.nextLine();
            System.out.println("Enter the amount ");int m=sc.nextInt();
            double amt=0.0,d=0;
            if(m>70000)
            {
                d=18.0;
            }
            else if(m>=55001 && m<=70000)
            {
                d=16.0;
            }
            else if(m>=35001 && m<=55000)
            {
                d=12.0;
            }
            else if(m>=25001 && m<=35000)
            {
                d=10.0;
            }
            else if(m<25001)
            {
                d=2.0;
            }
            amt=(d/100.0)*m;
            System.out.println("Sl.No.\tName\tTicket chargers\tDiscount\tNet Amount");
            System.out.print(x+"\t\t"+n+"\t\t"+m+"\t\t    "+d+"\t\t"+"\t\t"+amt);
        }
    }
}