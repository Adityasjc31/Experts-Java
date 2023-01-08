import java.io.*;
class rectangle
{
    public static void main(String args [])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the length of the rectangle");
        int l=Integer.parseInt(br.readLine());
        System.out.println("Enter the breadth of the rectangle");
        int b=Integer.parseInt(br.readLine());
        System.out.println("Area of the rectangle="+(l*b)+","+"Perimeter of the rectangle="+(2*(l+b)));
        System.out.println();
    }
}