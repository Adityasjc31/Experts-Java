import java.util.*;
class ISBN
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ISBN Number");
        String isbn=sc.nextLine();
        if(isbn.length()==10)
        {
            int sum=0;
            for(int x=0,y=10;x<isbn.length();x++,y--)
            {
                char ch=isbn.charAt(x);
                sum+=ch=='X'?(y*10):(y*(ch-48));
            }

            if(sum%11==0)
            {
                System.out.println("Legal ISBN");
            }
            else
            {
                System.out.println("Illegal ISBN.");
            }
        }
        else
        {
            System.out.println("Illegal ISBN");
        }
    }
}