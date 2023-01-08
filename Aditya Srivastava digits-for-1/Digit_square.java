import java.util.*;
class Digit_square
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(),s=0;
        for(int x=n;x!=0;x=x/10)
        {
            int d=x%10;
            s=(d*d*d)+s;
        }
        System.out.println("Digits Square="+s);
    }
}