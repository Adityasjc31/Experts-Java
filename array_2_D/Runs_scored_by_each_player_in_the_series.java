package array_2_D;

import javax.swing.*;
class Runs_scored_by_each_player_in_the_series
{
    public static void main(String args [])
    {
        int ar[][]=new int[3][3];
        for(int x=0;x<ar.length;x++)
        {
            JOptionPane.showMessageDialog(null,"Enter runs scored in match "+(x+1),"",JOptionPane.PLAIN_MESSAGE);
            for(int y=0;y<ar[x].length;y++)
            {
                ar[x][y]=Integer.parseInt(JOptionPane.showInputDialog("Player "+(y+1)+" : "));
            }
        }
        String t="";
        
        for(int x=0;x<ar[0].length;x++)
        {
            int c=0;
            for(int y=0;y<ar.length;y++)
            {
                c+=ar[x][y];
            }
            t=t+"Totsl runs scored by the player "+(x+1)+" = "+c+"\n";
        }
        JOptionPane.showMessageDialog(null,t,"",JOptionPane.PLAIN_MESSAGE);
    }
}