import java.util.*;
class Pattern_6
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of one line");
        int n=sc.nextInt();
        for(int x=1;x<=n*2-1;x++)
        {      
            for(int y=1;y<=n*2-1;y++)
            {
                if(x+y==n+1 || x+y==3*n-1 || y-x==n-1 || x-y==n-1 )
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