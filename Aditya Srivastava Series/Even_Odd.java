import java.util.*;
class Even_Odd
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int se=0,so=0,e=0,o=0;
        for(int x=1;x<=10;x++)
        {
            System.out.println("Enter "+x+" number");
            int n=sc.nextInt();
            if(n%2==0)
            {
                e++;
                se+=n;
            }
            else
            {
                o++;
                so+=n;
            }
        }
        if(e>0)
        {
            System.out.println("Sum of even numbers="+se);
            System.out.println("Average of even numbers="+(se/(double)e));
        }
        else
        {
            System.out.println("No even numbers");
        }
        if(o>0)
        {
            System.out.println("Sum of odd numbers="+so);
            System.out.println("Average of odd numbers="+(so/(double)o));
        }
        else
        {
            System.out.println("No odd numbers");
        }
    }
}