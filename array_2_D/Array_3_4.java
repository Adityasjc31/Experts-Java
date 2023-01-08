package array_2_D;

import javax.swing.*;
class Array_3_4
{
    //3x4
    public static void main(String args [])
    {
        int ar[][] = new int[3][4];
        for(int x=0;x<=2;x++)
        {
            for(int y=0;y<=3;y++)
            {
                ar[x][y]=Integer.parseInt(JOptionPane.showInputDialog("Enter number at index  "+x+","+y));
            }
        }
        String t="";
        for(int x=0;x<=2;x++)
        {
            for(int y=0;y<=3;y++)
            {
                t=t+ar[x][y]+"        ";
            }
            t=t+"\n";
        }
        JOptionPane.showMessageDialog(null,t,"",JOptionPane.PLAIN_MESSAGE);
    }
}