package array_2_D;

import java.util.*;
import javax.swing.*;
class Inplay
{
    static int k=0;
    public static void spy(int ar[][])
    {
        int z=0,f=0;
        for(int x=0;x<ar.length;x++)
        {
            int c=0;int v=-1;
            for(int y=0;y<ar[x].length;y++)
            {
                if(v!=ar[x][y])
                {
                    v=-1;
                }
                if(ar[x][y]!=-0)
                {
                    if(check(ar,ar[x][y],x,y) || v==-1)
                    {
                        System.out.print(ar[x][y]+"\t");
                        c++;
                        v=ar[x][y];
                        if(ar[x][y]==ar[x][ar.length-1])
                        {
                            k=v;
                        }
                    }   
                }
            }

            boolean bv=(x-1)==-1 ? false:true ;
            boolean cv=false;
            if(bv)
            {
                cv=check(ar,ar[x-1][ar.length-1],x,ar.length-1);
            }
            if(c%ar.length==0 && c!=0)
            {
                System.out.println();
                z=-1;
                f++;
            }
            else if(bv && z>-1 && cv)
            {
                if(k!=0 && k==ar[x-1][ar.length-1] )
                {
                    System.out.println();
                }
            }
        }
    }

    public static boolean check(int ar[][],int ch,int i,int j)
    {   
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                if(!(i==x && y==j))
                {
                    if(ch==ar[x][y])
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void desnput(int ar[][],int m)
    {
        Scanner sc = new Scanner(System.in);
        boolean b=true;
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                System.out.print("\f");
                System.out.println("Enter number at index "+x+","+y+" : ");
                spy(ar);

                System.out.print("->");
                ar[x][y]=sc.nextInt();
                if(check(ar,ar[x][y],x,y)==false)
                {
                    y--;
                    //t=true;
                    if(b)
                        JOptionPane.showMessageDialog(null,"INVALID INPUT RESULTS TO CHANGE IN THE INPUT TRY ONLY NON-REPATED NUMBERS","",JOptionPane.PLAIN_MESSAGE);b=false;
                }

            }
            System.out.println(); 
        }
        System.out.println("\fOriginal Matrix");
        display(ar,false);
    }

    public static void Input(int ar[][])
    {
        Scanner sc = new Scanner(System.in);
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                System.out.print("\f");
                System.out.println("Enter number at index "+x+","+y+" : ");
                display(ar,true);
                System.out.print("->");
                ar[x][y]=sc.nextInt();
            }
            System.out.println(); 
        }
        System.out.println("\fOriginal Matrix");
        display(ar,false);
    }
    public static void display(int ar[][],int n)
    {
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                if(ar[x][y]!=0)
                {
                    if(n==ar[x][y])
                    {
                        System.out.print("->");
                    }
                    System.out.print(ar[x][y]+"\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void input(int ar[][])
    {
        Scanner sc = new Scanner(System.in);
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                System.out.print("\f");
                display(ar,false);
                System.out.print("Enter number at index "+x+","+y+" : ");
                ar[x][y]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("\fOriginal Matrix");
        display(ar,false);
    }

    public static void display(int ar[][],boolean ch)
    {
        for(int x=0;x<ar.length;x++)
        {
            int c=0;
            for(int y=0;y<ar[x].length;y++)
            {
                if(ch && ar[x][y]!=-0)
                {
                    System.out.print(ar[x][y]+"\t");
                    c++;
                }
                else if(ch==false)
                {
                    System.out.print(ar[x][y]+"\t");
                }
            }
            if(ch && (c%ar.length==0 && c!=0))
            {
                System.out.println();
            }
            else if(ch==false)
            {
                System.out.println();
            }
        }
    }
}