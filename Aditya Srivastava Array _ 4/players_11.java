import java.util.*;
class players_11
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[11];
        String it[]=new String[11];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter name of "+(x+1)+" player");String i=sc.nextLine();
            System.out.println("Enter the runs of "+(x+1)+" player");int p=sc.nextInt();
            ar[x]=p;it[x]=i;sc.nextLine();
        }
        
        int i=0;
        for(int x=1;x<it.length;x++)
        {
            if(ar[x]>ar[i])
            {
                i=x;
            }
        }
        
        System.out.println("Highest score = "+ar[i]+" "+it[i]);
    }
}