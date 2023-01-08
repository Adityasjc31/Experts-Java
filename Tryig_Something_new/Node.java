package Tryig_Something_new;

public class Node
{
    private String data;
    private Node link;
    public Node()
    {
        link=null;
        data=null;
    }
    
    public Node(String val,Node link)
    {
        data = val;
        this.link = link;
    }
    
    public void setLink(Node n)
    {
        link=n;
    }
    
    public void setData(String d)
    {
        data = d;
    }
    
    public Node getLink()
    {
        return link;
    }
    
    public String getData()
    {
        return data;
    }
}