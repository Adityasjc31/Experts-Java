import java.util.Scanner;
class meter
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter reading in the beginning of the month");
        int b=sc.nextInt();
        System.out.println("Enter reading at the end of the month");
        int e=sc.nextInt();
        int r=e-b;
        if(r>=0 && r<=100)
        {
            double c=300+((double)r*3.5);
            System.out.println("Bill = "+c);
        }
        else if(r>=101 && r<=300)
        {
            double c=300+100*3.5+((double)r-100)*4.0;
            System.out.println("Bill ="+c);
        }
        else if(r>=301)
        {
            double c=300+100*3.5+200*4.0+((double)r-300)*4.5;
            System.out.println("Bil ="+c);
        }
        else
        {
            System.out.println("Invalid Input");
        }

    }
}