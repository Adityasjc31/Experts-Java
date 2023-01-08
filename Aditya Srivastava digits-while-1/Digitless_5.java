import java.util.*;
class Digitless_5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");int n=sc.nextInt();
        int c=0;
        while(n!=0)
        {
            int d=n%10;
            if(d<=5)
            {
                c++;
            }
            n=n/10;
        }
        System.out.println("Numbers present less than 5="+c);
    }
}