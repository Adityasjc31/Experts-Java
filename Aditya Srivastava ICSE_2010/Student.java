class Student extends A
{
    String name;
    int age,m1,m2,m3,maximum;
    double average;
    public Student(String n,int age,int m1,int m2,int m3)
    {
        name=n;
        this.age=age;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;int m=0;
        maximum=0;average=0.0;
    }

    public void accept()
    {
        System.out.println("Enter the xstudent name : ");name=sc.nextLine();
        System.out.println("Enter the age of "+name);age = sc.nextInt();
        int ar[]=new int[2];
        for(int x=1;x<=3;System.out.println("Enter marks for subject m"+x),ar[x-1]=sc.nextInt(),x++);
        m1=ar[0];
        m2=ar[1];
        m3=ar[2];
    }

    public void compute()
    {
        int m=0;
        if(m1<m2)
        {
            if(m2<m3)
            {
                m=m3;
            }
            else
            {
                m=m2;
            }
        }
        else if(m1>m2)
        {
            if(m1>m3)
            {
                m=m1;
            }
            else
            {
                m=m3;
            }
        }
        maximum=m;
        average = (m1+m2+m3)/3.0;
    }

    public void display()
    {
        System.out.println("Name = "+name+"\nAge = "+age+"\nMarks in 1st subject : "+m1+"\nMarks in 2nd subject : "+m2+"\nMarks in 3rd subject : "+m3+"\nMaximum marks : "+maximum+"\nAverage = : "+average);
    }

    public static void main(String args [])
    {
        Student s=new Student("Aditya",12,100,80,90);
        s.compute();
        s.display();

        s.accept();
        s.compute();
        s.display();
    }
}