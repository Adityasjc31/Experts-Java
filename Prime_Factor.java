import javax.swing.*;
class Prime_Factor
{
    public static void main(String args [])
    {
        int n=Integer.parseInt(JOptionPane.showInputDialog("Enter a number(Prime Factor gives : )"));
        int d=2;String t="";

        int x=n;
        while(x!=1)
        {
            if(x%d==0)
            {
                x=x/d;
                t=t+d+" ";
            }
            else
            {
                d++;
            }
        }
        t=t.trim().replace(" ","x");
        JOptionPane.showMessageDialog(null,t+" = "+n,"Display",JOptionPane.PLAIN_MESSAGE);
    }
}