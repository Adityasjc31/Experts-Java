import java.util.*;
class encrypt
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s = sc.nextLine(),n="";
        System.out.println("Enter number");
        int nu = sc.nextInt();
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(Character.isUpperCase(ch))
            {
                if(ch=='Z')
                {
                    ch+=nu;
                    ch-=26;
                    n=n+ch;
                }
                else
                {
                    ch+=nu;
                    if((int)ch>90)
                    {
                        ch-=26;
                    }
                    n=n+ch;
                }
            }
            else if(Character.isLowerCase(ch))
            {
                if(ch=='z')
                {
                    ch+=nu;
                    ch-=26;
                    n=n+ch;
                }
                else
                {
                    ch+=nu;
                    if((int)ch>120)
                    {
                        ch-=26;
                    }
                    n=n+ch;
                }
            }
            else if(Character.isDigit(ch))
            {
                if(ch=='9')
                {
                    ch+=nu;
                    ch-=10;
                    n=n+ch;
                }
                else
                {
                    ch+=nu;
                    if((int)ch>57)
                    {
                        ch-=10;
                    }
                    n=n+ch;
                }
            }
            else
            {
                n=n+ch;
            }
        }
        System.out.println("\nEncrpted Code\n"+n);
    }
}