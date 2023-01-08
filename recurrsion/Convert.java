package recurrsion;

class Convert
{
    int d,b,oct;
    public Convert()
    {
        d=b=oct=0;
    }

    public void input(int d)
    {
        this.d=d;
    }

    public void toBinary()
    {
        int t=d;
        int r=d%2;
        d/=2;
        if(d>0)
        {
            toBinary();
        }
        b=b*10+r;
        d=t;
    }

    public void toOctal()
    {
        int t=d;
        int r=d%8;
        d/=8;
        if(d!=0)
        {
            toOctal();
        }
        oct=oct*10+r;
        d=t;
    }
}