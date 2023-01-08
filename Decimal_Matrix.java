import java.util.*;
public class Decimal_Matrix
{
    private static int A[][],m,n;
    public Decimal_Matrix(int m,int n)
    {
        this.m = m;
        this.n = n;
        A = new int[this.m][this.n];
    }

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        for(int x=0;x<m;x++)
        {
            System.out.print("ENTER ELEMENTS FOR ROW "+(x+1)+" : ");
            String t = sc.nextLine();
            StringTokenizer st = new StringTokenizer(t," \n");
            int len = st.countTokens();
            for(int y=0;y<len;y++)
            {
                int temp = Integer.parseInt(st.nextToken());
                if(temp>7 || temp<0)
                {
                    x--;
                    System.out.println("Enter number between 0 to 7 only");
                    continue;
                }
                A[x][y] = temp;
            }
        }
    }

    public int octalToBinary(int x)
    {
        int num = 0;
        for(int y=0;y<n;y++)
        {
            num += (A[x][y]*Math.pow(8,(n-(y+1))));
        }
        return num;
    }

    public void display()
    {
        System.out.println("FILLED MATRIX\t\tDECIMAL EQUIVALENT");
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                System.out.print(A[x][y]+"\t");
            }
            System.out.print("\t"+octalToBinary(x));
            System.out.println();
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("M = ");
        int M = sc.nextInt();
        System.out.print("N = ");
        int N = sc.nextInt();
        if(M==N)
        {
            System.out.println("INVALID INPUT");
            return ;
        } 
        boolean b1 = (M>0 && M<10);
        boolean b2 = (N>2 && N<6);
        if(!(b1 &&b2))
        {
            System.out.println("OUT OF RANGE");
            return ;
        }
        Decimal_Matrix dM = new Decimal_Matrix(M,N);
        dM.input();
        dM.display();
    }
}