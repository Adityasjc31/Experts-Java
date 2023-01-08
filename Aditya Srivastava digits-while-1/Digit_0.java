import java.util.*;
class Digit_0
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");int n=sc.nextInt();
        int c=0;
        while(n!=0)
        {
            int d=n%10;
            if(d==0)
            {
                c++;
            }
            n=n/10;
        }
        System.out.println("0 is present "+c+"  times");
    }
}