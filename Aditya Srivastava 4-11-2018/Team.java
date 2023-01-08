import java.util.*;
class Team
{
    public static int big(String n[])
    {
        int big=n[0].length();
        for(int x=1;x<n.length;x++)
        {
            if(n[x].length()>big)
            {
                big=n[x].length();
            }
        }
        return big;	
    }

    public static void onelength(String n[],int big)
    {
        for(int x=0;x<n.length;x++)
        {
            if(n[x].length()<big)
            {
                for(int y=n[x].length();y<big;y++)
                {
                    n[x]=n[x]+" ";
                }
            }
        }
    }

    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of teams");
        int t=sc.nextInt();
        sc.nextLine();

        String te[]=new String[t];
        for(int x=0;x<te.length;x++)
        {
            System.out.println("Enter a name of "+(x+1)+" team");
            te[x]=sc.nextLine();
        }

        int big = big(te);
        onelength(te,big);
        display(te,big);
    }

    public static void display(String n[],int big)
    {
        for(int x=0;x<big;x++)
        {
            for(int y=0;y<n.length;y++)
            {
                System.out.print(n[y].charAt(x)+"\t");
            }
            System.out.println();
        }
    }
}