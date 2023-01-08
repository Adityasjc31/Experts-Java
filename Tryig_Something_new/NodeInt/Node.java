package Tryig_Something_new.NodeInt;

public class Node
{
    protected int data;
    protected Node link;
    public Node()
    {
        link=null;
        data=0;
    }
    
    public Node(int d,Node n)
    {
        data = d;
        link = n;
    }
    
    public void setLink(Node n)
    {
        link = n;
    }
    
    public void setData(int d)
    {
        data = d;
    }
    
    public String toString()
    {
        return data+","+hashCode();
    }
    
    public Node getlink()
    {
        return link;
    }
    
    public int getData()
    {
        return data;
    }
}