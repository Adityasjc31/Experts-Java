package array_2_D;

class rotate_90_ClockWise
{
    public static int[][] rotate90C(int ar[][])
    {
        int r9[][]=new int[ar[0].length][ar.length];
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                r9[y][(ar.length-1)-x]=ar[x][y];
            }
        }
        return r9;
    }
    
    public static void main(String args [])
    {
        int r=Value_Integer.take("rows");
        int c=Value_Integer.take("columns");
        int ar[][]=new int[r][c];
        Inplay.input(ar);
        ar=rotate90C(ar);
        System.out.println("90° rotated Clockwise");
        Inplay.display(ar,0);
    }
}