import java.util.*;
class Digit_square
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(),s=0;
        while(n!=0)
        {
            int d=n%10;
            s=(d*d*d)+s;
            n=n/10;
        }
        System.out.println("Digits Square="+s);
    }
}