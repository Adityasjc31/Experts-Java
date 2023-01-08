import java.util.*;
class Selection_Sort_Name
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        
        String ar[]=new String[10];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter name "+(x+1));ar[x]=sc.nextLine();
        }

        for(int x=0;x<ar.length-1;x++)
        {
            int in=x;
            
            for(int y=x+1;y<ar.length;y++)
            {
                if(ar[y].compareToIgnoreCase(ar[in])<0)
                {
                    in=y;
                }
            }
            
            String t=ar[x];
            ar[x]=ar[in];
            ar[in]=t;

        }
        System.out.println("Ascending Order : ");
        for(int x=0;x<ar.length;x++)
        {
            System.out.println(ar[x]);
        }
    }
}