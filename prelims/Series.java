package prelims;

class Series extends Number
{
    int sum;
    Series(int n)
    {
        super(n);
        sum = 0;
    }
    
    void calsum()
    {
        //Calculating the factorial
        for(int x=1 ; x<=n ;x++)
        {
            sum = sum + factorial(x);
        }
    }
    
    void display()
    {
        //Displaying the number
        super.display();
        //Displaying the sum of series
        System.out.println("Sum of series : "+sum);
    }
}