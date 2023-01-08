import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.GroupLayout.Alignment.BASELINE;

class Single_Digit extends JFrame implements ItemListener
{
    private JLabel display;
    private JComboBox<String> box;
    private String[] distros;
    public Single_Digit()
    {
        Display(1);
    }

    private void Display(int a) 
    {
        distros = new String[]{"1","2","3","4","5","6","7","8","9"};

        box = new JComboBox<>(distros);
        box.addItemListener(this);
        if(a>0)
            display = new JLabel(""+a);
        else
            display = new JLabel("1");
        createLayout(box, display);

        /*setTitle("JComboBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        setSize(600,500);
        setLocationRelativeTo(null);
    }

    private void createLayout(JComponent... arg)
    {
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addComponent(arg[0])
            .addComponent(arg[1])
        );

        gl.setVerticalGroup(gl.createParallelGroup(BASELINE)
            .addComponent(arg[0])
            .addComponent(arg[1])
        );

        pack();
    }

    public void itemStateChanged(ItemEvent e)
    {
        if (e.getStateChange() == ItemEvent.SELECTED)
        {
            display.setText(e.getItem().toString());
        }
    }
    
    public static void main(String args [])
    {
        EventQueue.invokeLater(() -> {
                Single_Digit ex = new Single_Digit();
                ex.setVisible(true);
            });
    }
}