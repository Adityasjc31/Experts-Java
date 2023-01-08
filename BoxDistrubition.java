import java.util.*;
public class BoxDistrubition
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        if(N>1000)
        {
            System.out.println("INVALID INPUT");
            return ;
        }
        int c48 = N/48;
        int c24 = (N-(48*c48))/24;
        int c12 = (N-(48*c48 + 24*c24))/12;
        int c6  = (N-(48*c48 + 24*c24 + 12*c12))/6;
        int remaining = (N-(48*c48 + 24*c24 + 12*c12 + 6*c6));
        if(c48!=0)
        System.out.println("48×"+c48+"="+(48*c48));
        if(c24!=0)
        System.out.println("24×"+c24+"="+(24*c24));
        if(c12!=0)
        System.out.println("12×"+c12+"="+(12*c12));
        if(c6!=0)
        System.out.println(" 6×"+c6+"="+(6*c6));
        if(remaining!=0)
        System.out.println(remaining+ "×1="+(6*c6));
        System.out.println("Total number of boxes = "+N);
        int total = c48+c24+c6+c12+(remaining!=0 ? 1 : 0);
        System.out.println("Total number of cartons = "+total);
    }
}