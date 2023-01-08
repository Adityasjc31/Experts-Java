package project;

/**ISC 2018 Q11*/
import java.util.*;
class Register
{
    String stud[];
    int cap,top;
    Register(int max)
    {
        cap = max;
        stud = new String[max];
        top = -1;
    }

    void push(String n)
    {
        //to entry in register
        if(top<cap-1)
        {
            top++;
            stud[top] = n;
        }
        else
        {
            System.out.println("OVERFLOW");
        }
    }

    String pop()
    {
        //removing from register
        if(top>=0)
        {
            return stud[top--];
        }
        else
        {
            return "$$";
        }
    }

    void display()
    {
        //displaying the register
        if(top >= 0)
        {
            for(int x=0;x<cap;x++)
            {
                System.out.println(stud[x]);
            }
        }
    }
}