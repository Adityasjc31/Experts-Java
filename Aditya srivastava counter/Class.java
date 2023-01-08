import java.util.*;
class Class
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int p=0,s=0,h=0,i=0,in=0;
        for(int x=1;x<=10;x++)
        {
            System.out.println("Enter the class of "+x+" student");
            int c=sc.nextInt();
            if(c<=8&&c>=1)
            {
                if(c<=5)
                {
                    p++;
                }
                else
                {
                    s++;
                }
            }
            else if(c<=12)
            {
                if(c<=10)
                {
                    h++;
                }
                else
                {
                    i++;
                }
            }
            else
            {
                in++;
            }
        }
        System.out.println("Primary class="+p+"\nSecondary class="+s+"\nHigh School="+h+"\nIntermidate="+i+"\nInvalid class="+in);
    }
}