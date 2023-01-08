package recurrsion;
class count8
{
    public static int count8(int n)//8818,881,88
    {
        if(n!=0)
        {
            int t=n%10;//8,1,8
            if(t==8)//
            {
                n=n/10;
                int t1=n%10;//1,8
                if(t==t1)//false,true
                {
                    return 2+count8(n);//2
                }
                else
                {
                    return 1+count8(n);//3
                }
            }
            else
            {
                return count8(n=n/10);//(88)
            }
        }
        else
        {
            return 0;
        }
    }
}
