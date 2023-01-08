import java.util.*;
class Q5
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        String na[]=new String[10];
        int we[]=new int[10];
        for(int x=0;x<na.length;x++)
        {
            System.out.println("Enter name of person "+(x+1));
            na[x]=sc.nextLine();
            System.out.println("Enter "+na[x]+"'s weight");
            we[x]=sc.nextInt();
            sc.nextLine();
        }
        
        for(int x=0;x<we.length-1;x++)
        {
            int in=x;
            for(int y=x+1;y<we.length;y++)
            {
                if(we[y]>we[in])
                {
                    in=y;
                }
            }
            
            int t1=we[x];
            we[x]=we[in];
            we[in]=t1;
            
            String t=na[x];
            na[x]=na[in];
            na[in]=t;
        }
        
        System.out.println("Name\tWeight");
        for(int x=0;x<we.length;x++)
        {
            System.out.println(na[x]+"\t"+we[x]);
        }
    }
}