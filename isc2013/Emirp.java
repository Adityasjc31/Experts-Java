package isc2013;

/**ISC 2013*/
class Emirp
{
    int n,rev,f;
    Emirp(int nn)
    {
        n=nn;
        rev=0;
        f=2;
    }

    int isprime(int x)
    {
        if(f==x)
        {
            f=2;
            return 1;
        }
        else if(x%f==0)
        {
            f=2;
            return 0;
        }
        else
        {
            f++;
            return isprime(x);
        }
    }

    void isEmirp()
    {
        for(int x=n;x!=0;x=x/10)
        {
            rev = rev*10 + x%10;
        }
        if(isprime(rev)==1 && isprime(n)==1)
        {
            System.out.println("It is an Emirp Number");
        }
        else
        {
            System.out.println("It is not an Emirp Number");
        }
    }
    //main
}