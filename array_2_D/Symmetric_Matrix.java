package array_2_D;

import java.util.*;
import javax.swing.*;
class Symmetric_Matrix
{
    public static void main(String args[])
    {
        int M=Integer.parseInt(JOptionPane.showInputDialog("Enter size of matrix"));
        if(M<=2 || M>=10)
        {
            JOptionPane.showMessageDialog(null,"Invalid Input","",JOptionPane.PLAIN_MESSAGE);
            System.exit(100);
        }
        int A[][]=new int[M][M];
        for(int x=0;x<M;x++)
        {
            for(int y=0;y<M;y++)
            {
                A[x][y]=Integer.parseInt(JOptionPane.showInputDialog("Enter number at index "+x+","+y));
            }
        }

        boolean m=true;
        int s1=0,s2=0;
        for(int x=0;x<M;x++)
        {
            for(int y=0;y<M;y++)
            {
                if(A[x][y]!=A[y][x])
                {
                    m=false;
                }

                if(x==y)
                {
                    s1+=A[x][y];
                }

                if(x+y==4)
                {
                    s2+=A[x][y];
                }
            }
        }
        JOptionPane.showMessageDialog(null,"THE GIVEN MATRIX IS "+(m?"":"NOT")+" SYMMETRIX\nSum of the left diagonal : "+s1+"\nSum of the right Diagonal = "+s2,"",JOptionPane.PLAIN_MESSAGE);
    }
}