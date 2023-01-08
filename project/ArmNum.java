package project;

/**ISC 2019 - Q7*/
import java.util.*;
class ArmNum
{
    int n,l;
    ArmNum(int nn)
    {
        n=nn;
        l=0;
        //counting the length of the array
        while(nn!=0)
        {
            nn=nn/10;
            l++;
        }
    }

    int sum_pow(int i)
    {
        //returning sum after giving it a power using recurrsive technique
        if(i==0)
        {
            return (int)Math.pow(i,l);
        }
        else
        {
            return (int)Math.pow(i%10,l) + sum_pow(i/10);
        }
    }
    
    void isArmstrong()
    {
        //checking that the number is armstrong or not
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
        System.out.println("Enter a number");
        int n=new Scanner(System.in).nextInt();
        ArmNum an = new ArmNum(n);
        an.isArmstrong();
    }
}