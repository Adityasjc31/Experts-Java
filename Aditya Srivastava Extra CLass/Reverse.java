import java.util.*;
class Reverse
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String s=sc.nextLine();
        String se="",w="";
        char ch;
        for(int x=s.length()-1;x>=0;x--)
        {
            ch=s.charAt(x);
            if(ch!=' ')
            {
                w=ch+w;
                if(x<=0)
                {
                    se=se+w;
                }
            }
            else if(ch==' ')
            {
                se=se+w+ch;
                w="";
            }
        }
        System.out.println(se);
    }
}