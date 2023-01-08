import java.io.*;
class math
{
    public static void main(String args [])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter Perpendicular");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter Base");
        int b=Integer.parseInt(br.readLine());
        double h=Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));
        System.out.println("Hypotenuse="+h);
    }
}