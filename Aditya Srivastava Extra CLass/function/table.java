package function;import java.util.*;
class table
{
    public static void main(String args [])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number To See The Respective Table");
        int a=sc.nextInt();
        line n=new line();
        n.display();
        System.out.println();
        int m=1;
        while(m<=10)
        {
            System.out.println(a+"x"+m+"="+(m*a));
            m++;
        }
    }
}