package array_2_D;

import javax.swing.*;
class Cricket_Sum_Of_rows
{
    public static void main(String args [])
    {
        int ar[][]=new int[5][11];
        for(int x=0;x<ar.length;x++)
        {
            JOptionPane.showMessageDialog(null,"Enter runs scored in match "+(x+1),"",JOptionPane.PLAIN_MESSAGE);
            for(int y=0;y<ar[x].length;y++)
            {
                ar[x][y]=Integer.parseInt(JOptionPane.showInputDialog("Player "+(y+1)+" : "));
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
            t=t+"Total of match "+(x+1)+" = "+s+"\n";
        }
        JOptionPane.showMessageDialog(null,t,"",JOptionPane.PLAIN_MESSAGE);
    }
}