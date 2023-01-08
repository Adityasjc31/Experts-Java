import java.util.*;
class players
{
    public static void three(int arr [])
    {
    }

    public static void main(String args [])
    {
        int a[] = new int[11];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter runs of player "+(i+1));
            int n1=sc.nextInt();
            a[i]=n1;
        }
        System.out.print("\f");
        System.out.println("Given Runs : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
            if(i<(a.length)-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("");

        int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=100)
            {
                c++;
            }
        }
        System.out.println("Number of centuries : "+c);
    }
}