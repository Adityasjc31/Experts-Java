package Inhertiance.Normal_Rectangle;

class Call_Rectangle_Cuboid
{
    public static void main(String args[])
    {
        /*Rectangle r = new Rectangle();
        r.input();
        int ar = r.area();
        System.out.println("Area = "+ar);*/
        
        Cuboid c = new Cuboid();
        c.input(5,4,6);
        int v = c.volume();
        System.out.println("Volume = "+v);
    }
}