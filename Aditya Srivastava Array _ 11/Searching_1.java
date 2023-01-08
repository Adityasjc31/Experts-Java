import java.util.*;
class Searching_1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String arr[]={"A","B","C","D","E"};
        long ar[]={8888,5555,4444,9999,1111};
        System.out.println("Enter a name");
        String p=sc.nextLine();
        
        int min=0,max=arr.length-1,in=-1;
        while(min<=max)
        {
            int mid=(min+max)/2;
            if(p.equalsIgnoreCase(arr[mid]))
            {
                in=mid;break;
            }
            else if(p.compareTo(arr[mid])>0)
            {
                min=mid+1;
            }
            else
            {
                max=mid-1;
            }
        }

        if(in==-1)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println(ar[in]);
        }
    }
}