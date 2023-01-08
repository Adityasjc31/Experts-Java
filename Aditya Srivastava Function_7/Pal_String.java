class Pal_String
{
    public static boolean b(String n)
    {
        String r="";
        for(int x=0;x<n.length();x++)
        {
            if(n.charAt(x)!=' ')
            {
                r=n.charAt(x)+r;
            }
        }
        return r.equalsIgnoreCase(n);
    }
}