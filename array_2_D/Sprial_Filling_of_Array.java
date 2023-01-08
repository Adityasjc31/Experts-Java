package array_2_D;

class Sprial_Filling_of_Array
{
    public static void main(String args [])throws Exception
    {
        int n=Value_Integer.take("Enter value of n");
        int ar[][]=new int[n][n];
        Inplay.input(ar);
        int s[]=Change.Doubletosingle(ar);
        //         Selection.Sort(s);
        ar=Change.Spiral_right(ar,s);
        System.out.print("\nSpirally Arranged(Left)\n");
        Inplay.display(ar,0);
    }
}