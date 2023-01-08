import java.util.*;
class pattern_7
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s=sc.nextLine();
        for(int x=0;x<=s.length()-1;x++)
        {
            for(int y=0;y<=x;y++)
            {
                System.out.print(s.charAt(y));
            }
            
            int u=0;
            if(s.length()%2==0)
            {
                u=s.length()+(s.length()-2);
            }
            else
            {
                u=s.length()+(s.length()-2);
            }
            
            for(int y=1;y<u-x*2;y++)
            {
                System.out.print(" ");
            }

            for(int y=x;y>=0;y--)
            {
                if(y!=(s.length()-1))
                {
                    System.out.print(s.charAt(y));
                }
            }
            System.out.println();
        }
    }
}