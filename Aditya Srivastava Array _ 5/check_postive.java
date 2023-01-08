import java.util.*;
class check_postive
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
        
        boolean f=true;
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x]<=0)
            {
                f=false;
                break;
            }
        }
        
        if(f)
        {
            System.out.println("All Numbers are postive");
        }
        else
        {
            System.out.println("One or more numbers are negative");
        }
    }
}