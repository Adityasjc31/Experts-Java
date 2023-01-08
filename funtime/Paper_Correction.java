
package funtime;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class Paper_Correction extends JFrame
{
    private JPanel startup;
    private JPanel topPanel;
    private JLabel company;
    private JPanel textPanel;
    private JTextPane pane;
    private JPanel bottom;
    private String text;
    private JButton stb;
    public Paper_Correction()
    {
        startup = new JPanel();
        startup.setLayout(new BoxLayout(startup, BoxLayout.Y_AXIS));
        add(startup);

        topPanel = new JPanel(new BorderLayout(0, 0));
        topPanel.setMaximumSize(new Dimension(450, 0));
        company = new JLabel("Zeus Companies");
        company.setBorder(BorderFactory.createEmptyBorder(0, 25, 0, 0));
        topPanel.add(company);

        startup.add(topPanel);
        textPanel = new JPanel(new BorderLayout());
        textPanel.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));
        pane = new JTextPane();
        pane.setContentType("text");
        
        textPanel.add(pane);
        startup.add(textPanel);
        bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        startup.add(bottom);

        bottom.setMaximumSize(new Dimension(450, 0));

        setTitle("Paper Correction");
        setSize(new Dimension(500, 250));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main()
    {
        SwingUtilities.invokeLater(new Runnable() 
            {
                public void run()
                {
                    Paper_Correction sd = new Paper_Correction();
                    sd.setVisible(true);
                }
            });
    }
}