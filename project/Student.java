package project;

import java.util.*;
import java.io.*;
class Student
{
    public static void read(String n)
    {
        try
        {
            FileInputStream fin=new FileInputStream("Student.dat");
            DataInputStream din=new DataInputStream(fin);
            boolean found=false,eof=false;

            while(!eof)
            {
                try
                {
                    int roll_no=din.readInt();
                    String DOB=din.readUTF();
                    String name=din.readUTF();
                    double m1=din.readDouble();
                    double m2=din.readDouble();
                    double m3=din.readDouble();
                    double m4=din.readDouble();
                    double m5=din.readDouble();
                    double total=din.readDouble();
                    double avg=din.readDouble();
                    char grade=din.readChar();
                    if(n.equalsIgnoreCase(name))
                    {
                        System.out.println("Name : "+name);
                        System.out.println("Date of birth : "+DOB);
                        System.out.println("Roll No. : "+roll_no);
                        System.out.println("Obtained Marks in subject 1 : "+m1);
                        System.out.println("Obtained Marks in subject 2 : "+m2);
                        System.out.println("Obtained Marks in subject 3 : "+m3);
                        System.out.println("Obtained Marks in subject 4 : "+m4);
                        System.out.println("Obtained Marks in subject 5 : "+m5);
                        System.out.println("Total : "+total);
                        System.out.println("Average : "+avg);
                        System.out.println("Grade : "+grade);
                        found=true;
                    }
                }
                catch(EOFException e)
                {
                    eof=true;
                }
            }
            if(!found)
            {
                System.out.println("Data does not exist");
            }
            din.close();
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println("File Not found");
        }
    }

    public static void write()
    {
        try
        {
            FileOutputStream fout=new FileOutputStream("Student.dat");
            DataOutputStream dout=new DataOutputStream(fout);
            Scanner sc = new Scanner(System.in);

            for(int x=1;x<=3;x++)
            {
                System.out.println("Enter Details of student "+x+" : ");
                System.out.println("Name : ");
                String name=sc.nextLine();
                System.out.println("Date of birth : ");
                String DOB=sc.next();
                System.out.println("Roll No. : ");
                int roll_no=sc.nextInt();
                System.out.println("Obtained Marks in subject 1 : ");
                double m1=sc.nextDouble();
                System.out.println("Obtained Marks in subject 2 : ");
                double m2=sc.nextDouble();
                System.out.println("Obtained Marks in subject 3 : ");
                double m3=sc.nextDouble();
                System.out.println("Obtained Marks in subject 4 : ");
                double m4=sc.nextDouble();
                System.out.println("Obtained Marks in subject 5 : ");
                double m5=sc.nextDouble();
                sc.nextLine();
                double total=m1+m2+m3+m4+m5;
                double avg=total/5;
                dout.writeInt(roll_no);
                dout.writeUTF(DOB);
                dout.writeUTF(name);
                dout.writeDouble(m1);
                dout.writeDouble(m2);
                dout.writeDouble(m3);
                dout.writeDouble(m4);
                dout.writeDouble(m5);
                dout.writeDouble(total);
                dout.writeDouble(avg);
                char ch=' ';
                if(avg>=90)
                {
                    ch='S';
                }
                else if(avg>=80)
                {
                    ch='A';
                }
                else if(avg>=70)
                {
                    ch='C';
                }
                else if(avg>=60)
                {
                    ch='C';
                }
                else if(avg>=50)
                {
                    ch='D';
                }
                else
                {
                    ch='F';
                }
                dout.writeChar(ch);
            }
            dout.close();
            fout.close();
        }
        catch(Exception e)
        {
            System.out.println("File Not found");
        }
    }

    public static void main(String args[])
    {
        System.out.println("Choice\n1 - Inputing Student Data\n2 - Searching\nEnter your Choice");
        int n=new Scanner(System.in).nextInt();
        switch(n)
        {
            case 1:
            write();
            break;

            case 2:
            System.out.println("Enter name of the student to be searched :");
            String n1=new Scanner(System.in).nextLine();
            read(n1);
            break;

            default :
            System.out.println("Wrong Choice");
        }
    }
}