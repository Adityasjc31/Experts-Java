package array_2_D;

import javax.swing.*;
class Diagonal_Matrix_4_4
{
    /*Diagonal Martix 4X4*/
    public static void main(String args [])
    {
        int ar[][] = new int[4][4];
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[0].length;y++)
            {
                ar[x][y]=Integer.parseInt(JOptionPane.showInputDialog("Enter number at index  "+x+","+y));
            }
        }
        
        boolean m=true;
        outer:
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                if(x!=y&&ar[x][y]!=0) 
                {
                    m=false;
                    break outer ;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"It is"+(m?"":" not ")+" a Diagonal Matrix","",JOptionPane.PLAIN_MESSAGE);
    }
}