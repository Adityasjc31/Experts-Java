class Call_2
{
    public static void main(String args [])
    {
        Fraction f = new Fraction();
        f.display();
        
        Fraction f1 = new Fraction(5);
        f1.display();
        
        Fraction f2 = new Fraction(6,3);
        f2.display();
        f2.reduce();
        f2.display();
        
    }
}