import java.util.*;
class Factors_
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");int n=sc.nextInt();
        int c=0;
        for(int x=1;x<=n;x++)
        {
            if(n%x==0)
            {
                c++;
            }
        }
        System.out.println(c+" Factors");
    }
}