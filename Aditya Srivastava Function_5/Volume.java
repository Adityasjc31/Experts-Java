class Volume
{
    public static void calc(int s)
    {
        System.out.println("Volume of a cube "+(s*s*s));
    }
    
    public static void calc(double r)
    {
        System.out.println("Volume of Sphere "+(double)(4/3*22/7*r*r*r));
    }
    
    public static void calc(int l,int b, int h)
    {
        System.out.println("Volume of a cubiod "+(l*b*h));
    }
}