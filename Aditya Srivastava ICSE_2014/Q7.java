class Q7
{
    double area(double a,double b,double c)
    {
        double f=(a+b+c)/2;
        return Math.sqrt(f*(f-a)*(f-b)*(f-c));
    }
    
    double area(int a,int b,int height)
    {
        return 0.5*(double)height*(a+b);
    }
    
    double area(double diagonal1,double diagonal2)
    {
        return 0.5*(diagonal1 * diagonal2);
    }
}