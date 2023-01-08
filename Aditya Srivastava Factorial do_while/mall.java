import java.util.*;
class mall
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int s=0,c=1,ch;
        do
        {
            System.out.println("Enter price "+c);int n=sc.nextInt();
            c++;s+=n;
            System.out.println("More items ? - (1-yes/0-no)");ch=sc.nextInt();
        }while(ch==1);
        System.out.println("Bill="+s);
    }
}