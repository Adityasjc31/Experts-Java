import java.util.*;
class check_postive_negative_mixed
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter a number");int p=sc.nextInt();            
            ar[x]=p;
            String nikalo=sc.nextLine();
        }
        
        int c=0;
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x]%2==0)
            {
                c++;
            }
        }
        
        if(c==10)
        {
            System.out.println("All numbers are even");
        }
        else if(c==0)
        {
            System.out.println("All numbers are odd");
        }
        else
        {
            System.out.println("Mixed Numbers");
        }
    }
}