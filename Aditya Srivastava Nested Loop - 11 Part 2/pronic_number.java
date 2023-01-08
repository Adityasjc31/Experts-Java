import java.util.*;
class pronic_number
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a smaller Number");
        int a=sc.nextInt();
        System.out.println("Enter a bigger number");
        int b=sc.nextInt();
        System.out.println("Pronic numbers are :");
        for(int x=a;x<=b;x++)
        {
            int y=1;
            while(y*(y+1)<x)
            {
                y++;
            }
            if(y*(y+1)==x)
            {
                System.out.println(x);
            }
        }
    }
}