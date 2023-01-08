class Q6 extends A
{
    public static void main(String args [])
    {
        System.out.println("Menu\n1 - Sum of series\n2 - Series\nEnter your choice");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
            int x=2;
            double S=0.0;
            for(int y=1 ; y<=20;y++)
            {
                if(y%2==1)
                {
                    S+=Math.pow(x,y);
                }
                else
                {
                    S-=Math.pow(x,y);
                }
            }
            System.out.println("S = "+S);
            break;

            case 2:
            int r=1;
            for(int a=1;a<=5;a++)
            {
                for(int b=1;b<=a;b++)
                {
                    System.out.print(r);
                }
                System.out.print("\t");
            }
            break;

            default:
        }
    }
}