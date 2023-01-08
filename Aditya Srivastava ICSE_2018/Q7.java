class Q7
{
    double volume(double R)
    {
        double V=4/3.0*22/7.0*(R*R*R);
        return V;
    }
    
    double volume(Double H,double R)
    {
        double V=22/7.0*(R*R)*H;
        return V;
    }
    
    double volume(double L,double B,double H)
    {
        double V=L*B*H;
        return V;
    }
}