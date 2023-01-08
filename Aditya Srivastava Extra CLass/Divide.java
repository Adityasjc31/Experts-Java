class Divide
{
    public static void main(double r)
    {
        int x=2;
        while(true)
        {
            if(r%x == 0)
            {
                System.out.println(r/x);
                break;
            }
            x++;
        }
    }
}