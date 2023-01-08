import java.util.*;
class Time
{
    private int h,m,s;
    public void input(int h , int m , int s)
    {
        while(s>=60)
        {
            s=s-60;
            m++;
        }

        while(m>=60)
        {
            m-=60;
            h++;
        }
        this.h=h;
        this.m=m;
        this.s=s;
    }

    public void input(int h,int m)
    {
        input(h,m,0);
    }

    public void input(int h)
    {
        input(h,0,0);
    }

    public void display()
    {
        String h,m,s;int a=1;h=m=s="";
        if(this.h<10)
        {
            h="0"+String.valueOf(this.h);a++;
        }
        if(this.m<10)
        {
            m="0"+String.valueOf(this.m);a++;
        }
        if(this.s<10)
        {
            s="0"+String.valueOf(this.s);a++;
        }
        if(a==1){s=String.valueOf(this.s);h=String.valueOf(this.h);m=String.valueOf(this.m);}
        System.out.println(h+":"+m+":"+s);
    }
}