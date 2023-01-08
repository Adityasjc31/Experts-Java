package array_2_D;

import javax.swing.*;
class Mirror_Image_Matrix
{
    public static void main(String args[])
    {
        int M=Integer.parseInt(JOptionPane.showInputDialog("Enter size of matrix"));
        
        if(M<=2 || M>=20)
        {
            JOptionPane.showMessageDialog(null,"Invalid Input","",JOptionPane.PLAIN_MESSAGE);
            System.exit(100);
        }
        int ar[][]=new int[M][M];
        for(int x=0;x<M;x++)
        {
            for(int y=0;y<M;y++)
            {
                ar[x][y]=Integer.parseInt(JOptionPane.showInputDialog("Enter number at index "+x+","+y));
            }
        }
        int ra[][]=new int[M][M];
        for(int x=0;x<M;x++)
        {
            for(int y=0;y<M;y++)
            {
                ra[x][y]=ar[x][(M-1)-y];
            }
        }
        System.out.println("Original Matrix");
        for(int x=0;x<M;x++)
        {
            for(int y=0;y<M;y++)
            {
                System.out.print(ar[x][y]+"\t");
            }
            System.out.println();
        }
        System.out.println("Mirror Image Matrix");
        for(int x=0;x<M;x++)
        {
            for(int y=0;y<M;y++)
            {
                System.out.print(ra[x][y]+"\t");
            }
            System.out.println();
        }
    }
}