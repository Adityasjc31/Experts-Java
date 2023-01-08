import java.util.*;
class Matrix_Character
{
    char M[][];
    int N;
    char ch1 = '@',ch2 = '?',ch3 = '#';
    public Matrix_Character(int n)
    {
        N = n;
        M = new char[N][N];
    }

    public Matrix_Character(int n,char ch1,char ch2,char ch3)
    {
        N = n;
        M = new char[N][N];
        this.ch1 = ch1;
        this.ch2 = ch2;
        this.ch3 = ch3;
    }

    public void doAccordingAlgorithm()
    {
        M[0][0] = M[0][N-1] = M[N-1][0] = M[N-1][N-1]=ch1;
        
        for(int x=0;x<N;x++)
        {
            if(x==0 || x==(N-1))
            {
                for(int y=1;y<N-1;y++)
                {
                    M[x][y] = ch2;
                }
            }
            else
            {
                M[x][0] = ch2;
                M[x][N-1] = ch2;
            }
        }
        
        for(int x=1;x<N-1;x++)
        {
            for(int y=1;y<N-1;y++)
            {
                M[x][y] = ch3;
            }
        }
    }

    public void display()
    {
        for(int x=0;x<N;x++)
        {
            for(int y=0;y<N;y++)
            {
                System.out.print(M[x][y]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        if(n<=3 || n>=10)
        {
            System.out.println("Wrong Value of N");
            return;
        }
        System.out.print("FIRST CHARACTER : ");
        char ch1 = sc.next().charAt(0);
        System.out.print("SECOND CHARACTER : ");
        char ch2 = sc.next().charAt(0);
        System.out.print("THIRD CHARACTER : ");
        char ch3 = sc.next().charAt(0);

        Matrix_Character matrix = new Matrix_Character(n,ch1,ch2,ch3);
        matrix.doAccordingAlgorithm();
        matrix.display();
    }
}