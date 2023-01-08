import java.util.*;
class Names
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter your name :");
            String s=sc.nextLine();
            char ch=s.charAt((s.length())-1);
            if(ch=='a' || ch=='A')
            {
                c++;
            }
        }
        System.out.println("Number of strings ending with A are : "+c);
    }
}