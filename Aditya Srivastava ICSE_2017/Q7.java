class Q7 extends A
{
    public static void main(String args [])
    {
        int ar[] = new int[20];
        int sm=ar[0];
        int bi=ar[0];
        int s=0;
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter a number");ar[x]=sc.nextInt();        
        }
        
        for(int x=0;x<ar.length;x++)
        {
            s=s+ar[x];
            if(ar[x]>bi)
            {
                bi=ar[x];
            }
            else
            {
                sm=ar[x];
            }
        }
        System.out.println("Sum of the array = "+s);
        System.out.println("Smallest Number of the array : "+sm);
        System.out.println("Largest number of the array : "+bi);
    }
}