package prime;
import java.util.*;
class Next_Twin_Prime
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        
        while(!(Prime.isPrime(n) && Prime.isPrime(n+2)))
        {
            n++;
        }
        System.out.println(n+"-"+(n+2));
    }
}