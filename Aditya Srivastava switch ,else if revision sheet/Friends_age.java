import java.util.*;
class Friends_age
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of 1st Friend");String n1=sc.nextLine();
        System.out.println("Enter age of 1st Friend");int a=sc.nextInt();sc.nextLine();
        System.out.println("Enter name of 2nd Friend");String n2=sc.nextLine();
        System.out.println("Enter age of 2nd Friend");int b=sc.nextInt();sc.nextLine();
        System.out.println("Enter name of 3rd Friend");String n3=sc.nextLine();
        System.out.println("Enter age of 3rd Friend");int c=sc.nextInt();
        if(b<a)
        {
            if(b<c)
            {
                System.out.println(n2+" is youngest of all");
            }
            else if(c<a)
            {
                System.out.println(n3+" is youngest of all");
            }
        }
        else if(a<b)
        {
            if(a<c)
            {
                System.out.println(n1+" is youngest of all");
            }
            else if(c<b)
            {
                System.out.println(n3+" is youngest of all");
            }
        }
    }
}