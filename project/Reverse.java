package project;

import java.util.*;
class Reverse
{
    public static void reverse(int n)
    {
        if(n!=0)
        {
            System.out.print(n%10);
            reverse(n=n/10);
        }
    }

    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.print("Reverse Number : ");
        reverse(n);
    }
}