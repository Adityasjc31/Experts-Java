import java.util.*;
class Marks
{
    public static void readfile(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks");
        int m=sc.nextInt();
        System.out.println(m>=40?"Pass":"Fail");
    }
}