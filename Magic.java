import java.util.*;
class Magic
{
    String str;
    public Magic()
    {
        str="";
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        str=sc.next().toUpperCase();
    }
    
    public boolean check()
    {
        for(int x=0;x<str.length()-1;x++)
        {
            char ch1=str.charAt(x);
            char ch2=str.charAt(x+1);
            if(ch1!=' ')
            {
                if(Math.abs((int)(ch2-ch1))==1)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void display()
    {
        if(check())
        {
            System.out.println("Magic Word");
        }
        else
        {
            System.out.println("Not a Magic Word");
        }
    }
    
    public static void main(String args[])
    {
        Magic m = new Magic();
        m.input();
        m.display();
    }
}