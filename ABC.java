import java.util.*;
class ABC
{
    public static boolean Unique(int n)
    {
        int count[]={0,0,0,0,0,0,0,0,0,0};
        for(int x=n;x!=0;x=x/10)
        {
            int d=x%10;
            count[d]++;
            if(count[d]==2)
            {
                return false;
            }
        }
        return true;
    }

    public static int arrange(int n)
    {
        String tt=n+"";
        char t[]=tt.toCharArray();
        for(int x=0;x<t.length-1;x++)
        {
            int i=x;
            for(int y=x+1;y<t.length;y++)
            {
                if(t[y]<t[i])
                {
                    i=y;
                }
            }
            char t1=t[x];
            t[x]=t[i];
            t[i]=t1;
        }
        tt = new String(t);
        return Integer.parseInt(tt);
    }

    public static void main(String args [])
    {
        System.out.println("Menu:\n1 - Unique Number\n2 - Arrange the number in ascending order\nEnter your choice");
        int ch=new Scanner(System.in).nextInt();
        if(ch>=1 && ch<=2)
        {
            System.out.println("Enter a number");
            int n=new Scanner(System.in).nextInt();

            if(ch==1)
            {
                if(Unique(n))
                {
                    System.out.println("Unique Number");
                }
                else
                {
                    System.out.println("Not a Unique Number");
                }
            }
            else if(ch==2)
            {
                System.out.println(arrange(n));
            }
        }
        else
        {
            System.out.println("Wrong Choice");
        }
    }
}