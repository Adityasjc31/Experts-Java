import java.util.*;
class Reverse
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(),r=0;
        for(int x=n;x!=0;x=x/10)
        {
            int d=x%10;
            r=r*10+d;
        }
        System.out.println("Reverse="+r);
    }
}