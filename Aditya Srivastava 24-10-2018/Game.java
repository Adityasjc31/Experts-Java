import java.util.*;
class Game
{
    public static void main(String arg [])
    {
        Scanner sc = new Scanner(System.in);
        int num=(int)(Math.random()*100);
        int n=1;
        boolean f=false;
        System.out.println("\t\t\t\tWelcome To The guessing Game\n****************************************************************************************************************");
        do
        {
            System.out.println("Enter a number");
            int y=sc.nextInt();
            if(y==num)
            {
                System.out.println("You Won");
                System.out.println("Number was : "+num);
                f=true;
                break;
            }
            else
            {
                f=true;
                System.out.println("\nTry Again !!!!!!!!!!!!!!!!!!");
                if(y>num)
                {
                    System.out.println("The number is smaller than entered number : "+y);
                }
                else
                {
                    System.out.println("The number is bigger than entered number : "+y);
                }
            }n++;
        }
        while(n<=7);
        if(f==false)
        {
            System.out.println("You Lost\nBetter Luck Next Time !!\n You are Not A Genius");
        }
    }
}