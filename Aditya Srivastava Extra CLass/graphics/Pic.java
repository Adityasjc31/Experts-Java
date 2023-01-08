package graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Pic extends JFrame implements ActionListener
{
    public Pic()
    {
    }

    public void in()
    {
        JButton jb=new JButton("Image");

        cl(jb);
        setSize(800,900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        if(s.equals("Quit"))
        {
            System.exit(0);
        }
        repaint();
    }

    private void cl(JComponent...arg)
    {
        Container pa = getContentPane();
        GroupLayout gl = new GroupLayout(pa);
        pa.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addComponent(arg[0])
        );

        gl.setVerticalGroup(gl.createParallelGroup()
            .addComponent(arg[0])
        );
        for(int x=0;x<=0;x++)
        { 
            gl.linkSize(arg[x]);
        }
        pack();
    }
    
    public static void main(String args [])
    {
        EventQueue.invokeLater(new Runnable()
            {
                public void run()
                {
                    Pic e = new Pic();
                    e.setVisible(true);
                }
            });
    }
}