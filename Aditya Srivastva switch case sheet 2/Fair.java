import java.util.Scanner;
class Fair
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Distance(kms)");
        int d=sc.nextInt();
        System.out.println("Menu");
        System.out.println("1\t-\tAge<25");
        System.out.println("2\t-\tAge>=10 to Age<25");
        System.out.println("3\t-\tAge>=25 to Age<60");
        System.out.println("4\t-\tAge>60");
        System.out.println("Enter Choice :");
        int c=sc.nextInt();
        int f=-1;
        switch(c)
        {
            case 1:
            if(d<10)
            {
                f=5;
            }
            else if(d>=10 && d<25)
            {
                f=8;
            }
            else if(d>=25 && d<50)
            {
                f=15;
            }
            else if(d>=50)
            {
                f=20;
            }
            else
            {
                System.out.println("Invalid Input");
            }
            break;
            case 2:
            if(d<10)
            {
                f=8;
            }
            else if(d>=10 && d<25)
            {
                f=15;
            }
            else if(d>=25 && d<50)
            {
                f=20;
            }
            else if(d>=50)
            {
                f=35;
            }
            else
            {
                System.out.println("Invalid Input");
            }
            break;
            case 3:
            if(d<10)
            {
                f=3;
            }
            else if(d>=10 && d<25)
            {
                f=10;
            }
            else if(d>=25 && d<50)
            {
                f=13;
            }
            else if(d>=50)
            {
                f=18;
            }
            else
            {
                System.out.println("Invalid Input");
            }
            break;
            default:
            System.out.println("Invalid Input");
        }
        if(d!=0)
        {
            System.out.println("Fare = Rs"+f+"/-");
        }
    }
}