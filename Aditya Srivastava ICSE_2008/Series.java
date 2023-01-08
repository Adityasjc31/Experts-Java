import java.util.*;
class Series
{
    public static void main(String args [])
    {
        int s=0;
        for(int x=2;x<=20;x++)
        {
            if(x%2==0)
            {
                s+=x;
            }
            else
            {
                s-=x;
            }
        }
        System.out.println("Sum = "+s);
    }
}