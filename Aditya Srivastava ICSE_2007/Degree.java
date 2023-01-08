import java.util.*;
class Degree
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:\n1 - to Convert Fahrenheit to Celsius\n2 - to Convert Celsius to Fahrenheit");
        System.out.println("Enter your Choice : ");
        int n=sc.nextInt();
        if(n<=2)
        System.out.println("Enter value : ");int v=sc.nextInt();
        switch(n)
        {
            case 1 : 
            System.out.println("Conversion = "+(9*(v+32))/5.0);
            break;
            case 2 :
            System.out.println("Conversion = "+(5*(v-32))/9.0);
            break;
            default :
            System.out.println("Wrong Choice");
        }
    }
}