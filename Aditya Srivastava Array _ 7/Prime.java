import java.util.*;
class Prime
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        int s=0;
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter number "+(x+1));
            ar[x]=sc.nextInt();
        }
        for(int x=0;x<ar.length;x++)
        {
            boolean p=true;
            for(int y=2;x<ar[x]/2;y++)
            {
                if(ar[x]%y==0)
                {
                    p=false;break;
                }
            }
            if(p && ar[x]>s)
            {
                s=ar[x];
            }
        }
        System.out.println("The Biggest Prime Number is : "+s);
    }
}