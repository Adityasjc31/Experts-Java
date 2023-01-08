package array_2_D;

import javax.swing.*;
class Centuries_in_each_match_and_in_the_series
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
        int tc=0;
        for(int x=0;x<ar.length;x++)
        {
            int c=0;
            for(int y=0;y<ar[x].length;y++)
            {
                if(ar[x][y]>=100)
                c++;tc++;
            }
            t=t+"Number of Centuries in match "+(x+1)+" = "+c+"\n";
        }
        t=t+"Number of centuries in the series = "+tc;
        JOptionPane.showMessageDialog(null,t,"",JOptionPane.PLAIN_MESSAGE);
    }
}