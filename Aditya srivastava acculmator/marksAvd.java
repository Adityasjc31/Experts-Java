import java.util.*;
class marksAvd 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int su=0;
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter marks in subject "+(i+1));
            int m=sc.nextInt();
            su=su+m;
        }
        System.out.println("Total Marks = "+su);
        System.out.println("Average = "+(su/10d));
    }
}