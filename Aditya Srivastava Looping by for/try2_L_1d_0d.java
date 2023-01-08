class try2_L_1d_0d
{
    public static void main(String args [])
    {
        for(double x=1;x<=5;x+=0.5)
        {
            if((int)(x)>(x+1))
            {
                System.out.println(x);
            }
            else
            {
                System.out.println((int)x); 
            }
        }
    }
}