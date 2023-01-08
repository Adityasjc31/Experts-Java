class Q8 extends A
{
    public static void main(String args [])
    {
        System.out.println("Menu\n1 - Term Deposit\n2 - Recurring Deposit\nEnter your Choice");
        int ch=sc.nextInt();

        switch(ch)
        {
            case 1 :
            {
                System.out.println("Enter Principal Amount");
                long p=sc.nextLong();
                System.out.println("Enter Rate of Interest");
                double r=sc.nextDouble();
                System.out.println("Enter Time period(in months)");
                int n=sc.nextInt();
                System.out.println("Enter Maturity Amount");
                double m=sc.nextDouble();

                double ma=0.0;
                ma=m-(p*(1+(Math.pow(r/100,n))));

                System.out.println("Receving Amount : "+ma);
            }
            break;

            case 2 :
            System.out.println("Enter Monthly Installment");
            long p=sc.nextLong();
            System.out.println("Enter Rate of Interest");
            double r=sc.nextDouble();
            System.out.println("Enter Time period(in months)");
            int n=sc.nextInt();
            double A = (p*n) +((p*(n*((n+1)/2.0))*(r/100.0)*(1/12)));
            System.out.println("Receving Amount  : "+A);
            break;

            default:
            System.out.println("Wrong Choice");
        }
    }
}