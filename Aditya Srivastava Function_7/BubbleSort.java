import java.util.*;
class BubbleSort
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int n[]=new int [10];
        for(int x=0;x<n.length;
        System.out.println("Enter any number"),n[x]=sc.nextInt(),x++);
        Sort.sort(n);
        for(int x=0;x<n.length;
        System.out.print(n[x]+" "),x++);
    }
}