import java.util.*;
class Students
{
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        for(int x=1;x<=10;x++)
        {
            System.out.println("Enter marks of students "+x);
            int s=0;
            for(int y=1;y<=5;y++)
            {
                System.out.println("Subject "+y);int m=sc.nextInt();s+=m;
            }
            System.out.println("Total of students "+x+" is "+s);
        }
    }
}