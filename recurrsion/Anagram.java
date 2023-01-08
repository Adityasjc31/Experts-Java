package recurrsion;

class Anagram
{
    static int count=0;
    public static void anagram(String fix,String s)
    {
        if(s.length()!=1)
        {
            for(int x=0;x<s.length();x++)
            {
                String t1=s.substring (0,x);
                String t2=s.substring(x+1);
                anagram(fix+s.charAt(x),t1+t2);
            }
        }
        else
        {
            System.out.println(fix+s);
            count++;
        }
    }

    public static void disp(String s)
    {
        anagram("",s);
        System.out.print(count);
    }
}