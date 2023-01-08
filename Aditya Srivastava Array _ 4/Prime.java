import java.util.*;
class Prime
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for(int x=0;x<a.length;x++)
        {
            System.out.println("Enter Number "+(x+1));int p=sc.nextInt();            
            a[x]=p;
            sc.nextLine();
        }

        int c=0;
        for(int x=0;x<a.length;x++)
        {
            int l=0;
            for(int y=1;y<=a[x];y++)
            {
                if(a[x]%y==0)
                {
                    l++;
                }
            }
            if(l==2)
            {
                c++;
            }
        }

        System.out.println(c+" Prime Numbers");
    }
}