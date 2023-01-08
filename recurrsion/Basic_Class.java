package recurrsion;

class Basic_Class
{
    public static void Error()
    {
        System.out.println("Aditya");
        Error();
    }

    public static void display_name(int n)
    {
        System.out.println("Aditya");
        if(n>1) display_name(n-1);
    }
    
    public static void display_numbers(int n)
    {
        System.out.println(n);
        if(n>1) display_numbers(n-1);
    }
    
    public static void display_num_ascending(int n)
    {
        if(n>1) display_num_ascending(n-1);
        System.out.println(n);
    }
    
    public static void display_dollar_hastag(int n)
    {
        System.out.print("$");
        if(n>1) display_dollar_hastag(n-1);
        System.out.print("#");
    }
    
    public static void output(int n)
    {
        System.out.print("*");
        if(n>1)
        {
            output(n-1);
        }
        System.out.print("$");
        if(n>1)
        {
            output(n-1);
        }
        System.out.print("#");
    }
}