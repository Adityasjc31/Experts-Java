import java.util.*;
class exception
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter First Number");int a = sc.nextInt();
            System.out.println("Enter Second Number");int b=sc.nextInt();
            int r=(a+b)/(a-b);
            System.out.println("Result = "+r);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Result = Infinity");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter Digits only");
        }
        catch(Exception e)
        {
            System.out.println("Any other Error");
        }
    }
}