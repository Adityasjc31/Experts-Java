package tempClass12;

class Wordpile
{
    char ch[];
    int capacity,top;
    //constructor
    public Wordpile(int cap)
    {
        ch=new char[cap];
        capacity=cap;
        top=-1;
    }
    
    public void push(char ch1)
    {
        if(top<capacity-1)
        {
            top++;
            ch[top]=ch1;
        }
        else
        {
            System.out.println("Wordpile is full");
        }
    }
    
    public char pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return '#';
        }
        else
        {
            char ch1 = ch[top];
            System.out.println("Deleted value : "+ch1);
            return ch1;
        }
    }
    
    public void display()
    {
        int a,b,c,d;
        a=b=c=d=0;
        for(int x=top;x>=0;x--)
        {
            System.out.println(ch[x]);
            if(Character.isUpperCase(ch[x]))
            {
                a++;
            }
            else if(Character.isLowerCase(ch[x]))
            {
                b++;
            }
            else if(Character.isDigit(ch[x]))
            {
                c++;
            }
            else
            {
                d++;
            }
        }
        
        System.out.println("Number of captial letters in stack : "+a);
        System.out.println("Number of small letters in stack : "+b);
        System.out.println("Number of digits letters in stack : "+c);
        System.out.println("Number of special letters in stack : "+d);
    }
}