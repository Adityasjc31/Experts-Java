import javax.swing.*;
import java.io.*;
class Delete_any_File
{
    public static void main(String args [])
    {
        String file=JOptionPane.showInputDialog("Enter file path which is to be deleted.");
        File f = new File(file);
        try
        {
            f.delete();
            JOptionPane.showMessageDialog(null,"Deleted.");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Unable to Delete.");
        }
    }
}