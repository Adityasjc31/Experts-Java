import java.util.*;
class Frequency
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ar[]={100,0,0,100,50,30,40,50,60,90,80,50,20,40,80,55,45,78,98,99,1};
        System.out.println("Marks\tFrequency");
        for(int y=100;y>=0;y--)
        {
            int c=0;
            for(int x=0;x<ar.length;x++)
            {
                if(ar[x]==y)
                {
                    c++;
                }
            }
            if(c>0)
            {
                System.out.println(y+"\t"+c);
            }
        }
    }
}