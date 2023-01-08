import java.util.*;
class mat
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A :");
        int A=sc.nextInt();
        System.out.print("Enter B :");
        int B=sc.nextInt();
        System.out.print("Enter C :");
        int C=sc.nextInt();
        double z=Math.pow(A,B)+Math.sqrt(C);
        System.out.println("z="+z);
    }
}