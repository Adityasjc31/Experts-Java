import java.util.*;
import java.text.*;
class Time
{
    public static void main(String args[])throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Date d = new Date();
        SimpleDateFormat sdf;
        System.out.print("Started Program at :");
        sdf = new SimpleDateFormat("hh : mm : ss a, dd/MM/yyyy  zzzz");
        System.out.print(sdf.format(d)+"\n");

        for(int x=1;x<=7;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if((y==1 || y==5)&&x>=2 || x==1 && y>=2 && y<=4 || x==4 )
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        do
        {
            String s=sc.nextLine();
            if(s.equalsIgnoreCase("Exit"))
            {
                break;
            }
        }while(true);
        Time t = new Time();
        t.Time_1();
    }

    public void Time_1()
    {
        Date d = new Date();
        SimpleDateFormat sdf;
        System.out.print("Ended Program at :");
        sdf = new SimpleDateFormat("hh : mm : ss a, dd/MM/yyyy  zzzz");
        System.out.print(sdf.format(d));
    }

}