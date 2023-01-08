package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.GroupLayout.Alignment.CENTER;

public class ListModelsEx extends JFrame {

    private DefaultListModel model;
    private JList list;
    private JButton remAllBtn;
    private JButton addBtn;
    private JButton renBtn;
    private JButton delBtn;

    public ListModelsEx() {

        initUI();
    }

    private void createList() {

        model = new DefaultListModel();

        list = new JList(model);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        list.addMouseListener(new MouseAdapter()
            {

                public void mouseClicked(MouseEvent e) {

                    if (e.getClickCount() == 2) {

                        int index = list.locationToIndex(e.getPoint());
                        Object item = model.getElementAt(index);
                        String text = JOptionPane.showInputDialog("Rename item", item);
                        String newItem;

                        if (text != null) {
                            newItem = text.trim();
                        } else {
                            return;
                        }

                        if (!newItem.isEmpty()) {

                            model.remove(index);
                            model.add(index, newItem);
                            ListSelectionModel selModel = list.getSelectionModel();
                            selModel.setLeadSelectionIndex(index);
                        }
                    }
                }
            });
    }

    private void createButtons() {

        remAllBtn = new JButton("Remove All");
        addBtn = new JButton("Add");
        renBtn = new JButton("Rename");
        delBtn = new JButton("Delete");

        addBtn.addActionListener((ActionEvent e) -> {

                String text = JOptionPane.showInputDialog("Add a new item");
                String item;

                if (text != null) {
                    item = text.trim();
                } else {
                    return;
                }

                if (!item.isEmpty()) {

                    model.addElement(item);
                }
            });

        delBtn.addActionListener(event -> {

                ListSelectionModel selModel = list.getSelectionModel();
                int index = selModel.getMinSelectionIndex();

                if (index >= 0) {
                    model.remove(index);
                }
            });

        renBtn.addActionListener(e -> {

                ListSelectionModel selModel = list.getSelectionModel();
                int index = selModel.getMinSelectionIndex();
                if (index == -1) {
                    return;
                }

                Object item = model.getElementAt(index);
                String text = JOptionPane.showInputDialog("Rename item", item);
                String newItem;

                if (text != null) {
                    newItem = text.trim();
                } else {
                    return;
                }

                if (!newItem.isEmpty()) {

                    model.remove(index);
                    model.add(index, newItem);
                }
            });

        remAllBtn.addActionListener(e -> model.clear());
    }

    private void initUI() {

        createList();
        createButtons();

        JScrollPane scrollPane = new JScrollPane(list);
        createLayout(scrollPane, addBtn, renBtn, delBtn, remAllBtn);

        setTitle("JList models");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg) {

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addComponent(arg[0])
            .addGroup(gl.createParallelGroup()
                .addComponent(arg[1])
                .addComponent(arg[2])
                .addComponent(arg[3])
                .addComponent(arg[4]))
        );

        gl.setVerticalGroup(gl.createParallelGroup(CENTER)
            .addComponent(arg[0])
            .addGroup(gl.createSequentialGroup()
                .addComponent(arg[1])
                .addComponent(arg[2])
                .addComponent(arg[3])
                .addComponent(arg[4]))
        );

        gl.linkSize(addBtn, renBtn, delBtn, remAllBtn);

        pack();
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
                ListModelsEx ex = new ListModelsEx();
                ex.setVisible(true);
            });
    }
}