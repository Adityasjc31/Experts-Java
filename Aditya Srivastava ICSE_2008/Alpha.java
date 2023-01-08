import java.util.*;
class Alpha
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        String ar [] = new String[5];
        for(int x=0;x<=4;x++)
        {
            System.out.println("Enter any word");ar[x]=sc.nextLine();
        }

        for(int x=0;x<=3;x++)
        {
            for(int y=0;y<=3-x;y++)
            {
                if(ar[y].compareToIgnoreCase(ar[y+1])>0)
                {
                    String t=ar[y];
                    ar[y]=ar[y+1];
                    ar[y+1]=t;
                }
            }
        }
        
        for(int x=0;x<=4;x++)
        {
            System.out.print(ar[x]+" ");
        }
    }
}