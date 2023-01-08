import java.io.*;
class Right_Triangle
{
    public static void main(String args [])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);        
        System.out.println("Enter First Angle");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter Second Angle");
        int b=Integer.parseInt(br.readLine());
        System.out.println("Enter Thrid Angle");
        int c=Integer.parseInt(br.readLine());
        if(a==90||b==90||c==90)
        {
            System.out.println("Triangle is Right angled triangle");
        }
        else
        {
            System.out.println("Triangle is not Right angled triangle");
        }
    }
}