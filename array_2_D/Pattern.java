package array_2_D;

import java.util.*;
class Pattern
{
    public static void display1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();

        for(double x=n;x>=1;x-=0.5)
        {
            System.out.println((int)x);
        }
    }

    public static void display2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int c=1;
        for(double x=n;x>=1;x-=0.5)
        {
            System.out.print((int)x);
            if(c==1)
            {
                System.out.println("\tc++");
            }
            else if(c==2)
            {
                System.out.println("\tr++");
            }
            else if(c==3)
            {
                System.out.println("\tc--");
            }
            else
            {
                System.out.println("\tr--");
                c=0;
            }
            c++;
        }
    }
}