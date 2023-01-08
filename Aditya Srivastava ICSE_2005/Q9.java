class Q9 extends A
{
    public static void main()
    {
        String arr[]={"A","B","C","D","E"};
        long ar[]={100546464l,10256454657l,103654645l,104656556566l,9487241657523546l};
        System.out.println("Enter a number");
        String p=sc.nextLine();
        boolean f=false;
        for(int x=0;x<ar.length;x++)
        {
            if(arr[x].equalsIgnoreCase(p))
            {
                System.out.println("Search Succesfull\n"+ar[x]);
                f=true;
            }
        }

        if(!f)
        {
            System.out.println("Search UnsuccessFull");
        }
    }
}