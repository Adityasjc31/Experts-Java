package isc2015;
class WordPile
{
    char ch[];
    int capacity,top;
    WordPile(int cap)
    {
        capacity = cap;
        ch = new char[capacity];
        top=-1;
    }
    
    void pushChar(char v)
    {
        if(top<capacity-1)
        {
            ch[++top] = v;
        }
        else
        {
            System.out.println("WordPile is full");
        }
    }
    
    char popChar()
    {
        if(top>=0)
        {
            return ch[top--];
        }
        else
        {
            return '\\';
        }
    }
}