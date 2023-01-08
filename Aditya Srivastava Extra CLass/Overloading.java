class Overloading
{
    void num_calc(int num,char ch)
    {
        if(ch=='s')
        {
            System.out.println("Square = "+(num*num));
        }
        else 
        {
            System.out.println("Cube = "+(num*num*num));
        }
    }

    void num_calc(int a,int b,char ch)
    {    
        if(ch=='p')
        {
            System.out.println("Product="+(a*b));
        }
        else
        {
            System.out.println("Sum="+(a+b));
        }
    }

    void num_calc(String s1,String s2)
    {
        if(s1.compareTo(s2)==0)
        {
            System.out.println("They are equal");
        }
        else
        {
            System.out.println("They are not equal");
        }
    }
    
}