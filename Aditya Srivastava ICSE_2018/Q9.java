import java.util.*;
class Q9
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student");
        int N=sc.nextInt();
        String na[]=new String[N];
        double tm[]=new double[N];
        
        for(int x=0;x<N;x++)
        {
            System.out.println("Enter student name "+(x+1));
            na[x]=sc.nextLine();
            System.out.println("Enter total marks of "+na[x]);
            tm[x]=sc.nextInt();
            sc.nextLine();
        }
        
        double sum=0.0;
        for(int x=0;x<N;x++)
        {
            sum+=tm[x];
        }
        
        System.out.println("Average : "+(sum/N));
        System.out.println("Deviation : "+(sum-(sum/N)));
    }
}