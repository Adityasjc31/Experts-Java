package date;
import javax.swing.*;
class Date_to_Number_OF_Days extends Date_Array
{
    public static void main(String args [])
    {
        input();
        Leap_year(y);
        int days=0;
        for(int x=0;x<m-1;x++)
        {
            days+=ar[x];
        }
        JOptionPane.showMessageDialog(null,"Number of days : "+(days+d),"",JOptionPane.PLAIN_MESSAGE);
    }
}