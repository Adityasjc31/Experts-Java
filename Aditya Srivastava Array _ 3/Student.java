import java.util.*;
class Student
{
   public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[11];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter a marks"+(x+1));int p=sc.nextInt();            
            ar[x]=p;
            String nikalo=sc.nextLine();
        }
        int s=0;
        for(int x=0;x<ar.length;x++)
        {
            s=s+ar[x];
        }
        System.out.println("Total marks "+ s);
        System.out.println("Average Marks "+ ((double)s/11));
    }
}