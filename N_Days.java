import java.util.*;
public class N_Days
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("DAY NUMBER : ");
        int dn = sc.nextInt();
        System.out.println("YEAR : ");
        int y = sc.nextInt();
        System.out.println("DATE AFTER(N DAYS) : ");
        int n = sc.nextInt();
        LeapYear(y);
        if(dn<1 || dn>366)
        {
            System.out.println("DAY NUMBER OUT OF RANGE");
            return ;
        }
        if(n<1 || n>100)
        {
            System.out.println("DAY AFTER(N DAYS) OUT OF RANGE");
            return ;
        }
        String DN = getDate(dn,y);
        System.out.println("DATE : "+DN);
        String DAN = getDate(dn+n,y);
        System.out.println("DATE AFTER "+n+" DAYS : "+DAN);
    }
    
    static int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    static String Month[] = {"JANURARY","FEBURARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
    
    public static String getDate(int n,int y)
    {
        int d=0,m=0;
        LeapYear(y);
        while(m<12)
        {
            if(n < month[m])
            {
                d = n;
                break;
            }
            n = n-month[m];
            m++;
            if(m>=12)
            {
                m=0;
                y++;
                LeapYear(y);
            }
        }
        String date = "";
        date += d;
        if(d==1)
        {
            date += " ST";
        }
        else if(d==2)
        {
            date += " ND";
        }
        else if(d == 3)
        {
            date += " RD";
        }
        else
        {
            date += " TH";
        }
        date += " "+Month[m]+ "," + y;
        return date;
    }
    
    public static void LeapYear(int y)
    {
        if(y%4 == 0 && y%100 != 0)
        {
            month[1]=29;
        }
        else
        {
            month[1]=28;
        }
    }
}