package graphics;


import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class SubmenuEx extends JFrame {

    public SubmenuEx() {

        GUI();
    }

    private void GUI() {

        createMenuBar();

        setTitle("Submenu");
        setSize(360, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar() {

        JMenuBar mb = new JMenuBar();


        JMenu fileMenu = new JMenu("File");

        JMenu impMenu = new JMenu("Import");

        JMenuItem newsfMi = new JMenuItem("Import newsfeed list...");
        JMenuItem bookmMi = new JMenuItem("Import bookmarks...");
        JMenuItem mailMi = new JMenuItem("Import mail...");

        impMenu.add(newsfMi);
        impMenu.add(bookmMi);
        impMenu.add(mailMi);

        JMenuItem newMi = new JMenuItem("New");
        JMenuItem openMi = new JMenuItem("Open");
        JMenuItem saveMi = new JMenuItem("Save");

        JMenuItem ei = new JMenuItem("Exit");
        ei.setToolTipText("Exit application");

        ei.addActionListener((ActionEvent event) -> 
        {
            System.exit(0);
        });

        fileMenu.add(newMi);
        fileMenu.add(openMi);
        fileMenu.add(saveMi);
        fileMenu.addSeparator();
        fileMenu.add(impMenu);
        fileMenu.addSeparator();
        fileMenu.add(ei);

        mb.add(fileMenu);

        setJMenuBar(mb);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            SubmenuEx ex = new SubmenuEx();
            ex.setVisible(true);
        });
    }
}