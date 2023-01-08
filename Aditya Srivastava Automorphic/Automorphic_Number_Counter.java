import java.util.*;
class Automorphic_Number_Counter
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any value");int n=sc.nextInt();int s=n*n;
        int c=0;double d=0;
        for(int x=n;x!=0;x=x/10)
        {
            c++;
        }
        d=s%Math.pow(10,c);
        if(n==d)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not a Automorphic Number");
        }
    }
}