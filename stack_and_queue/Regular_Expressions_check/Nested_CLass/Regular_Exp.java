package stack_and_queue.Regular_Expressions_check.Nested_CLass;

import java.util.*;
public class Regular_Exp
{
    static class Stack
    {
        private char ch[];
        private int index;
        private boolean pushed;
        public Stack(int size)
        {
            ch = new char[size];
            index = -1;
        }
        
        public boolean isPushed()
        {
            return pushed;
        }
        
        public boolean push(char val)
        {
            if(index<ch.length-1)
            {
                index++;
                ch[index] = val;
                pushed = true;
                return true;
            }
            return false;
        }

        public char pop()
        {
            if(index>=0)
            {
                return ch[index--];
            }
            else
            {
                return '\u0000';
            }
        }

        public boolean isEmpty()
        {
            return index==-1;
        }
    }

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
                if(s.isPushed())
                {
                    return false;
                }
                return true;
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