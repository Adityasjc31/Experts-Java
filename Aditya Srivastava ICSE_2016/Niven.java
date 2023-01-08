class Niven extends A
{
    public static void main(String args [])
    {
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int s=0;
        for(int x=n;x!=0;x/=10)
        {
            s+=(s%10);
        }
        if((n%9)==0)
        {
            System.out.println("Niven Number");
        }
        else
        {
            System.out.println("Not a Niven Number");
        }
    }
}