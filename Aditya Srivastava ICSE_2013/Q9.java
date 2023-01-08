import java.util.*;
class Q9
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu\n1 - Composite Number\n2 - Smallest Digit\nEnter your Choice");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:
            System.out.println("Enter a number");int n1=sc.nextInt();
            for(int x=2;x<n1;x++)
            {
                if(x%n1==0)
                {
                    System.out.print(x+",");
                }
            }
            break;
            
            case 2:
            System.out.println("Enter a number");
            int n2=sc.nextInt(),big=n2%10;
            for(int x=n2;x!=n2;x/=10)
            {
                int d=n2%10;
                if(big>d)
                {
                    big=d;
                }
            }
            System.out.println("Smallest Number : "+big);
            break;
            
            default:
            System.out.println("Wrong Choice");
        }
    }
}