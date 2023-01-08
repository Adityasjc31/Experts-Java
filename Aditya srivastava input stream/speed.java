import java.io.*;
class speed
{
    public static void main(String args [])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter Distance in KM");
        int l=Integer.parseInt(br.readLine());
        System.out.println("Enter time in HRS");
        double b=Double.parseDouble(br.readLine());
        double s=l/b;
        System.out.println("Speed="+s+"KM/H");
    }
}