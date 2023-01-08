import java.util.*;
class Odd_Even
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int o=0,e=0;
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter "+(i+1)+" Number");
            int m=sc.nextInt();
            if(m%2==0)
            {
                e=e+m;
            }
            else 
            {
                o=o+m;
            }
        }
        System.out.println("Sum of Odd Number are = "+o);
        System.out.println(" Sum of Even Number are = "+e);
    }
}