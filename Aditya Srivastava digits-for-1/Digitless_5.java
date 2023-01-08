import java.util.*;
class Digitless_5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");int n=sc.nextInt();
        int c=0;
        for(int x=n;x!=0;x=x/10)
        {
            int d=x%10;
            if(d<=5)
            {
                c++;
            }
        }
        System.out.println("Numbers present less than 5="+c);
    }
}