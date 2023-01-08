import java.util.*;
public class QuizCorrection
{
    private String test[][];
    private int N;
    public QuizCorrection(int N)
    {
        test = new String[N+1][5];
        this.N = N+1;
    }

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        for(int x=0;x<N-1;x++)
        {
            System.out.print("Participant "+(x+1)+" : ");
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s," ,");
            int t=0;
            while(st.hasMoreTokens() && t<5)
            {
                test[x][t++] = st.nextToken();
            }
        }
        System.out.print("KEY : ");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s," ,");
        int t=0;
        while(t<5 && st.hasMoreTokens())
        {
            test[N-1][t++] = st.nextToken();
        }
    }

    public void result()
    {
        System.out.println("Scores : ");
        int hS = 0;
        for(int x=0;x<N-1;x++)
        {
            int c=0;
            System.out.print("Participant "+(x+1)+" = ");
            for(int y=0;y<5;y++)
            {
                if(test[N-1][y].equalsIgnoreCase(test[x][y]))
                {
                    c++;
                }
            }
            if(hS<c)
            {
                hS = x;
            }
            System.out.println(c);
        }
        System.out.println("Highest score : Participant "+(hS+1));
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N  = sc.nextInt();
        if(N<3 || N>11)
        {
            System.out.println("INPUT SIZE OUT OF RANGE");
            return ;
        }
        QuizCorrection qc = new QuizCorrection(N);
        qc.input();
        qc.result();
    }
}