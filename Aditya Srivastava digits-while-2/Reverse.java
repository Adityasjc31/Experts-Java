import java.util.*;
class Reverse
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(),r=0;
        while(n!=0)
        {
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
        System.out.println("Reverse="+r);
    }
}