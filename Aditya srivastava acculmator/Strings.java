import java.util.*;
class Strings
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter a String");
            char ch=sc.nextLine().charAt(0);
            if(ch=='A' || ch=='a')
            {
                c++;
            }
        }
        System.out.println("Number of Srtings Starting with A : "+c);
    }
}