import java.util.Scanner;
class Recursion_23
{
    static char ar[]={'A','B','C','D','E','F'};
    public static void toHexadecimal(int n)
    {
        if(n>15)
        {
            toHexadecimal(n/16);
        }
        if(n%16<10)
            System.out.print(n%16);
        else
            System.out.print(ar[n%16-10]);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        toHexadecimal(n);
    }
}
