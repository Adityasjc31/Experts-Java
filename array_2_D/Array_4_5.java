package array_2_D;

import javax.swing.*;
class Array_4_5
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
        String t="";int sum=0;
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[0].length;y++)
            {
                t=t+ar[x][y]+"        ";
                sum=sum+ar[x][y];
            }
            t=t+"\n";
        }
        t=t+"Sum = "+sum;
        JOptionPane.showMessageDialog(null,t,"",JOptionPane.PLAIN_MESSAGE);
    }
}