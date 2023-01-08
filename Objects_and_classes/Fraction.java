package Objects_and_classes;

class Fraction
{
    private int n,d;
    private int HCF(int nn,int dd)
    {
        int s=nn<dd? nn : dd;
        int b=nn>dd? nn : dd;
        int h=1;
        for(int x=1;x<=s;x++)
        {
            if(s%x==0 && b%x==0)
            {
                h=x;
            }
        }
        return h;
    }

    private void reduce()
    {
        int h=HCF(n,d);
        n=n/h;
        if(n!=0)
            d=d/h;
        else
            d=1;
    }

    public static Fraction toFraction(String n)
    {
        int i=n.indexOf('/');
        if(i==-1)
        {
            return new Fraction();
        }
        else
        {
            int nn=Integer.parseInt(n.substring(0,i));
            int dd=Integer.parseInt(n.substring(i+1));
            return new Fraction(nn,dd);
        }
    }

    public static Fraction toFraction(double n)
    {
        int d=1;
        while(n!=(int)n)
        {
            d=d*10;
            n=n*10;
        }
        return new Fraction((int)n,d);
    }

    public float toFloat()
    {
        return n/(float)d;
    }

    public double toDouble()
    {
        return n/(double)d;
    }

    public String toString()
    {
        return n+"/"+d;
    }

    public Fraction multiply(Fraction t)
    {
        return new Fraction(t.n*n,d*t.d);
    }

    public Fraction divide(Fraction t)
    {
        return new Fraction(n*t.d,d*t.n);
    }

    public Fraction sub(Fraction t)
    {
        return new Fraction(t.d*n - d*t.n ,t.d*d);
    }

    public Fraction add(Fraction t)
    {
        return new Fraction(t.d*n + d*t.n ,t.d*d);
    }

    public void display()
    {
        System.out.println(n+"/"+d);
    }

    public Fraction(int nn)
    {
        n=nn;
        d=1;
    }

    public Fraction()
    {
        n=0;
        d=1;
    }

    public Fraction(int nn,int dd)
    {
        n=nn;
        d=dd;
        reduce();
    }
}