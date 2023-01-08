public class Bubble_Sort_DO_WHILE_LOOP
{
    public static void sort(int ar[])
    {
        boolean sorted;
        int upto = ar.length - 2;
        do
        {
            sorted=true;
            for(int y=0;y<=upto;y++)
            {
                if(ar[y]>ar[y+1])
                {
                    sorted=false;
                    int t=ar[y];
                    ar[y] = ar[y+1];
                    ar[y+1] = t;
                }
            }
            upto--;
        }while(!sorted);
        display(ar);
    }
    
    public static void display(int ar[])
    {
        for(int x=0;x<ar.length;x++)
        {
            System.out.print(ar[x] + "\t");
        }
    }
}