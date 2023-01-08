class Q9 extends A
{
    public static void main(String args [])
    {
        String ar[] = new String[40];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter a word");ar[x]=sc.nextLine();
        }
        
        for(int x=0;x<ar.length;x++)
        {
            int in=x;
            
            for(int y=x+1;y<ar.length;y++)
            {
                if(ar[y].compareToIgnoreCase(ar[in])>0)
                {
                    in=y;
                }
            }
            
            String t=ar[x];
            ar[x]=ar[in];
            ar[in]=t;
        }
        
        System.out.println("Desending order : ");
        for(int x=0;x<ar.length;x++)
        {
            System.out.println(ar[x]);
        }
    }
}