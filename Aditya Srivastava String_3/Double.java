import java.util.*;
class Double
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String s=sc.nextLine().toUpperCase();

        int l=s.length()-1;int c=0;
        for(int y=0;y<l;y++)
        {
            if(s.charAt(y)==s.charAt(y+1))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}