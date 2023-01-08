import java.util.*;
class Mall_2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int s=0,c=1;char ch;
        do
        {
            System.out.println("Enter price "+c);int n=sc.nextInt();
            c++;s+=n;
            System.out.println("More items ? - (y-yes/n-no)");ch=sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
        System.out.println("Number of Items purchased = "+(c-1)+"\nBill = "+s);
    }
}