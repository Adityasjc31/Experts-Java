import java.util.*;
class Flag
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");int n=sc.nextInt();boolean prime=true;
        for(int x=2;x<=n/2;x++)
        {
            if(n%x==0)
            {
                prime=false;
                break;
            }
        }
        if(prime==true)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}