class Q7 extends S
{
    void JoyString(String s, char ch1 ,char ch2)
    {
         System.out.println(s.replace(ch1,ch2));
    }
    
    void JoyString(String s)
    {
        System.out.println("First Index : "+s.indexOf(' ')+"\nLast Index : "+s.lastIndexOf(' '));
    }
    
    void JoyString(String s1 , String s2)
    {
        String s=s1.concat(" ");
        System.out.println(s.concat(s2));
    }
}