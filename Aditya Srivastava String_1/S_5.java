import java.util.*;
class S_5
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);int c=0;
        for(int x= 1 ;x<=10 ;System.out.println("Enter any string"),x++)
        {
            String s = sc.nextLine();
            if(s.length()==5)
            {
                c++;
            }
        }
        System.out.println(c + " strings are length of 5");
    }
}