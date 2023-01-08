class Q5 extends A
{
    public static void main(String args [])
    {
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int s=0,p=1;
        for(int x=n ; x!=0 ; x/=10)
        {
            int d=x%10;
            s=s+d;
            p=p*d;
        }
        if(s==p)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not a Spy Number");
        }
    }
}