import java.util.*;
import java.text.*;
class happy
{
    public static void main()throws Exception
    {
        while(true)
        {
            Date d = new Date();
            SimpleDateFormat sdf;
            sdf = new SimpleDateFormat("hh : mm : ss");
            System.out.println("Time  : "+sdf.format(d));
            Thread.sleep(1000);
            System.out.print("\f");
        }
    }
}