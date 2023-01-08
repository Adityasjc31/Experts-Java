package date;
import javax.swing.*;
import java.util.*;
class Valid_date extends Date_Array
{
    public static void Valid_Date_1()
    {
        input();
        Leap_year(y);
        if(y>=1 && m>=1 && m<=12 && d>=1 && d<=ar[m-1])
        {
            JOptionPane.showMessageDialog(null,"Vaid Date","",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invaid Date","",JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void Valid_Date_2()
    {
        String date=JOptionPane.showInputDialog("Enter date(dd/mm/yyyy) :-");
        Scanner sc = new Scanner(date);
        sc.useDelimiter("/");

        int d=sc.nextInt();
        int m=sc.nextInt();
        int y=sc.nextInt();
        Leap_year(y);        
        if(y>=1 && m>=1 && m<=12 && d>=1 && d<=ar[m-1])
        {
            JOptionPane.showMessageDialog(null,"Vaid Date","",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invaid Date","",JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String args [])
    {
        String date=JOptionPane.showInputDialog("Enter date(dd/mm/yyyy) :-");
        StringTokenizer st = new StringTokenizer(date,"/ .-");
        
        int d=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int y=Integer.parseInt(st.nextToken());
        Leap_year(y);
        if(y>=1 && m>=1 && m<=12 && d>=1 && d<=ar[m-1])
        {
            JOptionPane.showMessageDialog(null,"Vaid Date","",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invaid Date","",JOptionPane.PLAIN_MESSAGE);
        }
    }
}