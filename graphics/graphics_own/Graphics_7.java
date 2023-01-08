package graphics.graphics_own;

import javax.swing.*;
import javax.swing.JComponent;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Graphics_7 extends JFrame 
{

    private JLabel coords;

    public Graphics_7() 
    {
        GUI();
    }

    private void GUI() 
    {
        coords = new JLabel("Aditya Srivastava");

        createLayout(coords);

        addMouseMotionListener(new MouseMotionAdapter() 
            {

                public void mouseMoved(MouseEvent e) 
                {
                    super.mouseMoved(e);

                    int x = e.getX();
                    int y = e.getY();

                    String text = String.format("x: %d, y: %d", x, y);

                    coords.setText(text);
                }
            });

        setTitle("Mouse move events");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg) {

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createParallelGroup()
            .addComponent(arg[0])
            .addGap(250)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addComponent(arg[0])
            .addGap(130)
        );

        pack();
    }

    public static void main(String[] args) 
    {
        EventQueue.invokeLater(() -> 
        {
            Graphics_7 ex = new Graphics_7();
        ex.setVisible(true);
    });
}
}