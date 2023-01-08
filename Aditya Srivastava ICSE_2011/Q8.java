class Q8
{
    void compare(int a , int b)
    {
        System.out.println("Greater number = "+((a>b) ? a : b));
    }

    void compare(char a , char b)
    {
        System.out.println("Greater character = "+((a>b)? a : b));
    }

    void compare(String a , String b)
    {
        System.out.println("Greater string in Length = "+((a.length()>b.length()) ? a : b));
    }
}