import java.io.*;
class Acute_Triangle
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
        if(a<=60||b<=60||c<=60)
        {
            System.out.println("Triangle is Actue angled triangle");
        }
        else
        {
            System.out.println("Triangle is not Actue angled triangle");
        }
    }
}