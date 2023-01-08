import java.util.*;
class Special_Number
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");int n=sc.nextInt();
        int s=0;
        for(int x=n;x!=0;x=x/10)
        {
            int d=x%10,f=1;
            for(int y=1;y<=d;y++)
            {
                f=f*y;
            }
            s=s+f;
        }
        if(n==s)
        {
            System.out.println("Special Number");
        }
        else
        {
            System.out.println("Not a Special Number");
        }
    }
}