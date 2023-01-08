package graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.CENTER;
public class Tool extends JFrame
{

    private JLabel sb;
    private DefaultListModel model;
    private JList list;
    private JButton remAllBtn;
    private JButton addBtn;
    private JButton renBtn;
    private JButton delBtn;

    public Tool()
    {
        gui();
    }

    private void gui()
    {
        createMenuBar();
        createList();
        createButtons();

        JScrollPane scrollPane = new JScrollPane(list);
        createLayout(scrollPane, addBtn, renBtn, delBtn, remAllBtn);

        sb = new JLabel("Done");
        sb.setBorder(BorderFactory.createEtchedBorder());
        add(sb,BorderLayout.SOUTH);

        setTitle("learning ToolBar");
        setSize(500,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar()
    {
        JMenuBar mb = new JMenuBar();

        JMenu f = new JMenu("File");
        f.setMnemonic(KeyEvent.VK_F);

        JMenu ve = new JMenu("View");
        ve.setMnemonic(KeyEvent.VK_V);

        JCheckBoxMenuItem smi = new JCheckBoxMenuItem("Show statubar");
        smi.setMnemonic(KeyEvent.VK_S);
        smi.setDisplayedMnemonicIndex(5);
        smi.setSelected(true);

        smi.addItemListener((ItemEvent e )->
            {
                if(e.getStateChange() == ItemEvent.SELECTED)
                {
                    sb.setVisible(true);
                }
                else
                {
                    sb.setVisible(false);
                }
            }
        );
        JMenu im=new JMenu("Import");
        JMenuItem jmi = new JMenuItem("Import newsfeed l ....");
        JMenuItem jmu = new JMenuItem("Import bookmarks....");
        JMenuItem jmo = new JMenuItem("Import mail....");
        im.add(jmi);
        im.add(jmu);
        im.add(jmo);

        JMenuItem ni = new JMenuItem("New");
        JMenuItem oi = new JMenuItem("Open");
        JMenuItem si = new JMenuItem("Save");

        JMenuItem ei = new JMenuItem("Exit");
        ei.setToolTipText("Exit application");

        ei.addActionListener((ActionEvent event) -> 
            {
                System.exit(0);
            });

        f.add(ni);f.add(oi);f.add(si);f.addSeparator();
        f.add(im);f.addSeparator();f.add(ei);

        ve.add(smi);
        mb.add(f);
        mb.add(ve);
        JMenu hm = new JMenu("Help");
        mb.add(Box.createHorizontalGlue());
        mb.add(hm);
        setJMenuBar(mb);
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

        addBtn.addActionListener(e -> {

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

    public static void main()
    {
        EventQueue.invokeLater(() ->
            {
                Tool ex = new Tool();
                ex.setVisible(true);
            });
    }}