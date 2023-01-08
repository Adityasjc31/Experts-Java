public class SingleDimesionFittedto2DArray
{
    public static int[][] fit(int ar[])
    {
        int arr[][] = new int[ar.length][ar.length];
        for(int x=ar.length-1;x>=0;x--)
        {
            for(int y=0;y<=x;y++)
            {
                arr[ar.length-1-x][y] = ar[y];
            }

            for(int y=x,i=0;y>0 && y<ar.length;y++,i++)
            {
                arr[ar.length-x][y] = ar[i];
            }
        }
        return arr;
    }

    public static void display(int ar[][])
    {
        for(int x=0 ; x<ar.length; x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                System.out.print(ar[x][y]+"\t");
            }
            System.out.println();
        }
    }
}