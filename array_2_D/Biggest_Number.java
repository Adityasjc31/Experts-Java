package array_2_D;

import javax.swing.*;
class Biggest_Number
{
    public static void main(String args [])
    {
        int ar[][]=new int[4][5];
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                ar[x][y]=Integer.parseInt(JOptionPane.showInputDialog("Enter number at index ar["+x+"]["+y+"]"));
            }
        }
        int i=0,i2=0;
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                if(ar[x][y]>ar[i][i2])
                {
                    i=x;
                    i2=y;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Highest number at index "+i+","+i2+"\nNumber is "+ar[i][i2],"",JOptionPane.PLAIN_MESSAGE);
    }
}