package date;
import javax.swing.*;
import java.util.*;
class Day_oF_Date extends Date_Array
{
    public static void main(String args [])
    {
        input();
        String dj=JOptionPane.showInputDialog("Enter day on 1st January").toUpperCase();
        
        int i=-1;int s=0;

        for(int x=0;x<=6;x++)
        {
            if(da[x].equalsIgnoreCase(dj))
            {
                i=x;
                break;
            }
        }
        
        if(i==-1)
        {
            JOptionPane.showMessageDialog(null,"Invalid Input","",JOptionPane.PLAIN_MESSAGE);
            return;
        }
        for(int x=0;x<=m-2;x++)
        {
            s=s+ar[x];
        }
        s=s+(i+d)-1;
        JOptionPane.showMessageDialog(null,"Day on "+d+"/"+m+"/"+y+" is "+da[s%7],"",JOptionPane.PLAIN_MESSAGE);
    }
}