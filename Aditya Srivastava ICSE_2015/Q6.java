class Q6 extends S
{
    public static void main(String args [])throws Exception
    {
        System.out.println("Enter number of students");
        int n=sc.nextInt();
        String []rn=new String[n],na=new String[n];
        int []m1=new int[n],m2=new int[n],m3=new int[n];
        System.out.print("\f");
        for(int x=0 ;x < n ; x++)
        {
            sc.nextLine();
            System.out.println("Enter name of student "+(x+1));
            na[x]=sc.nextLine();
            System.out.println("Enter roll number of "+na[x]);
            rn[x]=sc.nextLine();
            System.out.println("Enter marks in subject 1");
            m1[x]=sc.nextInt();
            System.out.println("Enter marks in subject 2");
            m2[x]=sc.nextInt();
            System.out.println("Enter marks in subject 3");
            m3[x]=sc.nextInt();
            double av=(m1[x]+m2[x]+m3[x])/3.0;
            if(av>=85 && av<=100)
            {
                System.out.println("EXCELLENT");
            }
            else if(av>=75 && av<85)
            {
                System.out.println("DISTINCTION");
            }
            else if(av>=60 && av<75)
            {
                System.out.println("FIRST CLASS");
            }
            else if(av>=40 && av<60)
            {
                System.out.println("PASS");
            }
            else if(av>=0 && av<40)
            {
                System.out.println("POOR");
            }
            Thread.sleep(1000);
            System.out.print("\f");
        }
    }
}