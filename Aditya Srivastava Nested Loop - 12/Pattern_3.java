import java.util.*;
class Pattern_3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of matrix");
        int n=sc.nextInt();
        for(int x=1;x<=n;x++)
        {
            for(int y=1;y<=n;y++)
            {
                if(x==y || x+y==n+1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}