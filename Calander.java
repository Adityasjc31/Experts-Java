import java.util.*;
public class Calander
{
    public static void main(String args[])
    {
        input();
    }

    private static void input()
    {
        System.out.println("Enter year(1600<=y=<3000)");
        String n=new Scanner(System.in).nextLine();
        y=Integer.parseInt(n);
        if(y>=1600 && y<=3000)
        {
            calander();   
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }

    private static void calander()
    {
        for(int x=1;x<=12;x++)
        {
            int lines=0;
            System.out.println("Year : "+y+"\nMonth : "+month[x-1]+"\nMON\tTUE\tWED\tTHU\tFRI\tSAT\tSUN");
            calculation(1,x,y);
            for(int j=0;j<day.length;)
            {
                if(fday.equals(day[j++]))
                {
                    System.out.print("1\t");
                    break;
                }
                else
                {
                    System.out.print("\t");
                }
                lines++;
            }
            for(int j=2;j<=ar[x-1];j++)
            {
                lines++;
                if(lines%7==0)
                {
                    System.out.println();
                }
                System.out.print(j+"\t");
            }
            System.out.println("\nPress any key to see the next month\n<> to close the program\n< to go back to the previous month");
            String t =new Scanner(System.in).nextLine();
            if(t.equals("<"))
            {
                x=x-2;
                if(x==-1)
                {
                    x=11;
                    y--;
                    if(y%4==0 || y%100==0)
                    {
                        ar[1]=29;
                    }
                    System.out.print("\f");
                    continue;
                }
            }
            if(x==12)
            {
                x=0;
                y++;
                if(y%4==0 || y%100==0)
                {
                    ar[1]=29;
                }
            }
            if(t.equalsIgnoreCase("<>"))
            {
                break;
            }
            System.out.print("\f");
        }
    }
    private static int ar[]={31,28,31,30,31,30,31,31,30,31,30,31};
    private static int od1,od2,od3;
    private static int d=1,m,y;
    private static String day[]={"MON","TUE","WED","THU","FRI","SAT","SUN"},fday;
    private static String month[]={"Januray","Feburary","March","April","May","June","July","August","September","October","November","December"};
    private static void calculation(int date,int month,int year)
    {
        d=date;
        m=month;
        y=year;

        if(y%100==0||y%4==0)
        {
            ar[1]=29;
        }
        else
        {
            ar[1]=28;
        }

        od1=(y/100)*100;
        od2=(y%100)-1;
        year_divison();
    }

    private static void year_divison()
    {
        while(od1>=400)
        {
            od1=od1-400;
        }
        if(od1==100)
        {
            od1=5;
        }
        else if(od1==200)
        {
            od1=3;
        }
        else if(od1==300)
        {
            od1=1;
        }
        int rem=od2/4;
        od3=(rem*2)+(od2-rem);
        adding_odd_days();
    }

    private static void adding_odd_days()
    {
        for(int x=0;x<m-1;x++)
        {
            od3=od3+ar[x];
        }
        od3=od3+d;
        int z=(od1+od3)%7;
        if(z!=0)
            fday=day[z-1];
        else
            fday=day[6];
        System.out.println();
    }
}