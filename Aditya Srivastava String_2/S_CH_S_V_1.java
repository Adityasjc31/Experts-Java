import java.util.*;
class S_CH_S_V_1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int c4=0,c1=0,c2=0,c3=0;
        System.out.println("Enter any string");
        String s = sc.nextLine();
        for(int x=0;x<s.length();x++)
        {
            char ch = s.charAt(x);
            if(Character.isUpperCase(ch))
            {
                c4++;
            }
            else if(Character.isLowerCase(ch))
            {
                c1++;
            }
            else if(Character.isDigit(ch))
            {
                c2++;
            }
            else
            {
                c3++;
            }
        }
        
        System.out.println(c4 + " UpperCase Letters");
        System.out.println(c1 + " LowerCase Letters");
        System.out.println(c2 + " Digits");
        System.out.println(c3+" Special Characters");
    }
}