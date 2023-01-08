import java.util.*;
class Searching_1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String arr[]={"A","B","C","D","E"};
        long ar[]={100,102,103,104,9487241657523546l};
        System.out.println("Enter a number");
        long p=sc.nextInt();
        boolean f=false;
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x]==p)
            {
                System.out.println(arr[x]);f=true;break;
            }
        }

        if(!f)
        {
            System.out.println("Not Found");
        }
    }
}