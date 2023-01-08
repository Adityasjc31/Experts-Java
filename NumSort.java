import java.util.*;
class NumSort
{
    int arr[],num;
    public NumSort(int n)
    {
        num=n;
        arr=null;
    }
    
    public void extract_digits()
    {
        String s=num+"";
        arr=new int[s.length()];
        int temp=num;
        for(int x=0;temp!=0;x++)
        {
            arr[x]=temp%10;
            temp=temp/10;
        }
    }
    
    public void sort()
    {
        for(int x=0;x<arr.length;x++)
        {
            int i=x;
            for(int y=x+1;y<arr.length;y++)
            {
                if(arr[i]<arr[y])
                {
                    i=y;
                }
            }
            int t=arr[x];
            arr[x]=arr[i];
            arr[i]=t;
        }
    }
    
    public void display()
    {
        System.out.println("Original Number : "+num);
        System.out.print("Number after sorting in desinding order : ");
        for(int x=0;x<arr.length;x++)System.out.print(arr[x]);
    }
    
    public static void main(String args [])
    {
        System.out.println("Enter a number");
        int n=new Scanner(System.in).nextInt();
        NumSort ns = new NumSort(n);
        ns.extract_digits();
        ns.sort();
        ns.display();
    }
}