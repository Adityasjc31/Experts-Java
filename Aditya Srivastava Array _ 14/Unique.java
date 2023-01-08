import java.util.*;
class Unique
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        for(int x=0;x<ar.length;System.out.println("Enter any number "),ar[x]=sc.nextInt(),x++);
        boolean u=true;
        Aditya :
        for(int x=0;x<ar.length-1;x++)
        {
            for(int y=x+1;y<ar.length-1;y++)
            {
                if(ar[x]==ar[y])
                {
                    u=false;
                    break Aditya;
                }
            }
        }
        if(u==true)
        {
            System.out.print("All Numbers are Unique Numbers");
        }
        else
        {
            System.out.println("One or more Numbers are not Unique");
        }
    }
}