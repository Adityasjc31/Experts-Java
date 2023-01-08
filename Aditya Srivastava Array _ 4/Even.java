import java.util.*;
class Even
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[20];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter any number "+(x+1));int p=sc.nextInt();
            ar[x]=p;
            sc.nextLine();
        }
        boolean f=false;
        int b=0;
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x]%2==0&&ar[x]>b)
            {
                b=ar[x];f=true;
            }
        }
        if(f==true)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println("0");
        }
    }
}