package school;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.CENTER;
class Code extends JFrame
{
    private DefaultListModel model;
    private JList list;
    private JButton reBtn;

    public Code()
    {
        //Reaiter.b1=true;
        gui();
    }

    private void gui()
    {
        createList();
        createButtons();

        JScrollPane scrollPane = new JScrollPane(list);
        createLayout(scrollPane, reBtn);

        setTitle("Item Code List");

        setSize(500,300);
        setLocationRelativeTo(null);
    }
    String code [] = new String[30];
    void fillup()
    {
        try{Reaiter.read();}catch(Exception e){}
        for(int x=0;x<30;x++)
        {
            code[x]=Reaiter.item_code[x];
        }
    }

    void clearup()
    {
        for(int x=0;x<30;x++)
        {
            Reaiter.item_code[x]=code[x];
        }
        try{Reaiter.writer(true);}catch(Exception e){}
    }

    private void createList() 
    {
        fillup();
        model = new DefaultListModel();
        for(int x=0;x<code.length;x++)
            model.addElement(code[x]);
        list = new JList(model);
        list.setBackground(Color.white);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        clearup();
    }

    private void createButtons() 
    {
        reBtn = new JButton("Reassign the code");
        reBtn.setBackground(Color.green);
        reBtn.addActionListener(e -> 
            {
                ListSelectionModel selModel = list.getSelectionModel();
                int index = selModel.getMinSelectionIndex();
                if (index == -1)
                {
                    return;
                }

                //                 System.out.println(items[index]);
                Object item = model.getElementAt(index);
                String text = JOptionPane.showInputDialog("Reassign the code", item);
                String newItem;
                //                 System.out.println(items[index]);
                if (text != null) 
                {
                    newItem = text.trim();
                    code[index]=newItem;
                    clearup();
                }
                else 
                {
                    clearup();
                    return;
                }

                if (!newItem.isEmpty())
                {
                    Status s = new Status(false);
                    Status.newItem=newItem;
                    Status.index=index;
                    model.remove(index);
                    model.add(index, newItem);
                    clearup();
                }                
            }
        );
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
                .addComponent(arg[1]))
        );

        gl.setVerticalGroup(gl.createParallelGroup(CENTER)
            .addComponent(arg[0])
            .addGroup(gl.createSequentialGroup()
                .addComponent(arg[1]))
        );

        gl.linkSize(reBtn);

        pack();
    }

    public static void main(String args [])
    {
        Code ex = new Code();
        EventQueue.invokeLater(
            () ->
            {
                ex.setVisible(true);
            }
        );
        
        ex.clearup();
    }
}