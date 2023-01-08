import java.io.*;
class Obtuse_Triangle
{
    public static void main(String args [])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter Second Angle");
        int b=Integer.parseInt(br.readLine());
        System.out.println("Enter Thrid Angle");
        int c=Integer.parseInt(br.readLine());
        if(a<=120||b<=120||c<=120)
        {
            System.out.println("Triangle is Obtuse angled triangle");
        }
        else
        {
            System.out.println("Triangle is not Obtuse angled triangle");
        }
    }
}