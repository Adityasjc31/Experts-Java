import java.util.*;
class Factors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");int n=sc.nextInt();
        System.out.println("Factors are : ");
        for(int x=1;x<=n;x++)
        {
            if(n%x==0)
            {
                System.out.println(x);
            }
        }
    }
}