class Q8 extends A
{
    public static void main(String args [])
    {
        double n,spe,spo,sn;
        spe=spo=sn=0;
        do
        {
            System.out.println("Enter a number");
            n=sc.nextDouble();
            
            if(n<0)
            {
                sn+=n;
            }
            else
            {
                if(n%2==0)
                {
                    spe+=n;
                }
                else
                {
                    spo+=n;
                }
            }
        }while(n!=0);
        
        System.out.println("Sum of negative numbers : "+sn);
        System.out.println("Sum of postive even numbers : "+spe);
        System.out.println("Sum of postive odd numbers : "+spo);
    }
}