import java.util.*;
class Polygon_
{
    public void polygon(int n , char ch)
    {
        for(int x=1;x<=n;x++)
        {
            for(int y=1 ; y<=n ;y++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public void polygon(int x , int y)
    {
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=y;j++)
            {
                System.out.print('@');
            }
            System.out.println();
        }
    }

    public void polygon()
    {
        for(int x=1;x<=3;x++)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}