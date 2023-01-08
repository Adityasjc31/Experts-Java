package Tryig_Something_new.NodeInt;

import java.util.*;
public class linkedlist
{
    protected Node start;

    public linkedlist()
    {
        start = null;
    }

    public boolean isEmpty()
    {
        return start==null;
    }

    public void Insert(int val,boolean sort)
    {
        if(sort)
        {
            Insert(val);
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
                present = start.getlink();
                while(present!=null)
                {
                    save = present;
                    present = present.getlink();
                }
                save.setLink(New);
            }
        }
    }

    public void sort()
    {
        Node list = start;
        while(list!=null)
        {
            Node i = list;
            Node present = i.getlink();
            while(present!=null)
            {
                if(present.getData() < i.getData())
                {
                    i = present;
                }
                present = present.getlink();
            }
            int temp = list.getData();
            list.setData(i.getData());
            i.setData(temp);
            
            list = list.getlink();
        }
    }

    public void Insert(int val)
    {
        Node nptr,ptr,save=null;
        nptr = new Node(val,null);
        boolean ins=false;
        if(start == null)
        {
            start = nptr;
        }
        else if(val <= start.getData())
        {
            nptr.setLink(start);
            start = nptr;
        }
        else
        {
            save = start;
            ptr = start.getlink();
            while(ptr != null)
            {
                if(val>=save.getData() && val<=ptr.getData())
                {
                    save.setLink(nptr);
                    nptr.setLink(ptr);
                    ins = true;
                    break;
                }
                else
                {
                    save = ptr;
                    ptr = ptr.getlink();
                }
            }
            if(ins == false)
            {
                save.setLink(nptr);
            }
        }
    }

    public boolean delete(int val)
    {
        boolean res = false;
        if(start.getData() == val)
        {
            start=start.getlink();
        }
        else
        {
            Node ptr,save;
            save = start;
            ptr = start.getlink();
            while(ptr != null)
            {
                if(ptr.getData() == val)
                {
                    Node next = ptr.getlink();
                    save.setLink(next);
                    res = true;
                    break;
                }
                else
                {
                    save = ptr;
                    ptr = ptr.getlink();
                }
            }
        }
        return res;
    }

    public void display()
    {
        Node ptr = start;
        System.out.print(start.getData() + "--> ");
        ptr = start.getlink();
        while(ptr.getlink() != null)
        {
            System.out.print(ptr.getData() + "--> ");
            ptr = ptr.getlink();
        }
        System.out.println(ptr.getData());
    }
}