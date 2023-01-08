package graphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class ToolbarEx extends JFrame {

    public ToolbarEx() {

        initUI();
    }

    private void initUI() {

        createMenuBar();
        createToolBar();

        setTitle("Simple toolbar");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar() {

        JMenuBar mb = new JMenuBar();
        JMenu f = new JMenu("File");
        mb.add(f);
        setJMenuBar(mb);
    }

    private void createToolBar() {

        JToolBar toolbar = new JToolBar();

        ImageIcon i = new ImageIcon("src/main/resources/exit1.png");

        JButton eb = new JButton(i);
        toolbar.add(eb);

        eb.addActionListener((ActionEvent event) -> 
        {
            System.exit(0);
        });

        add(toolbar, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> 
        {
            ToolbarEx ex = new ToolbarEx();
            ex.setVisible(true);
        });
    }
}