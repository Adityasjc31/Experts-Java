import java.util.*;
class Range
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Smaller Number");int s=sc.nextInt();
        System.out.println("Enter Bigger Number");int b=sc.nextInt();
        for(int x=s;x<=b;x++)
        {
            if(x%2==0)
            continue;
            System.out.println(x);
        }
    }
}