package Tryig_Something_new;

import java.util.*;
public class LinkList
{
    private Node start;
    public LinkList()
    {
        start = null;
    }

    public boolean isEmpty()
    {
        return start==null;
    }

    public void insert(String val,boolean sort)
    {
        if(sort)
        {
            insert(val);
        }
        else
        {
            Node New,present,save=null;
            New = new Node(val,null);
            if(start==null)
            {
                start=New;
            }
            else
            {
                save=start;
                present = start.getLink();
                while(present!=null)
                {
                    save = present;
                    present = present.getLink();
                }
                save.setLink(New);
            }
        }
    }

    public void insert(String val)
    {
        Node nptr,ptr,save=null;
        nptr = new Node(val,null);
        boolean ins=false;
        if(start == null)
        {
            start = nptr;
        }
        else if(val.compareToIgnoreCase(start.getData()) <= 0)
        {
            nptr.setLink(start);
            start = nptr;
        }
        else
        {
            save = start;
            ptr = start.getLink();
            while(ptr!=null)
            {
                if(val.compareToIgnoreCase(save.getData()) >=0 && val.compareToIgnoreCase(ptr.getData())<=0)
                {
                    save.setLink(nptr);
                    nptr.setLink(ptr);
                    ins = true;
                    break;
                }
                else
                {
                    save=ptr;
                    ptr = ptr.getLink();
                }
            }
            if(ins==false)
            {
                save.setLink(nptr);
            }
        }
    }

    public void sort()
    {
        Node list = start;
        while(list!=null)
        {
            Node i = list;
            Node present = i.getLink();
            while(present!=null)
            {
                if(present.getData().compareTo(i.getData()) < 0)
                {
                    i = present;
                }
                present = present.getLink();
            }
            String temp = list.getData();
            list.setData(i.getData());
            i.setData(temp);

            list = list.getLink();
        }
    }

    public void delimiter(String limit)
    {
        Node ptr = start;

        while(ptr.getLink() != null)
        {
            StringTokenizer st = new StringTokenizer(ptr.getData(),limit);
            Node substart=null;
            int c = st.countTokens();
            while(c>=2 && st.hasMoreTokens())
            {
                String val = st.nextToken();
                Node newest = new Node(val,null);

                if(substart == null)
                {
                    substart = newest;
                }
                else
                {
                    Node save = substart;
                    Node present = substart.getLink();
                    while(present!=null)
                    {
                        save = present;
                        present = present.getLink();
                    }
                    save.setLink(newest);
                }
            }
            if(substart != null)
            {
                Node temp = substart.getLink();
                Node last = temp;
                while(temp.getLink() !=null)
                {
                    last = temp;
                    temp = temp.getLink();
                }
                Node s = start.getLink();
                temp.setLink(s);
                start=substart;
            }
            ptr = ptr.getLink();
        }
    }

    public void display()
    {
        Node ptr = start;
        System.out.print(start.getData() + "->");
        ptr = start.getLink();
        int a=1;
        while(ptr.getLink() != null)
        {
            System.out.print(ptr.getData() + "->");
            if(a%5 == 0)
            {
                System.out.println();
            }
            ptr = ptr.getLink();
            a++;
        }
        System.out.println(ptr.getData());
    }
}