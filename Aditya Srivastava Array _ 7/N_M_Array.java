import java.util.*;
class N_M_Array
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entered the Number of Elements for ArrayA");int N=sc.nextInt();
        int A[]=new int[N];
        System.out.println("Enter Number of Elements for ArrayB");int M=sc.nextInt();
        int B[]=new int[M];
        int C[]=new int[N+M];
        System.out.println("Enter elements for Array A");
        for(int x=0;x<A.length;x++)
        {
            System.out.println("Enter Number "+(x+1));A[x]=sc.nextInt();
            String nikalo=sc.nextLine();
        }
        
        System.out.println("Enter Numbers for Array B");
        for(int x=0;x<B.length;x++)
        {
            System.out.println("Enter Number "+(x+1));B[x]=sc.nextInt();
            String nikalo=sc.nextLine();
        }
        
        for(int x=0;x<A.length;x++)
        {
            C[x]=A[x];
        }
        
        System.out.println("Entered Number for Second Array");
        for(int x=0;x<B.length;x++)
        {
            C[x+N]=B[x];
        }
        
        System.out.println("Array A");
        for(int x=0;x<A.length;x++)
        {
            System.out.print(A[x]+"\t");
        }
        
        System.out.println("\nArray B");
        for(int x=0;x<B.length;x++)
        {
            System.out.print(B[x]+"\t");
        }
        
        System.out.println("\nArray C");
        for(int x=0;x<C.length;x++)
        {
            System.out.print(C[x]+"\t");
        }
    }
}