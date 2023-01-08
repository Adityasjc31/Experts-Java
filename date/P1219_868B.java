package date;

import java.util.*;
class P1219_868B extends Date_Array
{
    public static int[] getDate(int dayNumber,int year)
    {
        int m=1;
        Leap_year(year);
        while(dayNumber>ar[m-1])
        {
            dayNumber-=ar[m];m++;
        }
        int ar[]={dayNumber-1,m,year};
        return ar;
    }

    public static int[] addDate(int d,int m,int y,int n)
    {
        Leap_year(y);
        if(d+n<=ar[m-1])
        {
            d=d+n;
        }
        else
        {
            n=n-(ar[m-1]-d);
            m++;
            while(true)
            {
                if(m>12)
                {
                    Leap_year(++y);
                    m=1;
                }
                if(n<ar[m-1])
                {
                    break;
                }
                n=n-ar[m-1];
                m++;
            }
            d=n;
        }
        int ar[]={d,m,y};
        return ar;
    }
    
    public static String integerDateToStringDate(int d,int m,int y)
    {
        String suffix;
        if(d==1 || d==21 || d==31)
        {
            suffix=" ST ";
        }
        else if(d==2 || d==22)
        {
            suffix=" ND ";
        }
        else if(d==3 || d==23)
        {
            suffix=" RD ";
        }
        else
        {
            suffix=" TH ";
        }
        String ar[]={"JANUARY","FEBURARY","MARCH","APRIL","MAY","JUNE","JULY","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        return d+suffix+ar[m-2]+", "+y;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day Number : ");
        int dayNumber=sc.nextInt();
        System.out.println("Enter Year : ");
        int year=sc.nextInt();
        System.out.println("Enter date after(N Days)");
        int n=sc.nextInt();
        Leap_year(year);
        int full_Date[]=getDate(dayNumber,year);
        int new_Full_Date[]=addDate(full_Date[0],full_Date[1],full_Date[2],n);
        System.out.println("Date : "+integerDateToStringDate(full_Date[0],full_Date[1],full_Date[2]));
        System.out.println("Date After "+n+" Days : "+integerDateToStringDate(new_Full_Date[0],new_Full_Date[1],new_Full_Date[2]));
    }
}