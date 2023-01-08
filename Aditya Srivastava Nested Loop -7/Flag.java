import java.util.*;
class Flag
{
    public static void main()
    {
        System.out.println("Prime Numbers are");
        for(int x=10;x<=99;x++)
        {
            boolean prime=true;
            for(int y=2;y<=x/2;y++)
            {
                if(x%y==0)
                {
                    prime=false;
                    break;
                }
            }
            if(prime==true)
            {
                System.out.println(x);
            }
        }
    }
}