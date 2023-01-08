package array_2_D;

import javax.swing.*;
class Sum_Of_rows
{
    public static void main(String args [])
    {
        int ar[][]=new int[4][5];
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                ar[x][y]=Integer.parseInt(JOptionPane.showInputDialog("Enter number at index ar["+x+"]["+y+"] :"));
            }
        }
        String t="";
        for(int x=0;x<ar.length;x++)
        {
            int s=0;
            for(int y=0;y<ar[x].length;y++)
            {
                s+=ar[x][y];
            }
            t=t+"Sum of row "+x+" = "+s+"\n";
        }
        JOptionPane.showMessageDialog(null,t,"",JOptionPane.PLAIN_MESSAGE);
    }
}