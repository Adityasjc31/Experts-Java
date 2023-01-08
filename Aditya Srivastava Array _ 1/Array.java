import java.util.*;
class Array
{
    public static void main(String args [])
    {
        int nums[]=new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println("Enter a number");
            nums[i]=sc.nextInt();
        }
        System.out.println("Even Numbers Are :");boolean f=false;
        for(int a=0;a<nums.length;a++)
        {
            if(nums[a]%2==0)
            {
                System.out.println(nums[a]);
                f=true;
            }
        }
        if(f==false)
        {
            System.out.println("No Even Number Found");
        }
    }
}