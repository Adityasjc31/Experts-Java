import java.util.*;
class Salary
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter basic pay : ");
        int b=sc.nextInt();
        double da=b*30/100.0;
        double hra=b*20/100.0;
        double ta=b*10/100.0;
        double ma=b*5/100.0;
        double cca=b*8.5/100.0;
        double gp=da+hra+ta+ma+cca;
        double pf=b*7/100;
        double gi=200;
        double np=gp-(pf+gi);
        System.out.println("DA = Rs."+da);
        System.out.println("HRA = Rs."+hra);
        System.out.println("TA = Rs."+ta);
        System.out.println("MA = Rs."+ma);
        System.out.println("CCA = Rs."+cca);
        System.out.println();
        System.out.println("Gross pay = Rs."+gp);
        System.out.println();
        System.out.println("PF = Rs."+pf);
        System.out.println("GI = Rs."+gi);
        System.out.println();
        System.out.println("Net Pay = Rs."+np);
    }
}