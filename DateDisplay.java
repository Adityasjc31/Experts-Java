import java.util.Scanner;
public class DateDisplay
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date");
        int d=sc.nextInt();
        System.out.println("Enter month");
        int m=sc.nextInt();
        System.out.println("Enter year");
        int y=sc.nextInt();
        String mon[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        if((d%10==1||d==1)&&d!=11)
        {
           System.out.println(d+"st-"+mon[m-1]+"-"+y);
        }
        else if((d%10==2||d==2)&&d!=12)
        {
            System.out.println(d+"nd-"+mon[m-1]+"-"+y);
        }
        else if((d%10==3||d==3)&&d!=13)
        {
            System.out.println(d+"rd-"+mon[m-1]+"-"+y);
        }
        else 
        {
            System.out.println(d+"th-"+mon[m-1]+"-"+y);
        }
    }
}