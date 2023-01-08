import java.util.*;
class S_U_L
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String s = sc.nextLine();
        if(s.length()<5)
        {
            System.out.println(s.toUpperCase());
        }
        else
        {
            System.out.println(s.toLowerCase());
        }
    }
}