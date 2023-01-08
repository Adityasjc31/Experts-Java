import java.util.*;
class StartsWith
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int c=0;
        for(int x=1;x<=10;x++)
        {
            System.out.println("Enter name "+x);
            String n=sc.nextLine().toLowerCase()+" ";
            if(n.startsWith("aditya "))
            {
                c++;
            }
        }
        System.out.println(c+" starts with \"Aditya\"");
    }
}