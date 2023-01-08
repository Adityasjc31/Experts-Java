package array_2_D;

import java.util.*;
import javax.swing.*;
class X_5_5
{
    /*.       .
       .    .
         .
       .    .
     .       . 5X5*/
    public static void main(String args [])
    {
        int ar[][] = new int[5][5];
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[0].length;y++)
            {
                ar[x][y]=Integer.parseInt(JOptionPane.showInputDialog("Enter number at index  "+x+","+y));
            }
        }
        
        int d1=0,d2=0;
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                if(x==y || (x+y)==4)
                {
                    System.out.print(ar[x][y]+"\t");
                    if(x==y)
                    {
                        d1+=ar[x][y];
                    }
                    if(x+y==4)
                    {
                        d2+=ar[x][y];
                    }
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println("\t");
        }
        System.out.println("Sum of diagonal 1 = "+d1+"\nSum of diagonal 2 = "+d2);
    }
}