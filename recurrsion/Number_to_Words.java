package recurrsion;

class Number_to_Words
{
    static String a[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","","","","",""};
    static String b[]={"Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    
    public static String toWords(long n)
    {
        if(n<0)
        {
            return "minus "+toWords(-n);
        }
        else if(n<=19)
        {
            return a[(int)n];
        }
        else if(n<=99)
        {
            int x=(int)n%10;
            int y=(int)n/10;
            if(x!=0)
            {
                return b[y-2]+" "+toWords(x);
            }
            else
            {
                return b[y-2];
            }
        }
        else if(n<=999)
        {
            int x=(int)n%100;
            int y=(int)n/100;
            if(x!=0)
            {
                return a[y]+" Hundred "+toWords(x);
            }
            else
            {
                return a[y]+" Hundred";
            }
        }
        else if(n<=99999)
        {
            int x=(int)n%1000;
            int y=(int)n/1000;
            if(x!=0)
            {
                return toWords(y)+" Thousand "+toWords(x);
            }
            else
            {
                return toWords(y)+" Thousand";
            }
        }
        else if(n<=9999999)
        {
            int x=(int)n%100000;
            int y=(int)n/100000;
            if(x!=0)
            {
                return toWords(y)+" Lakh "+toWords(x);
            }
            else
            {
                return toWords(y)+" Lakh";
            }
        }
        else
        {
            int x=(int)n%10000000;
            int y=(int)n/10000000;
            if(x!=0)
            {
                return toWords(y)+" Crore "+toWords(x);
            }
            else
            {
                return toWords(y)+" Crore";
            }
        }
    }
}