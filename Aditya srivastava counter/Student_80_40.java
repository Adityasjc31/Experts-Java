import java.util.*;
class Student_80_40
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int c1=0,c2=0;
        for(int x=1;x<=10;x++)
        {
            System.out.println("Enter the marks of "+x+"st student");
            int a=sc.nextInt();
            if(a>=80)
            {
                c1++;
            }
            else if(a<40)
            {
                c2++;
            }
        }
        System.out.println("Number of students got marks above 80: "+c1+"\nNumber of Students getting marks below 40: "+c2);
    }
}