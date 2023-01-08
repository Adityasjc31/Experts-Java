import java.util.*;
class Pascal_Triangle
{
    public static void pascal_2D()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int ar[][] = new int[n][n];
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<=x;y++)
            {
                if(x==y || y==0)
                {
                    ar[x][y]=1;
                }
                else
                {
                    ar[x][y]= ar[x-1][y-1] + ar[x-1][y];
                }
            }
        }
        System.out.println();
        for(int x=0;x<n;x++)
        {
            for(int y=0;y<=x;y++)
            {
                System.out.print(ar[x][y] + "\t");
            }
            System.out.println();
        }
    }

    public static int pascal_term(int x,int y)
    {
        if(x>=y)
        {
            return pascal(x,y);
        }
        else
        {
            return -1;
        }
    }

    public static int pascal(int x,int y)
    {
        if(x==y || y==0)
        {
            return 1;
        }
        else
        {
            return pascal(x-1,y-1) + pascal(x-1,y);
        }
    }

    public static void pascal_recurrsive()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value number of Lines");
        int n=sc.nextInt();
        for(int x=0;x<n;x++)
        {
            for(int y=0;y<=x;y++)
            {
                System.out.print(pascal_term(x,y)+"\t");
            }
            System.out.println();
        }
    }

    public static void pascal_1D()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value number of Lines");
        int n=sc.nextInt();
        int ar[] = new int[n];
        for(int x=0;x<ar.length;x++)
        {
            ar[x]=1;
            for(int y=x-1;y>=1;y--)
            {
                ar[y]=ar[y]+ar[y-1];
            }
            for(int y=0;y<=x;y++)
            {
                System.out.print(ar[y]+"\t");
            }
            System.out.println();
        }
    }
}