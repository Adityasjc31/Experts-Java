package Number_System;
import java.util.*;
class HexaDecimal_Binary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter HexaDecimal Number");
        String s=sc.next();
        System.out.println("Binary Number : "+Decimal_Binary_Point.Binary(HexaDecimal_Decimal_Point.Decimalpoint(s)));
    }
}