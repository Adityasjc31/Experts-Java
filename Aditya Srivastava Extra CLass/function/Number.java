package function;import java.util.*;
class Number
{
    public static void readfile()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        System.out.println(n%2==0?"Even":"Odd");
    }
}