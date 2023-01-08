import java.util.*;
class Electricity_Bill
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("'D' - Domestic electricity Bill");
        System.out.println("'C' - Commercial electricity Bill");
        System.out.println("Enter your Choice");
        char ch = sc.next().charAt(0);int c,m1,m2;double b=0;
        System.out.println("Enter Beginning units of month : ");m1=sc.nextInt();
        System.out.println("Enter Ending units of month");m2=sc.nextInt();
        c=m2-m1;
        switch(ch)
        {
            case 'D':case 'd':
            if(c>0 && c<=100)
            {
                b=200+(double)c*2.75;
            }
            else if(c>100 && c<=200)
            {
                b=200+100*2.75+(((double)c-100)*3.25);
            }
            else if(c>200)
            {
                b=200+100*2.75+200*3.25+(((double)c-200)*3.75);
            }
            break;
            case 'C':case 'c':
            if(c>0 && c<=150)
            {
                b=300+150*3.75;
            }
            else if(c>150 && c<=250)
            {
                b=300+150*3.75+(((double)c-150)*4);
            }
            else if(c>250)
            {
                b=300+150*3.75+100*4+(((double)c-250)*4.25);
            }
        }
        if(ch=='D'||ch=='d')
        {
            System.out.println("Rent = 200");
        }
        else if(ch=='C'||ch=='c')
        {
            System.out.println("Rent = 300");
        }
        System.out.println("Bill = "+b);
    }
}