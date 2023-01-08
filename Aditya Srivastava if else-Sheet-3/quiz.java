import java.util.*;
class quiz
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter school code");
        String l=sc.nextLine();        
        System.out.println("Enter City");
        String b=sc.nextLine();
        if(l.equalsIgnoreCase("SJC")&&b.equalsIgnoreCase("Allahabad"))
        {
            System.out.println("You can take part in quiz.");
        }
        else
        {
            System.out.println("You are not eligible.");
        }
    }
}