package Number_System;
import java.util.*;
class Binary_Octal
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Number :-");
        String n=sc.next();
        System.out.println("Octal Number : "+(Decimal_Octal_Point.Octal(Binary_Decimal_Point.toDecimal(n))));
    }
}