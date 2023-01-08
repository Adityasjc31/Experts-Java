import java.util.*;
class Student
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int s=0,hm=0;
        String t="";
        for(int x=1;x<=50;x++)
        {
            System.out.println("Enter name ");
            String n=sc.next();
            System.out.println("Enter marks of "+n);
            int m=sc.nextInt();
            s=s+m;
            if(m>hm)
            {
                hm=m;
                t=n;
            }
        }
        System.out.println("Average Marks : "+((s/50.0)));
        System.out.println("The highest marks scored by "+t+" is "+hm );
    }
}