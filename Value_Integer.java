import java.util.*;
class Value_Integer
{
    public static int take(String n)
    {
        System.out.println(n);
        int t=new Scanner(System.in).nextInt();
        return t;
    }

    public static int take(char n)
    {
        System.out.println("Enter value of "+n);
        int t=new Scanner(System.in).nextInt();
        return t;
    }
}