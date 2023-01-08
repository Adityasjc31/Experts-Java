import java.util.*;
class Count
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");int n=sc.nextInt();
        int c=0;
        for(int x=n;x!=0;x=x/10)
        {
            c++;
        }
        System.out.println(c+"digits");
    }
}