import java.util.*;
class Digit_0
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");int n=sc.nextInt();
        int c=0;
        for(int x=n;x!=0;x=x/10)
        {
            int d=x%10;
            if(d==0)
            {
                c++;
            }
        }
        System.out.println("0 is present "+c+"  times");
    }
}