package date;
import javax.swing.*;
import java.util.*;
class Differnce_Between_2_Dates extends Date_Array
{
    public static void main(String args [])
    {
        String da1=JOptionPane.showInputDialog("Enter date 1");
        String da2=JOptionPane.showInputDialog("Enter date 2");
        
        StringTokenizer st1 = new StringTokenizer(da1,"/.,- ");
        StringTokenizer st2 = new StringTokenizer(da2,"/.,- ");
        
        int d1=Integer.parseInt(st1.nextToken());
        int m1=Integer.parseInt(st1.nextToken());
        int y1=Integer.parseInt(st1.nextToken());
        
        int d2=Integer.parseInt(st2.nextToken());
        int m2=Integer.parseInt(st2.nextToken());
        int y2=Integer.parseInt(st2.nextToken());
        
        Leap_year(y1);
        
        int dif=0;
        if(m1==m2 && y1==y2)
        {
            dif=(d2-d1);
        }
        else if(m1!=m2 && y1==y2)
        {
            dif+=ar[m1-1]-d1;
            dif+=d2;
            for(int x=m1;x<=m2-2;dif+=ar[x],x++);
        }
        else
        {
            dif+=ar[m1-1]-d1;
            dif+=d2;
            for(int x=m1;x<=11;x++)
            dif+=ar[x];
            Leap_year(y2);
            for(int x=0;x<=m2-2;x++)
            dif+=ar[x];
            for(int x=y1+1;x<y2;x++)
            dif+=x%4==0?366:365;
        }
        JOptionPane.showMessageDialog(null,"Differnce of days = "+dif,"",JOptionPane.PLAIN_MESSAGE);
    }
}