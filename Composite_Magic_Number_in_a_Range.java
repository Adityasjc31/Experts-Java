import javax.swing.*;
class Composite_Magic_Number_in_a_Range
{
    public static boolean CompositeNumber(int n)
    {
        for(int x=2;x<n/2;x++)
        {
            if(n%x==0)
            {
                return true;
            }
        }
        return false;
    }

    public static int SumDigits(int n)
    {
        int sum=0;
        for(int x=n;x!=0;x=x/10)
        {
            int d=x%10;
            sum=sum+d;
        }
        return sum;
    }

    public static boolean MagicNumber(int n)
    {
        while(n>=10)
        {
            n=SumDigits(n);
        }
        return n==1;
    }

    public static void main(String args [] )
    {
        int m=Integer.parseInt(JOptionPane.showInputDialog("Enter Lower Limit"));
        int n=Integer.parseInt(JOptionPane.showInputDialog("Enter Upper Limit"));

        if(m<n)
        {
            int c=0;String t="";
            for(int x=m;x<=n;x++)
            {
                if(CompositeNumber(x) && MagicNumber(x))
                {
                    t=t+x+" ";
                    c++;
                    if(c%50==0 && c!=0)
                    {
                        t=t+"\n";
                    }
                }
            }
            t=t.trim().replace(" ",",")+"\n"+"Printed Numbers : "+c;
            JOptionPane.showMessageDialog(null,t,"Numbers",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid Input","Display",JOptionPane.PLAIN_MESSAGE);
        }
    }
}