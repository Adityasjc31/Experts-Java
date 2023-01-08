import java.util.*;
class Bubble_Sort_Ascending_String
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
            for(int y=0;y<ar.length-1;y++)
            {
                if(ar[y].compareToIgnoreCase(ar[y+1])>0)
                {
                    String t=ar[y];
                    ar[y]=ar[y+1];
                    ar[y+1]=t;
                }
            }
        }
        System.out.println("Ascending Order : ");
        for(int x=0;x<ar.length;x++)
        {
            System.out.println(ar[x]);
        }
    }
}