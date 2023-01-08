import java.io.*;
class mat
{
    public static void main(String args [])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("Enter A :");
        int A=Integer.parseInt(br.readLine());
        System.out.print("Enter B :");
        int B=Integer.parseInt(br.readLine());
        System.out.print("Enter C :");
        int C=Integer.parseInt(br.readLine());
        double z=Math.pow(A,B)+Math.sqrt(C);
        System.out.println("z="+z);
    }
}