import java.util.*;
class Array
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        double av[]= new double [50];
        int [] rn,s1,s2,s3;
        rn=new int[50];s1=new int[50];s2=new int[50];s3=new int[50];
        for(int x=0;x<rn.length;x++)
        {
            System.out.println("Enter your roll number");
            rn[x]=sc.nextInt();
            System.out.println("Enter marks 1 for student "+(x+1));
            s1[x]=sc.nextInt();
            System.out.println("Enter marks 2 for student "+(x+1));
            s2[x]=sc.nextInt();
            System.out.println("Enter marks 3 for student "+(x+1));
            s3[x]=sc.nextInt();
            System.out.println("Average = "+(av[x]=(s1[x]+s2[x]+s3[x])/3.0));
        }

        System.out.println("Roll no\t  Subject A\tSubject B\tSubject C");
        for(int x=0;x<rn.length;x++)
        {
            System.out.println(rn[x]+"\t  "+s1[x]+"\t\t"+s2[x]+"\t\t"+s3[x]);
        }

        System.out.println("Student getting above 80");
        for(int x=0;x<rn.length;x++)
        {
            if(av[x]>80)
                System.out.println(rn[x]+"\t"+av[x]);
        }

        System.out.println("Student getting below 40");
        for(int x=0;x<rn.length;x++)
        {
            if(av[x]<40)
                System.out.println(rn[x]+"\t"+av[x]);
        }
    }
}