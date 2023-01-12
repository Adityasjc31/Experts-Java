import java.util.*;
class Constellation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N");
        int N = sc.nextInt();

        char c[][] = new char[3][N];

        for(int x=0;x<3;x++)
        {
            for(int y=0;y<N;y++)
            {
                print(c);
                System.out.println("Enter value for "+x+","+y+" :");
                c[x][y]=sc.next().charAt(0);
            }
        }
        print(c);
        for(int y=0;y<N-2;y++)
        {
            if(c[0][y]=='#')
            {
                System.out.print("#");
                continue;
            }
            if(c[0][y+1]=='*')
            {
                if(c[0][y]=='.' && c[0][y+2]=='.' && c[2][y+1]=='.' && c[1][y]=='*' && c[1][y+1]=='*' && c[1][y+2]=='*' && c[2][y]=='*' && c[2][y+2]=='*')
                {
                    System.out.print("A");
                }
                else if(c[0][y]=='*' && c[0][y+2]=='*' && c[2][y+1]=='*' && c[1][y]=='*' && c[1][y+1]=='.' && c[1][y+2]=='*' && c[2][y]=='*' && c[2][y+2]=='*')
                {
                    System.out.print("O");
                }
                else if(c[0][y]=='*' && c[0][y+2]=='*' && c[2][y+1]=='*' && c[1][y]=='.' && c[1][y+1]=='*' && c[1][y+2]=='.' && c[2][y]=='*' && c[2][y+2]=='*')
                {
                    System.out.print("I");
                }
                else if(c[0][y]=='*' && c[0][y+2]=='*' && c[2][y+1]=='*' && c[1][y]=='*' && c[1][y+1]=='*' && c[1][y+2]=='*' && c[2][y]=='*' && c[2][y+2]=='*')
                {
                    System.out.print("E");
                }
            }
            else if(c[0][y]=='*' && c[0][y+1]=='.'&& c[0][y+2]=='*' && c[2][y+1]=='*' && c[1][y]=='*' && c[1][y+1]=='.' && c[1][y+2]=='*' && c[2][y]=='*' && c[2][y+2]=='*')
            {
                System.out.print("U");
            }
        }
    }
    
    public static void print(char ch[][])
    {
        System.out.print("\f");
        for(int x=0;x<ch.length;x++)
        {
            for(int y=0;y<ch[0].length;y++)
            {
                System.out.print(ch[x][y]+"   ");
            }
            System.out.println();
        }
    }
}