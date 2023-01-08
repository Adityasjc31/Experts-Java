import java.util.*;
class Number_
{
    int decimal;
    String binary;
    public Number_()
    {
        decimal =0;
        binary="";
    }
    
    public void input()
    {
        System.out.println("Enter a number");
        decimal = new Scanner(System.in).nextInt();
        binary="";
    }
    
    public void convert()
    {
        int t=decimal;
        int r=decimal%2;
        binary=r+binary;
        decimal=decimal/2;
        if(decimal>0)
        {
            convert();
        }
        decimal=t;
    }
    
    public void display()
    {
        System.out.println("Binary of "+decimal+" is : "+binary);
    }
}