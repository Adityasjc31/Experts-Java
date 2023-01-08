import java.util.*;
class Number_10
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);int c=0;
        for(int x=1;x<=10;x++)
        {
            System.out.println("Enter "+x+"st number");
            int a=sc.nextInt();
            if(a%2!=0)
            {
                c++;
            }
        }
        System.out.println(c+" Odd Numbers");
    }
}