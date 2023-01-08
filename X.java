class X
{
    public void parentBit(String s)
    {
        //char ch=s.charAt(0);

        //char ch2=s.charAt(s.length()-1);
        /*if(s.charAt(0)!='(' )
        {
        s=s.substring(1);
        return parentBit(s);
        }

        else if (s.charAt (s.length ()-1) !=')')
        {
        s=s.substring(0,s.length()-1); 
        return parentBit(s);
        }
        else
        {
        return s;
        }*/

        /*String sub=""; String str = "BusyBee"; int l = str.length();
        for(int x= 0; x<=l ; x=x+2 ){ sub= str.substring( x , l); System.out.println(sub);}*/

        char ch; int asc; String str="0139487"; int l=str.length( );
        for(int x= l-1 ; x>=0 ; x-- ) 
        {
            ch= str.charAt(x); 
            asc = (int)(ch);
            if(asc<53){
                asc += 17;
                ch= (char)asc;
            }
            System.out.print(ch); }
    }

    public static void fnX()
    {
        String str1 = "", str2 = "" ; String str = "COVID-19" ;
        for( int x=0 ; x < str.length() ; x +=2 )
        {
            if ( x!= 6 )
            str1= str.substring( x , x + 2 ) + str1 ;
            else 
            break ; 
        }
        str2 = str1 + str.substring(x) ;
        System.out.println (str1 ) ; System.out.println(str2) ;
    }
}