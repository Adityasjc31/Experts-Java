import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BinarySearchTree extends JFrame implements ActionListener {
    private NodeTree tree;
    private int windowHeight;
    private int windowWidth;
    private JLabel labelValue;
    private JTextField value;
    private FlowLayout layout;
    private JButton addNode;

    public BinarySearchTree() {
        init();
    }

    public void init() {
        layout = new FlowLayout();
        setLayout(layout);

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int actualWidth = (int) size.getWidth();
        int actualHeight = (int) size.getHeight();

        int width = (int) (50 / 100.0 * actualWidth);
        int height = (int) (50 / 100.0 * actualHeight);
        
        labelValue = new JLabel("Enter value : ");
        value = new JTextField(20);
        addNode = new JButton("Add");
        
        // add(labelValue);
        // add(value);
        // add(addNode);

        setSize(width, height);
        
        
        windowHeight = height;
        windowWidth = width;
        
        
        createNode(5);
        if (tree != null) {
            add(tree);
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void createNode(int val) {
        NodeTree temp = new NodeTree(100, 420);
        add(temp);
        // if (tree == null) {
        //     tree = new NodeTree((int)(windowHeight * 0.7),(int)(windowWidth* 0.1));
        // }
        // else
        // {
        //     // insert(tree, val);
        // }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        setBackground(Color.black);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
