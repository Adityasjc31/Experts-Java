import java.util.*;
class Automorphic_Number_Temporay
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");int n=sc.nextInt();
        int s=n*n,t=n,m=1;
        while(t!=0)
        {
            t=t/10;m=m*10;
        }
        if(s%m==n)
        {
            System.out.println("Automorphic number");
        }
        else
        {
            System.out.println("Not a Automorphic number");
        }
    }
}