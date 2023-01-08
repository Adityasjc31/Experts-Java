package date;
import javax.swing.*;
class Next_Date extends Date_Array
{
    public static void main(String args [])
    {
        input();        
        Leap_year(y);
        if(d==31 && m==12)
        {
            d=m=1;
            y++;
        }
        else if(d>=ar[m-1])
        {
            d=1;
            m++;
        }
        else
        {
            d++;
        }
        JOptionPane.showMessageDialog(null,"Next date : "+d+"/"+m+"/"+y,"",JOptionPane.PLAIN_MESSAGE);
    }
}