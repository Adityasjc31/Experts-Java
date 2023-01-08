import java.util.*;
class Selection_Sort_Name_Marks
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        String ar[]=new String[5];
        int ar1[]=new int[5];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter name of student "+(x+1));ar[x]=sc.nextLine();
            System.out.println("Enter number "+ar[x]);ar1[x]=sc.nextInt();sc.nextLine();
        }

        for(int x=0;x<ar1.length-1;x++)
        {
            int in=x;
            
            for(int y=x+1;y<ar1.length;y++)
            {
                if(ar1[y]>ar1[in])
                {
                    in=y;
                }
            }
            int t1=ar1[x];
            ar1[x]=ar1[in];
            ar1[in]=t1;
            
            String t=ar[x];
            ar[x]=ar[in];
            ar[in]=t;
            

        }
        System.out.println("Rank\tMarks\tName");
        for(int x=0;x<ar.length;x++)
        {
            System.out.println((x+1)+"\t"+ar1[x]+"\t"+ar[x]);
        }
    }
}