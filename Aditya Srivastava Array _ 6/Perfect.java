import java.util.*;
class Perfect
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter a number");ar[x]=sc.nextInt();
        }

        System.out.println("Perfect Numbers are : ");
        for(int x=0;x<ar.length;x++)
        {
            int r=0;
            for(int y=1;y<=ar[x]/2;y++)
            {
                if(ar[x]%y==0)
                {
                    r=r+y;
                }
            }
            if(r==ar[x])
            {
                System.out.println(ar[x]);
            }
        }
    }
}