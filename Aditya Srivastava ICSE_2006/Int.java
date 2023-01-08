import java.util.*;
class Int
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int n=sc.nextInt();
        System.out.println("Natural Logarthim "+Math.log(n));
        System.out.println("Absolute Value "+Math.abs(n));
        System.out.println("Square Root "+Math.sqrt(n));
        System.out.println("Random numbers "+(double)(Math.random()));
    }
}