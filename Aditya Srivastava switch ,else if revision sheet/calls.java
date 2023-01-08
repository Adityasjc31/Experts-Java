import java.util.Scanner;
class calls
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the calls :");
        int c=sc.nextInt();
        if(c>=0&&c<=100)
        {
            System.out.println("Bill= 250");
        }
        else if(c>=101 && c<=300)
        {
            double f=250+100*0+((double)c-100)*0.8;
            System.out.println("Bill="+f);
        }
        else if(c>=301 && c<=600)
        {
            double f=250+100*0+200*0.8+(c-300)*1;
            System.out.println("Bill="+f);
        }
        else if(c>600)
        {
            double f=250+100*0+100*0.8+200*1+((double)c-400)*1.2;
            System.out.println("Bill="+f);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}