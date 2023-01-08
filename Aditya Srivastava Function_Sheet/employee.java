import java.util.*;
class employee
{
    String na;int pa;
    double ta,ta1;

    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Pan Number");
        pa=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name");na=sc.nextLine();
        System.out.println("Enter taxable Income");ta1=sc.nextDouble();

    }

    public void display()
    {
        System.out.println("Pan Number\tName\t\tTax-Income\tTax");
        System.out.println(pa+"\t\t"+na+"\t\t"+ta1+"\t\t"+ta);
    }

    public void calc()
    {
        if(ta1>=100001 && ta1<=150000)
        {
            ta=(10/100.0)*(ta1-100000);
        }
        else if(ta1>=150001 && ta1<=250000)
        {
            ta=(20/100.0)*(ta1-150000)+5000;
        }
        else if(ta1>250000)
        {
            ta=(30/100.0)*(ta1-250000)+25000;
        }
    }

    public static void main()
    {
        //System.out.println("To Stop The Type \"Stop\"");
        employee t = new employee();
        t.accept();
        t.calc();
        t.display();
    }
}