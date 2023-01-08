import java.util.*;
class Kaperka
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");int n=sc.nextInt();
        int s=n*n,c=0;
        for(int x=n;x!=0;x=x/10)
        {
            c++;
        }
        int m=(int)Math.pow(10,c);
        if(s%m+s/m==n)
        {
            System.out.println("Kaperaka Number");
        }
        else
        {
            System.out.println("Not a Kaperka Number");
        }
    }
}