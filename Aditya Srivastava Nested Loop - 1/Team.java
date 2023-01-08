import java.util.*;
class Team
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        for(int m=1;m<=5;m++)
        {
            System.out.println("Enter runs scored in match "+m);int s=0;
            for(int p=1;p<=11;p++)
            {
                System.out.println("Enter run scored by player "+p);
                int p1=sc.nextInt();
                s=s+p1;
            }
            System.out.println("Total score for match "+m+" = "+s);
        }
    }
}