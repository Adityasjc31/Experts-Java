package prelims;

import java.util.*;
class ArmNum
{
    int n,l;
    ArmNum(int nn)
    {
        n=nn;
        while(nn!=0)
        {
            //taking out the length of the number
            l++;
            nn/=10;
        }
    }

    int sum_pow(int i)
    {
        //Using recurrsion calculating the each number square and then adding it up
        if(i==0)
        {
            return 0;
        }
        else
        {
            return (int)(Math.pow((i%10),l)) + sum_pow(i/10);
        }
    }
    
    void isArmstrong()
    {
        //Displaying whether number is Armstrong or not
        if(sum_pow(n) == n)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not a Armstrong Number");
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        ArmNum an = new ArmNum(n);
        an.isArmstrong();
    }
}