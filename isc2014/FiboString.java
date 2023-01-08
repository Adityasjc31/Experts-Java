package isc2014;

import java.util.*;
class FiboString
{
    String x,y,z;
    int n;
    FiboString()
    {
        x="a";
        y="b";
        z="ba";
        n=0;
    }
    
    void accept()
    {
        System.out.println("Enter number of terms");
        n = new Scanner(System.in).nextInt();
    }
    
    void generate()
    {
        System.out.print(x+","+y);
        for(int i=1;i<=n;i++)
        {
            System.out.print("," + z);
            x=y;
            y=z;
            z=x+y;
        }
    }
    
    public static void main(String args[])
    {
        FiboString ob = new FiboString();
        ob.accept();
        ob.generate();
    }
}