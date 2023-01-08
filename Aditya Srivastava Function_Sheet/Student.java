import java.util.*;
class Student
{
    String name;int age , m1 , m2 , m3 , maximum;double average;
    public Student(String n , int m1 , int m2 , int m3)
    {
        name = n;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        name=sc.nextLine();
        System.out.println("Enter marks in Subject 1");
        m1=sc.nextInt();
        System.out.println("Enter marks in Subject 2");
        m2=sc.nextInt();
        System.out.println("Enter marks in Subject 3");
        m3=sc.nextInt();
    }

    public void calc()
    {
        maximum = Math.max(m1 , Math.max(m2,m3));
        average = (m1+m2+m3) / 3.0;
    }

    public void display()
    {
        System.out.println("Name = "+name);
        System.out.println("Marks in Subject 1 = "+m1);
        System.out.println("Marks in Subject 2 = "+m2);
        System.out.println("Marks in Subject 3 = "+m3);
        System.out.println("Maximum = "+maximum);
        System.out.println("Average = "+average);
    }

    public static void main()
    {
        Student ob = new Student("Aditya",90,95,100);
        ob.calc();
        ob.display();
        
        ob.input();
        ob.calc();
        ob.display();
    }
}