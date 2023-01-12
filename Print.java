public class Print
{
    public static void main(String args[])throws Exception
    {
        for(int x=11;x<=100;x++)
        {
            for(int y=x;y<=x+9;y++)
            {
                System.out.print(y+"%,");
            }
            System.out.println("{\ntop: ;\n}");
            if(x/10 == 0){
                Thread.sleep(1000);
            }
        }
    }
}