import java.io.*;
class Marks
{
    public static void main(String args [])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);        
        System.out.println("Enter Marks For Maths");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter Marks For Physics");
        int b=Integer.parseInt(br.readLine());
        System.out.println("Enter Marks For Chemistry");
        int c=Integer.parseInt(br.readLine());
        System.out.println("Enter Marks For Biology");
        int d=Integer.parseInt(br.readLine());
        System.out.println("Enter Marks For Computer");
        int e=Integer.parseInt(br.readLine());
        if(a>=90)
        {
            System.out.println("Maths ="+a);
        }
        if(b>=90)
        {
            System.out.println("Physics ="+b);
        }
        if(c>=90)
        {
            System.out.println("Chemistry ="+c);
        }
        if(d>=90)
        {
            System.out.println("Biology ="+d);
        }
        if(e>=90)
        {
            System.out.println("Computer ="+e);
        }
    }
}