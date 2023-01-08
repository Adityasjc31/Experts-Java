import java.util.*;
class Common_Factors_Long
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");int a=sc.nextInt();
        System.out.println("Enter 2nd Number");int b=sc.nextInt();
        int c=a<b?a:b;System.out.print("Common Factors are :");
        for(int x=1;x<=c;x++)
        {
            if(a%x==0 && b%x==0)
            {
                System.out.print(x);

                System.out.print(",");

            }
        }
    }
}