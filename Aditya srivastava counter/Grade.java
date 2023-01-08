import java.util.*;
class Grade
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0,c=0,f=0;
        for(int x=1;x<=10;x++)
        {
            System.out.println("Enter marks of "+x+"st student");
            int m=sc.nextInt();
            if(m>80 && m<=100)
            {
                a++;
            }
            else if(m>60 && m<=79)
            {
                b++;
            }
            else if(m>40 && m<=59)
            {
                c++;
            }
            else if(m>=0 && m<=39)
            {
                f++;
            }
        }
        System.out.println("Students with grade A : "+a+"\nStudents with grade b : "+b+"\nStudents with grade C : "+c+"\nStudents with grade F : "+f);
    }
}