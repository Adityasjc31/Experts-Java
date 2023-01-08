import java.util.*;
class Searching_2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String arr[]={"A","B","C","D","E"};
        long ar[]={100,102,103,104,9487241657523546l};
        System.out.println("Enter a number");
        String p=sc.nextLine();
        boolean f=false;
        for(int x=0;x<ar.length;x++)
        {
            if(arr[x].equalsIgnoreCase(p))
            {
                System.out.println(ar[x]);
                f=true;
            }
        }

        if(!f)
        {
            System.out.println("Not Found");
        }
    }
}