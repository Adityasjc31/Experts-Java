import java.util.*;
class Pre_Board
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter school code");
        String l=sc.nextLine();
        if(l.equalsIgnoreCase("SJC"))
        {
            System.out.println("Your pre-board will be conducted in January-2019");
        }
        else
        {
            System.out.println("Your pre-board will be conducted in December-2018");
        }
    }
}