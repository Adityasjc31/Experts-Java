import java.util.*;
class Lucky_Number
{
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        int n=new Scanner(System.in).nextInt();
        int ar[]=new int[n];
        for(int x=0;x<n;)
        {
            ar[x]=++x;
        }
        int i=2;
        /**
        ar[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19];
        ar[1,3,5,7,9,11,13,15,17,19];
        ar[1,3,7,9,13,15,19];
        ar[1,3,7,13,15,19];
        ar[1,3,7,13,19];
         */
        boolean deleted=false;
        do
        {
            int c=1;
            deleted=false;
            for(int x=0;x<n;x++)
            {
                if(ar[x]!=0)
                {
                    if(c==i)
                    {
                        c=0;
                        deleted=true;
                        ar[x]=0;
                    }
                    c++;
                }
            }
            i++;
        }
        while(deleted);

        for(int x=0;x<n;x++)
        {
            if(ar[x]!=0)
                System.out.print(ar[x]+"  ");
        }
    }
}