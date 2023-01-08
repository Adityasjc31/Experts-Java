import java.util.*;
class Add_Sub_
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        String ch,n;
        do
        {
            System.out.println("Enter name of shape");
            ch=sc.nextLine();
            if(ch.equalsIgnoreCase("rectangle"))
            {
                System.out.println("Enter length");int l=sc.nextInt();
                System.out.println("Enter width");int w=sc.nextInt();
                System.out.println("Perimeter = "+(2*(l+w)));
            }
            else if(ch.equalsIgnoreCase("square"))
            {
                System.out.println("Enter length");int l=sc.nextInt();
                System.out.println("Perimeter = "+(4*l));
            }
            else if(ch.equalsIgnoreCase("circle"))
            {
                System.out.println("Enter radius");
                int l=sc.nextInt();
                System.out.println("Perimeter = "+(2*3.14*(double)l));
            }
            else if(ch.equalsIgnoreCase("exit"))
            {
                System.out.println("Exiting...");System.exit(100);
            }
            else
            {
                System.out.println("Wrong Choice");
            }
            String nikalo=sc.nextLine();
        }
        while(true);
    }
}