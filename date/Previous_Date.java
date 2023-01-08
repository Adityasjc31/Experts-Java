package date;
import javax.swing.*;
class Previous_Date extends Date_Array
{
    public static void main(String args [])
    {
        input();        
        Leap_year(y);
        if(d==1 && m==1)
        {
            d=31;
            m=12;
            y--;
        }
        else if(d==1)
        {
            d=ar[m-2];
            m--;
        }
        else
        {
            d--;
        }
        JOptionPane.showMessageDialog(null,"Previous date : "+d+"/"+m+"/"+y,"",JOptionPane.PLAIN_MESSAGE);
    }
}