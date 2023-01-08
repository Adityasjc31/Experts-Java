import java.util.*;
class Automorphic_Number_Flag
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  number");int n=sc.nextInt();
        int s=n*n;boolean auto=true;
        while(n!=0)
        {
            int d1=n%10;int d2=s%10;
            if(d1!=d2)
            {
                auto=false;break;
            }
            n=n/10;s=s/10;
        }
        if(auto==true)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not a Automorphic Number");
        }
    }
}