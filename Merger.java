import java.util.*;
class Merger
{
    long n1,n2,mergNum;
    public Merger()
    {
        n1=n2=mergNum=0L;
    }
    
    public void readNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n1");
        n1 = sc.nextLong();
        System.out.println("Enter value of n2");
        n2 = sc.nextLong();
    }
    
    public void JoinNum()
    {
        mergNum = n1;
        long x=n2;
        while(x!=0)
        {
            mergNum *= 10;
            x=x/10;
        }
        mergNum += n2;
    }
    
    public void show()
    {
        System.out.println("First Number : "+n1);
        System.out.println("Second Number : "+n2);
        System.out.println("Merged Number : "+mergNum);
    }
    
    public static void main(String args[])
    {
        Merger mr  = new Merger();
        mr.readNum();
        mr.JoinNum();
        mr.show();
    }
}