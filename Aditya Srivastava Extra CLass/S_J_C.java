import java.util.*;
class S_J_C
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");String s=sc.nextLine(),w="";
        char ch;
        int a=0;
        for(int x=0;x<s.length();x++)
        {
            ch=s.charAt(x);
            if(ch==' ')
            {
                a++;
                continue;
            }
            else if(a==1 || x==0)
            {
                w=w+ch+'.';
                a=0;
            }
        }
        System.out.println(w);
    }
}