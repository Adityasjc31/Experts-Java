import java.util.*;
public class Evil
{
    private int n;
    private String binaryEq;
    public Evil(int n)
    {
        this.n=n;
        binaryEq = binaryEquivalent();
    }
    
    private String binaryEquivalent()
    {
        int t = n;
        String b = "";
        while(t!=0)
        {
            int r = t%2;
            b = b + r;
            t /= 2 ;
        }
        return new String(new StringBuilder(b).reverse());
    }
    
    private int counts1()
    {
        int c = 0;
        for(int x=0;x<binaryEq.length();x++)
        {
            char ch = binaryEq.charAt(x);
            if(ch == '1')
            {
                c++;
            }
        }
        
        return c;
    }
    
    public int getBinaryEquivalent()
    {
        return Integer.parseInt(binaryEq);
    }
    
    public int getNumbersOf1s()
    {
        return counts1();
    }
    
    public void checkEvility()
    {
        if(counts1() % 2 ==0)
        {
            System.out.println("EVIL NUMBER");
        }
        else
        {
            System.out.println("NOT A EVIL NUMBER");
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        if(n<2 || n>100)
        {
            System.out.println("NUMBER OUT OF RANGE");
            return ;
        }
        Evil e = new Evil(n);
        System.out.println("BINARY EQUIVALENT : "+e.getBinaryEquivalent());
        System.out.println("NUMBER OF 1's : "+e.getNumbersOf1s());
        e.checkEvility();
    }
}