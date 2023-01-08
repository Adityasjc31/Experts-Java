package stack_and_queue.Regular_Expressions_check;

import java.util.*;
public class Regular_Expressions
{
    public static boolean Check(String str)
    {
        Stack s = new Stack(str.length());

        for(int x=0;x<str.length();x++)
        {
            char ch=str.charAt(x);
            if(ch == '(' || ch == '[' || ch == '{')
            {
                s.push(ch);
                continue;
            }

            if(s.isEmpty())
            {
                return false;
            }

            switch(ch)
            {   
                case ']':
                char c = s.pop();
                if(c!='[')
                {
                    return false;
                }
                break;

                case '}':
                c = s.pop();
                if(c!='{')
                {
                    return false;
                }
                break;

                case ')':
                c = s.pop();
                if(c!='(')
                {
                    return false;
                }
                break;
            }
        }

        return s.isEmpty();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an expression");
        String s = sc.nextLine();
        if(Check(s))
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}