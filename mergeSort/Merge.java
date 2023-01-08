package mergeSort;

class Merge
{
    public static int[] merge(int ar1[],int ar2[])
    {
        int ar3[] = new int[ar1.length+ar2.length];
        int a=0,b=0,c=0;
        while(a<ar1.length && b<ar2.length)
        {
            if(ar1[a]>ar2[b])
            {
                ar3[c]=ar2[b];
                b++;
                c++;
            }
            else
            {
                ar3[c++] = ar1[a++];
            }
        }

        if(a<ar1.length)
        {
            for(int x=a;x<ar1.length;x++)
            {
                ar3[c++] = ar1[a++];
            }
        }
        else if(b<ar2.length)
        {
            for(int x=b;x<ar2.length;x++)
            {
                ar3[c++] = ar2[b++];
            }
        }
        return ar3;
    }
}