import java.util.*;
class S_CH_S
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);int c=0;
        for(int x= 1 ;x<=10 ;x++)
        {
            System.out.println("Enter any string");
            String s = sc.nextLine();
            if(s.charAt(s.length()-1)=='A' || s.charAt(s.length()-1)=='a')
            {
                c++;
            }
        }
        System.out.println(c + " strings ending with 'A' or 'a'");
    }
}