import java.util.*;
class marks 
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        for(int x=1;x<=5;x++)
        {
            System.out.println("Enter marks in subject "+x);
            int m=sc.nextInt();
            if(m>=75)
            {
                c++;
            }
        }
        System.out.println(c+"subjects");
    }
}