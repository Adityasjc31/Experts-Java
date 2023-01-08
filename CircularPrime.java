import java.util.*;
public class CircularPrime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        String N = sc.next();
        char ch[] = N.toCharArray();
        int c=0;
        for(int x=0;x<ch.length;x++)
        {
            if(isPrime(Integer.parseInt(new String(ch))))
            {
                c++;
            }
            System.out.println(new String(ch));
            char t = ch[0];
            for(int y=0;y<ch.length-1;y++)
            {
                ch[y] = ch[y+1];
            }
            ch[ch.length-1]=t;
        }
        
        if(c==ch.length)
        {
            System.out.println(N+" IS A CIRCULAR PRIME");
        }
        else
        {
            System.out.println(N+" IS NOT A CIRCULAR PRIME");
        }
    }
    
    public static boolean isPrime(int n)
    {
        int c=1;
        for(int x=2;x<=n/2;x++)
        {
            if(n%x ==0)
            c++;
        }
        return c==1;
    }
}