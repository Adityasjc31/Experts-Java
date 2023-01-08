import java.util.*;
class S_8
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);String ar[]=new String[10];
        for(int x= 0 ;x<10 ;x++)
        {
            System.out.println("Enter any string");
            ar[x] = sc.nextLine();
        }
        System.out.println("\n");
        for(int x=0;x<10;x++)
        {
            if(ar[x].length()>=8)
                System.out.println(ar[x]);
        }
    }
}