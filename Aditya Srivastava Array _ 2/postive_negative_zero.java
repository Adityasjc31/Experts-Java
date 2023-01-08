import java.util.*;
class postive_negative_zero
{
    public static void main(String args [])
    {
        int a[] = new int[10];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter number "+(i+1));
            int n1=sc.nextInt();
            a[i]=n1;
        }
        System.out.print("\f");
        System.out.println("Given Postive,Negative Or Zero : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
            if(i<(a.length)-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("");
        int p=0,n=0,z=0;//int aay[]=new int[arr.length];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
                n++;
            }
            else if(a[i]>0)
            {
                p++;
            }
            else if(a[i]==0)
            {
                z++;
            }
        }
        System.out.println("Postive Numbers are : "+p);
        System.out.println("Negative Numbers are : "+n);
        System.out.println("Zeros are : "+z);
    }
}