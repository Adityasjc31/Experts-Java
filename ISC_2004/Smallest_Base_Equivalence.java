package ISC_2004;

import java.util.*;
class Smallest_Base_Equivalence
{
    private static int ChangetoBase10(int num,int base)
    {
        int c=0,converted=0;
        while(num!=0)
        {
            converted+=(int)((num%10)*Math.pow(base,c++));
            num/=10;
        }
        return converted;
    }

    private static int ChangetoBase10(String num,int base)
    {
        if(num.length()==1 && Character.isLetter(num.charAt(0)))
        {
            int ar[]={10,11,12,13,14,15,16,17,18,19};
            return ar[num.charAt(0)-65]; 
        }
        else
        {
            return ChangetoBase10(Integer.parseInt(num),base);
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Get Smallest Base Equivalence of the number\nEnter first number");
        String X=sc.next();
        System.out.println("Enter second number");
        String Y=sc.next();
        int ar[]=findingSmallestBaseEquivalence(X,Y);
        if(ar==null)
        {
            System.out.println(X+" is not equal to "+Y+" in any base between 2 to 20");
        }
        else
        {
            System.out.println(X+"(base "+ar[0]+")="+Y+"(base "+ar[1]+")");
        }
    }

    private static int[] findingSmallestBaseEquivalence(String n1,String n2)
    {
        int ar[]=new int[2];
        int b1=Character.isLetter(findingBiggestDigit(n1)) ? (int)(findingBiggestDigit(n1)-55)+1 : (findingBiggestDigit(n1)-48)+1;
        int b2=Character.isLetter(findingBiggestDigit(n2)) ? (int)(findingBiggestDigit(n2)-55)+1 : (findingBiggestDigit(n2)-48)+1;
        boolean f=false;
        outer:
        for(int x=b1;x<20;x++)
        {
            for(int y=b2;y<20;y++)
            {
                if(ChangetoBase10(n1,x)==ChangetoBase10(n2,y))
                {
                    ar[0]=x;
                    ar[1]=y;
                    f=true;
                    break outer;
                }
            }
        }
        if(!f)
        {
            ar=null;
        }
        return ar;
    }

    private static char findingBiggestDigit(String n)
    {
        char biggestDigit=0;
        for(int x=0;x<n.length();x++)
        {
            char ch=n.charAt(x);
            if(ch>biggestDigit)
            {
                biggestDigit=ch;
            }
        }
        return biggestDigit;
    }
}