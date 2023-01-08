import java.util.*;
class Magic_number
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");int n=sc.nextInt();
        while(n>=10)
        {
            int s=0;
            for(int y=n;y!=0;y=y/10)
            {
                int d=y%10;
                s=s+d;
            }
            n=s;
        }
        if(n == 1)
        {
            System.out.println("Magic Number");
        }
        else
        {
            System.out.println("Not a Magic Number");
        }
    }
}