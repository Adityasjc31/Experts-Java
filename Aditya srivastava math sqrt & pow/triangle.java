import java.io.*;
class triangle
{
    public static void main(String args [])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter First Side");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter Second Side");
        int b=Integer.parseInt(br.readLine());
        System.out.println("Enter Thrid Side");
        int c=Integer.parseInt(br.readLine());
        double s=(a+b+c)/2.0;
        double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the triangle="+ar);
    }
}