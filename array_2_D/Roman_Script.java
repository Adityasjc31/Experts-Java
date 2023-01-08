package array_2_D;

import java.util.*;
class Roman_Script
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        String ar[][]={
                            {"","I","II","III","IV","V","VI","VII","VIII","IX"},
                            {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                            {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                            {"","M","MM","MMM"}
                      };
        int i=0;
        String r="";
        while(n!=0)
        {
            r=ar[i++][n%10]+r;
            n=n/10;
        }
        System.out.println("Roman Number is : "+r);
    }
}