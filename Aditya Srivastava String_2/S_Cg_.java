import java.util.*;
class S_Cg_
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int c=0;
        for(int x= 1 ;x<=10 ;x++)
        {
            System.out.println("Enter any String");
            String s = sc.nextLine();
            if(s.charAt(0)=='A' || s.charAt(0)=='a')
            {
                c++;
            }
        }
        System.out.println(c + " strings starting with 'A' or 'a'");
    }
}