import java.util.*;
class Lo1_2_5_10
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        int x=1,y=1;
        while(x<=10)
        {
            System.out.println(x);
            x=x+y;
            y=y+2;
        }
    }
}