import java.util.Scanner;
import java.util.Scanner;
public class CurrencyNotes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount");
        int a=sc.nextInt();
        int n[]={2000,500,200,100,50,20,10,5,2,1};
        int c=0;
        for(int i=a;i!=0;)
        {
            int t=i/n[c];
            if(t!=0)
            {
                System.out.println(n[c]+" x "+t);
            }
            i=i-t*n[c++];
        }
    }
}