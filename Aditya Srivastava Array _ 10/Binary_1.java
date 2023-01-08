import java.util.*;
class Binary_1
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]={5,10,25,32,45,51,67,73,89,100};
        System.out.println("Enter number to be searched");int n=sc.nextInt();
        int min=0,max=ar.length-1;boolean f=false;
        while(min<=max)
        {
            int mid=(max+min)/2;
            if(n==ar[mid])
            {
                f=true;System.out.println("Found at index "+mid);break;
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
        
        if(!f)
        {
            System.out.println("Not Found");
        }
    }
}