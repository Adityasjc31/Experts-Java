package Number_System;
import java.util.*;
class Binary_HexaDecimal
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Number");
        String s=sc.next();
        System.out.println("HexaDecimal Number : "+Decimal_Binary_Point.Binary(HexaDecimal_Decimal_Point.Decimalpoint(s)));
    }
}