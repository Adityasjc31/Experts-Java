import java.util.*;
public class DigitsSumToOtherSync
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("M = ");
        int M = sc.nextInt();
        System.out.print("N = ");
        int N = sc.nextInt();
        int sum = 0;
        
        if((M<100 || M>10000) || N>100)
        {
            System.out.println("INVALID INPUT");
            return ;
        }
        
        do
        {
            sum = getSumOfDigits(M);
            if(sum == N)
            {
                System.out.println("The required number is = "+M);
                String t = M + "";
                System.out.println("Total number of digits = "+t.length());
            }
            M++;
            if(M == Integer.MAX_VALUE)
            {
                break;
            }
        }while(sum!=N);
    }
    
    public static int getSumOfDigits(int n)
    {
        int s = 0;
        for(int x=n;x!=0;x=x/10)
        {
            s = s + (x%10);
        }
        return s;
    }
}