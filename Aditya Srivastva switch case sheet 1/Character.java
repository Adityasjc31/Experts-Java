import java.util.Scanner;
class Character
{
    public static void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character");
        char c=sc.next().charAt(0);
        switch(c)
        {
            case 'A' :
            case 'a' :
            System.out.println("Apple");
            break;
            case 'B' :
            case 'b' :
            System.out.println("Ball");
            break;
            case 'C' :
            case 'c' :
            System.out.println("Cat");
            break;
            case 'D' :
            case 'd' :
            System.out.println("Dog");
            default:
            System.out.println("Out of Range");
        }
    }
}