class Q8 extends A
{
    void check(String str , char ch)
    {
        int c=0;
        for(int x=0 ;x<str.length();x++)
        {
            char ce=str.charAt(x);
            if(ce==ch)
            {
                c++;
            }
        }
        System.out.println("Number of "+ch+" present is : "+c);
    }

    void check(String s1)
    {
        for(int x=0;x<s1.length();x++)
        {
            char ch=s1.charAt(x);
            if(ch=='A' || ch=='a' || ch=='e' || ch=='E' || ch=='I' || ch=='i' ||ch=='O' ||ch=='o' ||ch=='U' || ch=='u')
            {    
                System.out.println(ch);
            }
        }
    }
}