import java.util.*;
class vaild_Tri
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st angle of a triangle");int a=sc.nextInt();
        System.out.println("Enter 2nd angle of a triangle ");int b=sc.nextInt();
        System.out.println("Enter 3rd angle of a triangle");int c=sc.nextInt();
        if((a+b)>c && (b+c)>a && (c+a)>b)
        {
            System.out.println("Valid Triangle");
        }
        else
        {
            System.out.println("Not a Valid Triangle");
        }
    }
}