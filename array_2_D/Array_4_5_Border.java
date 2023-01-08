package array_2_D;

import javax.swing.*;
class Array_4_5_Border
{
    //4x5
    public static void main(String args [])
    {
        int ar[][] = new int[4][5];
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[0].length;y++)
            {
                ar[x][y]=Integer.parseInt(JOptionPane.showInputDialog("Enter number at index  "+x+","+y));
            }
        }
        String t="";int s1=0,s2=0;
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[0].length;y++)
            {
                if(x==0 || y==0 || x==3 || y==4)
                {
                    t=t+ar[x][y]+"        ";
                    s1=s1+ar[x][y];
                }
                else
                {
                    t=t+"        ";
                    s2=s2+ar[x][y];
                }
            }
            t=t+"\n";
        }
        t=t+"Sum of border elements = "+s1+"\nSum of non-border elements = "+s2;
        JOptionPane.showMessageDialog(null,t,"",JOptionPane.PLAIN_MESSAGE);
    }
}