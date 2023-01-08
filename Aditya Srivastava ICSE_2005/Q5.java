class Q5 extends A
{
    public static void main(String args [])
    {
        System.out.println("Enter a word");
        String w=sc.next().toUpperCase();
        int v=0;String r="";
        for(int x=0;x<w.length();x++)
        {
            char ch=w.charAt(x);
            if(ch=='A' || ch=='I' || ch=='O' || ch=='E' || ch=='U')
            {
                v++;
            }
            r=ch+r;
        }
       
        System.out.println("Total number of Characters : "+w.length());
        System.out.println("Number of Vowels : "+v);
        System.out.println("Reverse string : "+r);
    }
}