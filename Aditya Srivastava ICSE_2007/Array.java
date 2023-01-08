class Array
{
    public static void main()
    {
        int ar[]={2,5,4,1,3};
        int b,s;b=s=ar[0];
        int su=0;
        for(int x=0 ;x<ar.length;x++)
        {
            if(ar[x]<s)
            {
                s=ar[x];
            }
            if(ar[x]>b)
            {
                b=ar[x];
            }
            su=su+ar[x];
        }

        System.out.println("Mininum Value : "+s+"\nMaximum Value : "+b+"\nSum of theb elements : "+su);
    }
}