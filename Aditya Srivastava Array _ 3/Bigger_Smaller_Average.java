import java.util.*;
class Bigger_Smaller_Average
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
        int s=ar[0],d=ar[0];
        for(int x=1;x<ar.length;x++)
        {
            if(ar[x]<s)
            {
                s=ar[x];
            }
            else if(ar[x]>d)
            {
               d=ar[x];
            }
        }
        System.out.println("Biggest Number = "+d);
        System.out.println("Smallest Number = "+ s);
        System.out.println("Average = "+((double)(d+s))/2);
    }
}