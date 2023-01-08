package date;
import javax.swing.*;
class N_Days extends Date_Array
{
    public static void main(String args [])
    {
        input();
        int n=Integer.parseInt(JOptionPane.showInputDialog("Enter number of days"));

        if(d+n<=ar[m-1])
        {
            d=d+n;
        }
        else
        {
            n=n-(ar[m-1]-d);
            m++;
            while(true)
            {
                if(m>12)
                {
                    Leap_year(++y);
                    m=1;
                }
                if(n<ar[m-1])
                {
                    break;
                }
                n=n-ar[m-1];
                m++;
            }
            d=n;
        }
        JOptionPane.showMessageDialog(null,"date : "+d+"/"+m+"/"+y,"",JOptionPane.PLAIN_MESSAGE);
    }
}