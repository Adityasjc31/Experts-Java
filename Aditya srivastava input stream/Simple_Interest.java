import java.io.*;
class Simple_Interest
{
    public static void main(String args [])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter principle");
        int l=Integer.parseInt(br.readLine());
        System.out.println("Enter Rate of Interest");
        int b=Integer.parseInt(br.readLine());
        System.out.println("Enter Time");
        int c=Integer.parseInt(br.readLine());
        double si=((double)(l*b*c)/100);
        System.out.println("Simple Interest="+si+"-/");
        System.out.println();
    }
}