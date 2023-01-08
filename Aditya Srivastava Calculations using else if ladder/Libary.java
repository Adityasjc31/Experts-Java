import java.util.Scanner;
class Libary
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of days book has been returned late :");
        int c=sc.nextInt();
        if(c>=1&&c<=7)
        {
            int f=c*2;
            System.out.println("Fine= "+f);
        }
        else if(c>=8 && c<=15)
        {
            int f=7*2+(c-7)*3;
            System.out.println("Fine="+f);
        }
        else if(c>=16)
        {
            int f=7*2+(8*3)+(c-7)*3;
            System.out.println("Bill="+f);
        }
        else
        {
            System.out.println("No Fine");
        }

    }
}
