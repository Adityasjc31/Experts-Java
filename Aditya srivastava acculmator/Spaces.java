import java.util.*;
class Spaces
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        int l=s.length(),c=0;
        for(int x=0;x<l;x++)
        {
            char ch=s.charAt(x);
            if(ch==32)
            {
                c++;
            }
        }
        System.out.println("Number of spaces present in "+s+" are : "+c);
    }
}