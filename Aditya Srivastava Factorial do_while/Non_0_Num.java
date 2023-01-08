import java.util.*;
class Non_0_Num
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int s=0,n;
        do
        {
            System.out.println("Enter a Number");n=sc.nextInt();
            s+=n;
        }while(n!=0);
        System.out.println("Sum = "+s);
    }
}