package Objects_and_classes;

class Point
{
    double x,y;
    public double distance(Point t)
    {
        return Math.sqrt(Math.pow(t.x-x,2) + Math.pow(t.y-y,2));
    }

    public static double distance(Point t,Point g)
    {
        return Math.sqrt(Math.pow(t.x-g.x,2) + Math.pow(t.y-g.y,2));
    }

    public Point midpoint(Point p)
    {
        Point o = new Point();
        o.x=(x+p.x)/2;
        o.y=(y+p.y)/2;
        return o;
    }

    public static Point midpoint(Point p , Point q)
    {
        Point o = new Point();
        o.x=(q.x+p.x)/2;
        o.y=(q.y+p.y)/2;
        return o;
    }

    public void display()
    {
        System.out.println("("+x+","+y+")");
    }

    public void input(int xx,int yy)
    {
        x=xx;
        y=yy;
    }
}