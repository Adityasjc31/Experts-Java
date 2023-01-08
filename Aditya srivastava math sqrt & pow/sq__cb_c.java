import java.io.*;
class sq__cb_c
{
    public static void main(String args [])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter any Number");
        int a=Integer.parseInt(br.readLine());
        int s=a*a;
        System.out.println("Square :"+s);
        int c=a*a*a;
        System.out.println("Cube :"+c);
        double sq=Math.sqrt(a);
        System.out.println("Square root :"+sq);
        double cb=Math.cbrt(a);
        System.out.print("Square root :"+cb);
       }
}