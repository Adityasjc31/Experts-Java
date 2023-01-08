import java.util.*;
class S_CH_S_S
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);int c=0;
        System.out.println("Enter any string");       String s = sc.nextLine();
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)==' ' )
            {
                c++;
            }
        }
        System.out.println(c + " space\n"+(c+1)+" words");
    }
}