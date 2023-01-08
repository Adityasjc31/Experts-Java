package recurrsion;

class Number
{
    public static int SumDigits(int n)
    {
        if(n%10!=0)
        {
            return  n%10+SumDigits(n/10) ;
        }
        else
        {
            return  n;
        }
    }

    public static int SumOddDigits(int n)
    {
        if(n!=0)
        {
            return ((n%10)%2==1 ? n%10  :  0 )+SumOddDigits(n/10) ;
        }
        else
        {
            return 0;
        }
    }
    
    public static int SumEvenDigits(int n)
    {
        if(n>=10)
        {
            return (
            (n%10)
            %2==0 ? 
            n%10  :  
            0 )
            +SumEvenDigits(n/10) ;
        }
        else
        {
            return n==0 ? 1 : n;
        }
    }
    
    public static double pow(int a,int b)
    {
        if(b>0)
        {
            return a*pow(a,b-1);
        }
        else if(b==0)
        {
            return 1;
        }
        else
        {
            return 1/pow(a,-b);
        }
    }
}