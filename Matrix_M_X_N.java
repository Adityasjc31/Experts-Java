import java.util.*;
class Matrix_M_X_N
{
    static int ar[][];
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimension of martrix with these conditions (0<Rows<10) X (2<Columns<6)");
        System.out.println("Enter Rows");
        int M=sc.nextInt();
        System.out.println("Enter Columns");
        int N=sc.nextInt();
        if(N>5 ||  N<3 || M>9 || M<1)
        {
            System.out.println("OUT OF RANGE");
            return ;
        }
        int ar[][]=new int[M][N];
        input(ar);
        display(ar);
    }

    public static void input(int ar[][])
    {
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                System.out.println("Enter number at index "+x+","+y+" : \t\t\t(Entered Number should range between 0 to 7 only)");
                ar[x][y]=new Scanner(System.in).nextInt();
                if(ar[x][y]<0 || ar[x][y]>7)
                {
                    System.out.println("INVALID INPUT\f");
                    System.exit(0);
                }
            }
        }
    }

    public static void display(int ar[][])
    {
        System.out.println("FILLED MATRIX\t\tDECIMAL EQUIVALENT");
        for(int x=0;x<ar.length;x++)
        {
            String s="";
            for(int y=0;y<ar[x].length;y++)
            {
                System.out.print(ar[x][y]+"\t");
                s=s+ar[x][y];
            }
            System.out.print("\t"+Octal_to_Decimal(Integer.parseInt(s)));
            System.out.println();
        }
    }
    
    public static int Octal_to_Decimal(int n)
    {
        int p=0,decimal=0;
        for(int x=n;x!=0;x=x/10)
        {
            decimal+=x%10*(int)Math.pow(8,p++);
        }
        return decimal;
    }
}