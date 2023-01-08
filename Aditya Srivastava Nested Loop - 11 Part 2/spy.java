import java.util.*;
class spy
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a smaller Number");
        int a=sc.nextInt();
        System.out.println("Enter a bigger number");
        int b=sc.nextInt();
        System.out.println("Spy numbers are :");
        for(int y=a;y<=b;y++)
        {
            int s=0,p=1;
            for(int x=y;x!=0;x=x/10)
            {
                int d = x%10;
                s=s+d;
                p=p*d;
            }
            if(p==s)
            {
                System.out.println(y);
            }
        }
    }
}