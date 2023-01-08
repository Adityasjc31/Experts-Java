import java.util.*;
class Q8
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Elements for ArrayP");int N=sc.nextInt();
        int A[]=new int[N];
        System.out.println("Enter Number of Elements for ArrayR");int M=sc.nextInt();
        int B[]=new int[M];
        int C[]=new int[N+M];
        System.out.println("Enter elements for Array A");
        for(int x=0;x<A.length;x++)
        {
            System.out.println("Enter Number "+(x+1));A[x]=sc.nextInt();
        }

        System.out.println("Enter Numbers for Array B");
        for(int x=0;x<B.length;x++)
        {
            System.out.println("Enter Number "+(x+1));B[x]=sc.nextInt();
        }
        
        int i=0;
        for(int x=0;x<A.length;x++)
        {
            C[i++]=A[x];
        }

        for(int x=0;x<B.length;x++)
        {
            C[i++]=B[x];
        }

        System.out.println("Array P");
        for(int x=0;x<A.length;x++)
        {
            System.out.print(A[x]+"\t");
        }

        System.out.println("\nArray R");
        for(int x=0;x<B.length;x++)
        {
            System.out.print(B[x]+"\t");
        }

        System.out.println("\nArray Q");
        for(int x=0;x<C.length;x++)
        {
            System.out.print(C[x]+"\t");
        }
    }
}