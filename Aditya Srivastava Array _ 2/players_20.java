import java.util.*;
class players_20
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[20];
        String it[]=new String[20];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter name of "+(x+1)+" player");String i=sc.nextLine();
            System.out.println("Enter the runs of "+(x+1)+" player");int p=sc.nextInt();
            ar[x]=p;it[x]=i;
            String nikalo=sc.nextLine();
        }
        System.out.print("\f");
        System.out.println("Players run : ");
        for(int x=0;x<it.length;x++)
        {
            System.out.print(it[x]);
            if(x<it.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("");
        System.out.println("Runs scored respectively : ");
        for(int x=0;x<ar.length;x++)
        {
            System.out.print(ar[x]);
            if(x<it.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("\n");
        //ar=number,it=name
        
        System.out.println("Players under 16 are");
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x]<16)
            {
                System.out.println(it[x]);
            }
        }
        
        
        System.out.println("Players greater than 16 and less than 20" );
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x]>=16 && ar[x]<20)
            {
                System.out.println(it[x]);
            }
        }
        
        
        System.out.println("Players greater than 20");
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x]>=20)
            {
                System.out.println(it[x]);
            }
        }
    }
}