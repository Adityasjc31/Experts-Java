import java.util.*;
import java.io.*;
class Student
{
    public static void read(int n)
    {
        try
        {
            FileInputStream fin = new FileInputStream("Student.dat");
            DataInputStream din = new DataInputStream(fin);

            boolean found=false,eof=false;
            while(!eof)
            {
                try
                {
                    int t=din.readInt();
                    if(t==n)
                    {
                        System.out.println("Roll No. : "+t);

                        String st=din.readUTF();
                        System.out.println("Date Of Birth : "+st);

                        st=din.readUTF();
                        System.out.println("Name : "+st);
                        for(int x=1;x<=5;x++)
                        {
                            double m=din.readDouble();
                            System.out.println("Marks obtained in subject "+x+" : "+m);
                        }
                        double d = din.readDouble();
                        System.out.println("Total : "+d);

                        System.out.println("Average : "+d);
                        d=din.readDouble();

                        st=din.readChar()+"";
                        System.out.println("Grade : "+st);

                        found=true;
                    }
                    else
                    {

                        String st=din.readUTF();
                        st=din.readUTF();
                        for(int x=1;x<=5;x++)
                        {
                            double m=din.readDouble();
                        }
                        double d = din.readDouble();
                        d=din.readDouble();
                        st=din.readChar()+"";
                    }
                }
                catch(EOFException e)
                {
                    eof=true;
                }
            }

            if(!found)
            {
                System.out.println("Data does not exist in the file");
            }

            din.close();
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println("Cannot find or access the file");
        }
    }

    public static void write(String file)
    {
        try
        {
            FileOutputStream fout = new FileOutputStream(file);
            DataOutputStream dout = new DataOutputStream(fout);
            Scanner sc = new Scanner(System.in);
            for(int x=1;x<=3;x++)
            {
                System.out.println("Enter details of Student "+x+" : ");

                System.out.println("Enter Roll No. : ");
                int n=sc.nextInt();
                dout.writeInt(n);

                System.out.println("Enter Date of Birth : ");
                String st=sc.next();
                dout.writeUTF(st);

                sc.nextLine();

                System.out.println("Enter Name : ");
                st=sc.nextLine();
                dout.writeUTF(st);

                double total=0.0;
                for(int y=1;y<=5;y++)
                {
                    System.out.println("Enter marks obtained in subject "+y+" : ");
                    double d=sc.nextDouble();
                    dout.writeDouble(d);
                    total+=d;
                }
                dout.writeDouble(total);
                double avg=total/5;
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
                    ch='B';
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
            System.out.println("Cannot write on the file");
        }
    }

    public static void main(String args[])
    {
        System.out.println("Choose:\n1 - Entering student data\n2 - Searching in Data");
        int n=new Scanner(System.in).nextInt();
        switch(n)
        {
            case 1:
            write("Student.dat");
            break;
            
            case 2:
            System.out.println("Enter roll no of the student to be searched : ");
            n=new Scanner(System.in).nextInt();
            read(n);
            break;
            
            default:
            System.out.println("Wrong Choice");
        }
    }
}