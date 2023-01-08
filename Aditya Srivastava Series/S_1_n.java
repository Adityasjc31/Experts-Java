import java.util.*;
class S_1_n
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int s=0;
        System.out.println("Enter th value of n");int n=sc.nextInt();
        for(int x=1;x<=n;x++)
        {
            s=s+x;
        }
        System.out.println("S="+s);
    }
}