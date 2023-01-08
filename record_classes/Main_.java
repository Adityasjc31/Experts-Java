package record_classes;

import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
/*w  ww  . j a  va  2  s.c o  m*/
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class Main_ extends JFrame implements ActionListener{
    String[] items = { "one", "two", "three", "four", "five" };
    SortedComboBoxModel model = new SortedComboBoxModel(items);
    JComboBox comboBox = new JComboBox(model);
    JTextField textField = new JTextField(15);
    JButton b = new JButton("Hello");

    public Main_() {
        textField.addActionListener(e -> {
                comboBox.addItem(textField.getText());
                textField.setText("");
                comboBox.showPopup();
            });

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.add(comboBox, BorderLayout.SOUTH);
        frame.add(textField, BorderLayout.WEST);
        frame.add(new JLabel("Enter to add Item  "), BorderLayout.EAST);
        frame.add(b);
        b.addActionListener(this);
        frame.pack();

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent evt)
    {
        comboBox.setSelectedIndex(2);
    }

    public static void main(String[] args) {
        new Main_();
    }
}

class SortedComboBoxModel extends DefaultComboBoxModel {
    public SortedComboBoxModel() {
        super();
    }

    public SortedComboBoxModel(Object[] items) {
        Arrays.sort(items);
        int size = items.length;
        for (int i = 0; i < size; i++) {
            super.addElement(items[i]);
        }
        setSelectedItem(items[0]);
    }

    public SortedComboBoxModel(Vector items) {
        Collections.sort(items);
        int size = items.size();
        for (int i = 0; i < size; i++) {
            super.addElement(items.elementAt(i));
        }
        setSelectedItem(items.elementAt(0));
    }

    @Override
    public void addElement(Object element) {
        insertElementAt(element, 0);
    }

    @Override
    public void insertElementAt(Object element, int index) {
        int size = getSize();
        for (index = 0; index < size; index++) {
            Comparable c = (Comparable) getElementAt(index);
            if (c.compareTo(element) > 0) {
                break;
            }
        }
        super.insertElementAt(element, index);
    }
}