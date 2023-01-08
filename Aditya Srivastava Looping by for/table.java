import java.util.*;
class table
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number To See The Respective Table");
        int a=sc.nextInt();
        for(int m=1;m<=10;m++)
        {
            System.out.println(a+"x"+m+"="+(m*a));
        }
    }
}