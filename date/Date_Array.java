package date;
import java.util.*;
import javax.swing.*;
class Date_Array
{
    static int d,m,y;
    static int ar[]={31,28,31,30,31,30,31,31,30,31,30,31};
    static String da[]={"Sunday","Monday","Tuesday","Wednesday","Thursaday","Friday","Saturday"};

    public static boolean Leap_year(Long y)
    {
        if(y%4==0 || (y%100==0 && y%400==0))
        {
            return true;
        }
        return false;
    }

    public static void Leap_year(int y)
    {
        if(y%4==0 || (y%100==0 && y%4==0))
        {
            ar[1]=29;
        }
    }

    public static void input()
    {
        String date=JOptionPane.showInputDialog("Enter date(dd/mm/yyyy) :-");
        StringTokenizer st = new StringTokenizer(date,"/ .-");

        d =Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        y=Integer.parseInt(st.nextToken());
    }
}