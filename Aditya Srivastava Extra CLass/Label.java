import java.util.*;
class Label
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");int n=sc.nextInt();
        outer:
        for(int x=0;x<=n;x++)
        {
            inner:
            for(int y=1;y<=x;y++)
            {
                if(x==40)
                {
                    break outer;
                }
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}