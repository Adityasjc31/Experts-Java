package project;

import java.util.*;
class Reverse_Number_in_Words
{
    static String ar[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static void reverse(int n)
    {
        if(n!=0)
        {
            System.out.print(ar[n%10]+" ");
            reverse(n=n/10);
        }
    }


    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.print("Reversed Number in words: ");
        reverse(n);
    }
}