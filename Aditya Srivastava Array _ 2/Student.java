import java.util.*;
class Student
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[20];
        String it[]=new String[20];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter name of "+(x+1)+" student");String i=sc.nextLine();
            System.out.println("Enter the marks of "+(x+1)+" student");int p=sc.nextInt();
            ar[x]=p;it[x]=i;
            String nikalo=sc.nextLine();
        }
        System.out.print("\f");
        System.out.println("Students names : ");
        for(int x=0;x<it.length;x++)
        {
            System.out.print(it[x]);
            if(x<it.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("");
        System.out.println("Students Marks respectively : ");
        for(int x=0;x<ar.length;x++)
        {
            System.out.print(ar[x]);
            if(x<it.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("\n");
        boolean f=false;
        System.out.println("Students getting 80 or above : ");
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x]>=80)
            {
                System.out.println(it[x]);f=true;
            }
        }
        if(!f){System.out.println("Not Found");}
        System.out.println("Students getting below 40 : ");
        f=false;
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x]<40)
            {
                System.out.println(it[x]);f=true;
            }
        }
        if(!f){System.out.println("Not Found");}
    }
}