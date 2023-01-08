import java.io.*;
class Triangle
{
    public static void main(String args [])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the length of one side of the triangle");
        int l=Integer.parseInt(br.readLine());
        System.out.println("Enter the length of second side of the triangle");
        int b=Integer.parseInt(br.readLine());
        System.out.println("Third side of the triangle="+(180-(l+b))+"degrees");
    }
}