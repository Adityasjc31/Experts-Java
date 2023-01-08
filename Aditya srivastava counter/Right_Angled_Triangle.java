import java.util.*;
class Right_Angled_Triangle
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int co=0;
        for(int x=1;x<=5;x++)
        {
            System.out.println("Enter angle A of Triangle "+x);
            int a=sc.nextInt();
            System.out.println("Enter angle B of Triangle "+x);
            int b=sc.nextInt();
            System.out.println("Enter angle C of Triangle "+x);
            int c=sc.nextInt();
            if(a+b+c==180 &&(a==90||b==90||c==9))
            {
                co++;
            }
        }
        System.out.println("Number of right angled triangle are"+co);
    }
}