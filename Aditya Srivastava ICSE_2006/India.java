import java.util.*;
class India
{
    public static void main()
    {
        String s1 = "January 26 celebrated as Republic Day of India";
        String s2=s1.replace("January","August").replace("26","15").replace("Republic","Independence");
        System.out.println(s2);
    }
}