class Q9 extends A
{
    public static void main(String args [])
    {
        int ar[]={1982,1987,1993,1996,1999,2003,2006,2007,2009,2010};
        System.out.println("Enter year to be searched");
        int n=sc.nextInt();
        int min=0,max=ar.length-1;
        boolean f=false;
        while(min<=max)
        {
            int mid=(max+min)/2;
            if(n==ar[mid])
            {
                f=true;
                System.out.println(ar[mid]+" Found at index "+mid);break;
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
        
        if(!f)
        {
            System.out.println("Record does not exist");
        }
    }
}