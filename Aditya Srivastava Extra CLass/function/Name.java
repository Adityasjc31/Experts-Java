package function;import java.util.*;
class Name
{
    public static void readfile()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String s=sc.nextLine();
        int n=1;
        while(n<=5)
        {
            System.out.println(s);
            n++;
        }
    }
}