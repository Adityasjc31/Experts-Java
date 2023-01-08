import java.util.*;
class Sum
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");int n=sc.nextInt();
        int[] A=new int[n],B=new int[n],S=new int[n];
        System.out.println("Enter numbers in Array A");
        for(int x=0;x<n;x++)
        {
            System.out.print("A["+x+"] = ");A[x]=sc.nextInt();
        }
        
        System.out.println("Enter numbers for Array B");
        for(int x=0;x<n;x++)
        {
            System.out.println("B["+x+"] = ");B[x]=sc.nextInt();
            S[x]=A[x]+B[x];
        }
        
        System.out.println("ArrayA\tArrayB\tArrayS");
        for(int x=0;x<n;x++)
        {
            System.out.println(A[x]+"\t"+B[x]+"\t"+S[x]);
        }
    }
}