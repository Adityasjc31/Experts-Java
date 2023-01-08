import java.io.*;
class Average
{
    public static void main(String args [])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter marks in physics");
        int l=Integer.parseInt(br.readLine());
        System.out.println("Enter marks in Chemistry");
        int b=Integer.parseInt(br.readLine());
        System.out.println("Enter marks in Maths");
        int c=Integer.parseInt(br.readLine());
        int t=l+b+c;
        double av=((double)(l+b+c)/3);
        System.out.println("Total="+t);
        System.out.println("Average="+av);
    }
}