import java.util.*;
class Q5
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int y=1;
        while(y*(y+1)<a)
        {
            y++;
        }
        if(y*(y+1)==a)
        {
            System.out.println(a);
        }
    }
}