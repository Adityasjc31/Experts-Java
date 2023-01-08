package stack_and_queue.Regular_Expressions_check;

class Stack
{
    private char ch[];
    private int index;
    public Stack(int size)
    {
        ch = new char[size];
        index = -1;
    }
    
    public boolean push(char val)
    {
        if(index<ch.length-1)
        {
            index++;
            ch[index] = val;
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
        if(index==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}