import java.util.*;
public class Webpages
{
    static int ar[][];
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        
        //System.out.println("N(Number of webpages) : ");
        
        int N = sc.nextInt();
        sc.nextLine();
        ar = new int[N][];
        for(int x=0;x<N;x++)
        {
            //System.out.println("Enter line "+(x+1)+" : ");
            String Line = sc.nextLine();
            StringTokenizer st = new StringTokenizer(Line," ");
            ar[x] = new int[st.countTokens()];
            int y=0;
            while(st.hasMoreTokens())
            {
                ar[x][y] = Integer.parseInt(st.nextToken());
                y++;
            }
        }

        //System.out.println("Two space separation, start and end : ");
        String stend = sc.nextLine();
        int start = Integer.parseInt(stend.charAt(0)+"");
        int end = Integer.parseInt(stend.charAt(stend.length()-1)+"");

        int c=0;//for(int x=start;x<end;x++)
        int x=start;
        int y;
        boolean ended = false;
        for(y=0;y<ar[x].length;y++)
        {
            if(ar[x][y] != start)
            {
                c++;
                if(ar[x][y] == end)
                {
                    ended = true;
                    break;
                }
                x = ar[x][y] - 1;
                y=-1;
            }
        }

        //System.out.print("Number of minimum clicks ");
        System.out.println(ended ? c : -1);
    }
}