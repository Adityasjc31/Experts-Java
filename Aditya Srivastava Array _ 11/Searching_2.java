import java.util.*;
class Searching_2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String arr[]={"E","B","A","C","D"};
        long ar[]={11111,22222,33333,44444,55555};
        System.out.println("Enter phone number");
        int p=sc.nextInt();

        int min=0,max=ar.length-1,in=-1;
        while(min<=max)
        {
            int mid=(min+max)/2;
            if(p==ar[mid])
            {
                in=mid;break;
            }
            else if(p>ar[mid])
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
            System.out.println(arr[in]);
        }
    }
}