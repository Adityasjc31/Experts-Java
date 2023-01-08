import java.util.*;
class Palindrome
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter a number");ar[x]=sc.nextInt();
        }
        
        boolean f=true;
        for(int x=0;x<ar.length;x++)
        {
            int r=0;
            for(int y=ar[x];y!=0;y=y/10)
            {
                r=10*r+y;
            }
            if(r==ar[x])
            {
                f=false;break;
            }
        }

        if(f)
        {
            System.out.println("All are Palindrome");
        }
        else
        {
            System.out.println("All Numbers are not palindrome");
        }
    }
}