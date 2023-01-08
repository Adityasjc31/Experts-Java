package date;
import javax.swing.*;
class Date_ extends Date_Array
{
    public static int Januray_Index()
    {
        input();
        int i=1;byte lp=0;
        for(int x=1900; x<=y ;x++)
        {
            if(Leap_year((long)x) && x!=1900 || lp==1)
            {
                lp++;
                if(lp==1)
                {
                    i=i+1;
                }
                else if(lp==2)
                {
                    i=i+2;
                    lp=0;
                }
            }
            else
            {
                i++;
            }
        }
        i=(i%7)-1;
        return i;
    }

    public static void main(String args [])
    {
        int i=Januray_Index();

        int s=0;

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
        JOptionPane.showMessageDialog(null,da[s%7]+","+d+"/"+m+"/"+y,"",JOptionPane.PLAIN_MESSAGE);
    }
}