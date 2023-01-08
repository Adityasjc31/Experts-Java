class Test
{
    int a;
    static int b;
    public void input(int a , int b)
    {
        this.a=a;
        Test.b=b;
    }
    
    public void display()
    {
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    
    public static void main(String args [])
    {
        Test t = new Test();
        t.display();
    }
}