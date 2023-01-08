import java.util.*;
class pronic_number
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        int x=1;
        while(x*(x+1)<n)
        {
            x++;
        }
        if(x*(x+1)==n)
        {
            System.out.println("Pronic Number");
        }
        else
        {
            System.out.println("Not a Pronic Number");
        }
    }
}