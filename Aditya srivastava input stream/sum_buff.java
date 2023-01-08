import java.io.*;
class sum_buff
{
    public static void main(String args [])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter first number");
        int l=Integer.parseInt(br.readLine());
        System.out.println("Enter second number");
        int b=Integer.parseInt(br.readLine());
        System.out.println("Sum="+(l+b));
    }
}