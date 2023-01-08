import java.util.*;
class Binary_2
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]={5,10,25,32,45,51,67,73,89,100};
        System.out.println("Enter number to be searched");int n=sc.nextInt();
        int min=0,max=ar.length-1,f=-1;
        while(min<=max)
        {
            int mid=(max+min)/2;
            if(n==ar[mid])
            {
                f=mid;
                break;
            }
            else if(n>ar[mid])
            {
                min=mid+1;
            }
            else
            {
                max=mid-1;
            }
        }
        
        if(f==-1)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println("Found at index "+f);
        }
    }
}