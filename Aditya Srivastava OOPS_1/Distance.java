import java.util.*;
class Distance
{
    private int f,i;
    public void input(int f , int i)
    {
        this.f=f+i/12;
        this.i=i%12;
    }

    public void display()
    {
        System.out.println(f+"'"+i+"\"");
    }
}