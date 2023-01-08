class Volume
{
    public Volume(int s)
    {
        System.out.println("Volume of a cube "+(s*s*s));
    }
    
    public Volume(int p , int r)
    {
        System.out.println("Volume of Sphere "+(double)(4/3*22/7*r*r*r));
    }
    
    public Volume(int l,int b, int h)
    {
        System.out.println("Volume of a cubiod "+(l*b*h));
    }
}