import javax.swing.*;
class Rupees
{
    public static void main(String args [])
    {
        int ar[]={2000,500,200,100,50,20,10,5,2,1};
        int a=Integer.parseInt(JOptionPane.showInputDialog("Enter the amount(Notes shown)"));
        String t="";
        for(int x=0;x<10;x++)
        {
            int q=a/ar[x];
            a=a%ar[x];
            if(q!=0)
            t+=(ar[x]+"\tx\t"+q+"\t=\t"+(ar[x]*q))+"\n";
        }
        JOptionPane.showMessageDialog(null,t+"\n","Display",JOptionPane.PLAIN_MESSAGE);
    }
}