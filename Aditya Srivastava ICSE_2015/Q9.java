class Q9 extends S
{
    public static void main(String args [])
    {
        System.out.println("Menu\n1 - To see a factor of a given Number\n2 - To see a factorial of a given Number\nEnter your Choice");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
            System.out.println("Enter a number");
            int f=sc.nextInt();
            System.out.println("Factors are :");
            for(int x=1;x<f/2;x++)
            {
                if(f%x==0)
                {
                    System.out.print(x);
                    if(x<f)
                    System.out.print(',');
                }
            }
            break;

            case 2:
            System.out.println("Enter a number");
            int fl=sc.nextInt();
            int s=1;
            for(int x=1;x<=fl;x++)
            {
                s=s*x;
            }
            System.out.println("The Factorial of the "+fl+" = "+s);
            break;

            default:
            System.out.println("Wrong Choice");
        }
    }
}