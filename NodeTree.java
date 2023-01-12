import java.awt.Graphics;

import javax.swing.*;

import java.awt.*;

class NodeTree extends JPanel {
    // private int x, y, height, width;
    // private String data;
    private static node Node[];
    private node selfNode;

    class node {
        private int x;
        private int y;
        private int height;
        private int width;
        private String data;

        public node(int x, int y) {
            setNodeAttr(x, y, 100, 100, "NULL");
        }

        public node(int x, int y, String data) {
            setNodeAttr(x, y, 100, 100, data);
        }

        public node(int x, int y, int width, int height) {
            setNodeAttr(x, y, width, height, "NULL");
        }

        public node(int x, int y, int width, int height, String data) {
            setNodeAttr(x, y, width, height, data);
        }

        public int getX() {
            return x;
        }

        public String getData() {
            return data;
        }

        public double getHeight() {
            return height;
        }

        public double getWidth() {
            return width;
        }

        public double getY() {
            return y;
        }

        public void setData(String data) {
            this.data = data;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        private void setNodeAttr(int x, int y, int width, int height, String data) {
            this.x = x;
            this.y = y;
            this.height = height;
            this.width = width;
            this.data = data;
        }

        public node getNode() {
            return this;
        }

        public node[] push(node ar[]) {
            if (ar == null) {
                node arr[] = new node[1];
                arr[0] = this;
                ar = arr;
                return ar;
            }
            node arr[] = new node[ar.length + 1];
            for (int i = 0; i < ar.length; i++) {
                arr[i] = ar[i];
            }
            arr[ar.length] = this;
            ar = arr;
            return ar;
        }
    }

    public NodeTree(int x, int y) {
        setNodeTreeAttr(x, y, 100, 100, "NULL");
    }

    public NodeTree(int x, int y, String data) {
        setNodeTreeAttr(x, y, 100, 100, data);
    }

    public NodeTree(int x, int y, int width, int height) {
        setNodeTreeAttr(x, y, width, height, "NULL");
    }

    public NodeTree(int x, int y, int width, int height, String data) {
        setNodeTreeAttr(x, y, width, height, data);
    }

    private void setNodeTreeAttr(int x, int y, int width, int height, String data) {
        // this.x = x;
        // this.y = y;
        // this.height = height;
        // this.width = width;
        // this.data = data;
        node New = new node(x, y, width, height, data);
        selfNode = New;
        Node = New.push(Node);
        repaint();
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        for (int i = 0; i < Node.length; i++) {
            g2d.setColor(Color.lightGray);
            g2d.fillOval(Node[i].x, Node[i].y, Node[i].width, Node[i].height);

            g2d.setColor(Color.black);

            int x = (int) (Node[i].x + ((0.5 * Node[i].width) - Node[i].data.length())) - (Node[i].data.length() * 3);
            int y = (int) (Node[i].y + (0.5 * Node[i].height));

            g2d.drawString(Node[i].data, x, y);
        }
        // g2 = g2d;
    }
    public node getNode() {
        return selfNode;
    }
}

// public static void main(String[] args) {
// JFrame frame = new JFrame();
// NodeTree c = new NodeTree(420, 100);
// frame.add(c);
// frame.setVisible(true);
// }
// }
// private Graphics2D g2;