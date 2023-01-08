package date;
import javax.swing.*;
class Number_OF_Days_to_date extends Date_Array
{
    public static void main(String args [])
    {
        int days=Integer.parseInt(JOptionPane.showInputDialog("Enter days :-"));
        int y=Integer.parseInt(JOptionPane.showInputDialog("Enter year :-"));

        
        Leap_year(y);
        int m=1;
        while(days>ar[m-1])
        {
            days-=ar[m];m++;
        }
        JOptionPane.showMessageDialog(null,"Date is : "+days+"/"+m+"/"+y,"",JOptionPane.PLAIN_MESSAGE);
    }
}