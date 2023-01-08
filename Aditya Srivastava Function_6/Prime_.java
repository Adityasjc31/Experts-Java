import java.util.*;
class Prime_
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
        String s=sc.nextLine();
        int n=s.indexOf('-');
        String sm = s.substring(0,n).trim();
        String bi=s.substring(n+1).trim();
        int smm=Integer.parseInt(sm);
        int b=Integer.parseInt(bi);
        
        for(int x=smm;x<=b;x++)
        {
            if(! Prime.isPrime(x))
            {
                System.out.println(x);
            }
        }
    }
}