import java.util.*;
class Odd
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[15];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter a number");int p=sc.nextInt();            
            ar[x]=p;
            String nikalo=sc.nextLine();
        }
        
        int c=0,s=0;
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x]%2==1)
            {
                s=s+ar[x];
                c++;
            }
        }
        
        if(c>=1)
        {
            System.out.println("Average of odd Numbers "+((double)s/c));
        }
        else
        {
            System.out.println("No odd Numbers");
        }
    }
}