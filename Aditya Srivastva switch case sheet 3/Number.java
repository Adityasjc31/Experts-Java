import java.util.*;
class Number
{
    public static void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        switch(n%2)
        {
            case 0:
            System.out.println("Even");
            break;
            default:
            System.out.println("Odd");
        }
    }
}