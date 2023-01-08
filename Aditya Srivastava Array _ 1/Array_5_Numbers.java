import java.util.*;
class Array_5_Numbers
{
    public static void main(String args [])
    {
        int nums[]=new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println("Enter a number");
            nums[i]=sc.nextInt();
        }
        System.out.println("Even Numbers Are :");
        for(int a=0;a<nums.length;a++)
        {
            System.out.println(nums[a]);
        }
    }
}