public class X
{
    public static void main(String args[])
    {
        int sn[] = {1,2,3,4,5,6};
        String n[] = {"pen","book","pencil","Sharpner","bag"};
        int p[] = {5,250,3,5,1000};
        for(int x=0;x<5;x++)
        {
            String s = String.format("%5d  %-25s  %10s",sn[x],n[x],p[x]);
            System.out.println(s);
        }
    }
}