import java.util.*;
class Teacher_Salary
{
    String s,ad,sb;long ph,in;
    double ta;

    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of the Teacher");s=sc.nextLine();
        System.out.println("Enter "+s+" Address ");ad=sc.nextLine();
        System.out.println("Enter "+s+" Phone Number");ph=sc.nextLong();
        System.out.println("Enter the Subject "+s+" teaches");sb=sc.next();
        System.out.println("Enter his monthly income");in=sc.nextLong();
    }

    public void display()
    {
        System.out.println("Teacher Name is "+s);
        System.out.println(s+" Address is "+ad);
        System.out.println(s+" Phone Number is "+ph);
        System.out.println(s+" Teaches this subject "+sb);
        System.out.println(s+" Monthly Income is "+in);
        System.out.println(s+" Tax to be given "+ta);
    }

    public void calc()
    {
        if(in*12>175000)
        {
            ta=(5*(in*12.0-175000.0))/100.0;
        }
    }

    public static void main()
    {
        Teacher_Salary t = new Teacher_Salary();
        t.accept();
        t.calc();
        t.display();
    }
}