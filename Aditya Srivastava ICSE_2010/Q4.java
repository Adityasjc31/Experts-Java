class Q4 extends A
{
    public static void main(String args [])
    {
        int ar[]={5,7,9,11,15,20,30,45,89,97};
        System.out.println("Enter the number to be searched");
        int n=sc.nextInt();
        int min=0;
        int max=ar.length-1;
        while(min<=max)
        {
            int mid=(min+max)/2;
            if(n==ar[mid])
            {
                System.out.println(ar[mid]+" is at : "+mid);
                break;
            }
            else if(n>ar[mid])
            {
                min=mid+1;
            }
            else
            {
                max=mid-1;
            }
        }
    }
}