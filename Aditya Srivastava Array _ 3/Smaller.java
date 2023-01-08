import java.util.*;
class Smaller
{
   public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter a marks"+(x+1));int p=sc.nextInt();            
            ar[x]=p;
            String nikalo=sc.nextLine();
        }
        int s=ar[0];
        for(int x=1;x<ar.length;x++)
        {
            if(ar[x]<s)
            {
                s=ar[x];
            }
        }
        System.out.println("Smaller Number = "+ s);
    }
}