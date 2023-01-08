package school;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.GroupLayout.Alignment.CENTER;

public class Items_Name_taken extends Reaiter
{
    private DefaultListModel model;
    private JList list;
    static JButton remAllBtn;
    static JButton addBtn;
    static JButton renBtn;
    static JButton delBtn;
    public Items_Name_taken() 
    {
        initUI();
        sd = new Product_Detail();
        ex = new Quanput();
        ex.setLocationRelativeTo(this);
    }

    private String prblm(Object item)   
    {
        String text = JOptionPane.showInputDialog(this,"Rename item", item);
        return text;
    }

    private void createList() 
    {
        model = new DefaultListModel();
        model.addElement("..................Enter only Product name...................");

        list = new JList(model);
        list.setBackground(Color.white);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        list.addMouseListener(new MouseAdapter()
            {

                public void mouseClicked(MouseEvent e) 
                {
                    if (e.getClickCount() == 2) 
                    {
                        int index = list.locationToIndex(e.getPoint());
                        if(index>=1)
                        {
                            ex.normalstate();
                            Object item = model.getElementAt(index);
                            String text = prblm(item);
                            String newItem;

                            if (text != null) 
                            {
                                newItem = text.trim();
                            }
                            else 
                            {
                                return;
                            }
                            if(entered)
                            {
                                search(icg,model.get(index).toString());
                                icg[Truth]="-1";
                                Reaiter.remrrt("Quantities_temp_given");
                                td.setVisible(false);
                                td.statechanged();
                                td.setVisible(true);
                            }
                            if (!newItem.isEmpty() && search(Reaiter.item,newItem)) 
                            {
                                model.remove(index);
                                model.add(index, newItem);
                                SwingUtilities.invokeLater(new Runnable() 
                                    {
                                        public void run()
                                        {
                                            if(Truth!=-1)
                                            {
                                                sd.w=Truth;
                                                ex.setVisible(true);
                                                sd.setVisible(true);
                                                sd.statechanged();
                                                ex.refer(sd);
                                            }
                                        }
                                    });
                                ListSelectionModel selModel = list.getSelectionModel();
                                selModel.setLeadSelectionIndex(index);
                            }
                        }
                    }
                }
            }
        );
    }
    static Product_Detail sd;
    int t;
    static Quanput ex;
    private void createButtons() 
    {
        remAllBtn = new JButton("Remove All");
        addBtn = new JButton("Add");
        renBtn = new JButton("Rename");
        delBtn = new JButton("Delete");

        addBtn.addActionListener((ActionEvent e) -> 
            {
                ex.normalstate();
                String text = JOptionPane.showInputDialog(this,"Add a new item");
                String item;

                if (text != null) 
                {
                    item = text.trim();
                }
                else
                {
                    return;
                }
                if(search(Reaiter.item,item))
                {
                    Items_Name_taken.remAllBtn.setVisible(false);
                    Items_Name_taken.addBtn.setVisible(false);
                    Items_Name_taken.delBtn.setVisible(false);
                    Items_Name_taken.renBtn.setVisible(false);
                    model.addElement(item);
                    SwingUtilities.invokeLater(new Runnable() 
                        {
                            public void run()
                            {
                                if(Truth!=-1)
                                {
                                    sd.w=Truth;
                                    ex.setVisible(true);
                                    sd.setVisible(true);
                                    sd.statechanged();
                                    ex.refer(sd);
                                }
                            }
                        });
                    EventQueue.invokeLater(() -> 
                        {
                            ex.setVisible(true);
                        }
                    );
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"This item doesn't exists in the store","Error",JOptionPane.PLAIN_MESSAGE);
                }
            }
        );

        delBtn.addActionListener(event -> 
            {
                ListSelectionModel selModel = list.getSelectionModel();
                int index = selModel.getMinSelectionIndex();
                if(entered)
                {
                    search(icg,model.get(index).toString());
                    icg[Truth]="-1";
                    Reaiter.remrrt("Quantities_temp_given");
                    td.setVisible(false);
                    td.statechanged();
                    td.setVisible(true);
                }
                if (index >= 1) 
                {
                    model.remove(index);
                }
            }
        );

        renBtn.addActionListener(e -> 
            {
                ex.normalstate();
                ListSelectionModel selModel = list.getSelectionModel();
                int index = selModel.getMinSelectionIndex();
                if(index>=1)
                {
                    if (index == -1) 
                    {
                        return;
                    }

                    Object item = model.getElementAt(index);
                    String t=String.valueOf(model.getElementAt(index));
                    String text = JOptionPane.showInputDialog(this,"Rename item", item);
                    String newItem;
                    if(!t.equalsIgnoreCase(text))
                    {
                        if (text != null) 
                        {
                            newItem = text.trim();
                        }
                        else
                        {
                            return;
                        }
                        if(entered)
                        {
                            search(icg,model.get(index).toString());
                            icg[Truth]="-1";
                            Reaiter.remrrt("Quantities_temp_given");
                            td.setVisible(false);
                            td.statechanged();
                            td.setVisible(true);
                        }
                        if (!newItem.isEmpty() && search(Reaiter.item,newItem))
                        {
                            model.remove(index);
                            model.add(index, newItem);
                            SwingUtilities.invokeLater(new Runnable() 
                                {
                                    public void run()
                                    {
                                        if(Truth!=-1)
                                        {
                                            sd.w=Truth;
                                            sd.setVisible(true);
                                            ex.setVisible(true);
                                            sd.statechanged();
                                            ex.refer(sd);
                                        }
                                    }
                                });
                        }
                    }
                }
            }
        );

        remAllBtn.addActionListener(e -> {
                model.clear();
                model.addElement("..................Enter only Product name...................");
                for(int x=0;x<icg.length;icg[x]="-1",x++);
                Reaiter.remrrt("Quantities_temp_given");
                td.setVisible(false);
                td.statechanged();
                td.setVisible(true);
            }
        );
    }

    private void initUI() 
    {
        createList();
        createButtons();

        JScrollPane scrollPane = new JScrollPane(list);
        createLayout(scrollPane, addBtn, renBtn, delBtn, remAllBtn);

        setTitle("Name");
        setLocation(100,300);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
                Items_Name_taken ex = new Items_Name_taken();
                ex.setVisible(true);
            }
        );
    }
}