package prelims;

import java.util.*;
class Perfect
{
    int num;
    Perfect(int nn)
    {
        num=nn;
    }
    
    int sum_of_factors(int i)
    {
        //Suming up the factors of num variable
        if(i==num)
        {
            return 0;
        }
        else if(num%i == 0)
        {
            return i + sum_of_factors(i+1);
        }
        else
        {
            return sum_of_factors(i+1);
        }
    }
    
    void check()
    {
        //Checking and Printing whether a number is perfect or not
        if(sum_of_factors(1) == num)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not a Perfect Number");
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //Inputing a number by keyboard
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Perfect p = new Perfect(n);
        p.check();
    }
}