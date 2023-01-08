package array_2_D;

import java.util.*;
class Wondrous_Square
{
    public static boolean check_Wondrous(int ar[][],int s)
    {
        int s1=0,s2=0;
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                s1+=ar[x][y];
                s2+=ar[y][x];
                if(s1!=s)
                {
                    return false;
                }
                if(s2!=s)
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square");
        int m=sc.nextInt();
        if(m<=1 || m>=10 )
        {
            System.out.println("Wrong Input");
            System.exit(0);
        }
        int ar[][]=new int[m][m];
        Inplay.desnput(ar,m);
        if(check_Wondrous(ar,(m*((m*m)+1))/2))
        {
            System.out.println("Wondrous Square");
        }
        else
        {
            System.out.println("Not a Wondrous Square");
        }
        
        
    }
}