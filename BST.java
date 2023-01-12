import java.util.Scanner;

class BST {
    private Node tree;
    public void mkt(int val) {
        if (tree == null) {
            tree = new Node(val);
        }
        else
        {
            insert(tree, val);
        }
    }

    private void insert(Node parent,int val) {
        if (parent.getData() > val) {
            if (parent.getLeft() == null) {
                parent.setLeft(new Node(val));
            } else {
                insert(parent.getLeft(),val);
            }
        }
        else{
            if (parent.getRight() == null) {
                parent.setRight(new Node(val));
            } else {
                insert(parent.getRight(), val);
            }
        }
    }
    private String print(Node ptr)
    {
        if (ptr == null) {
            return "";
        }
        else
        {
            String data = ptr.getData() + "";
            String left = print(ptr.getLeft());
            if (left.length() > 0) {
                left = "->" + left;
            }
            String right = print(ptr.getRight());
            if (right.length() > 0) {
                right = "->" + right;
            }
            return data + left + right;
        }
    }
    @Override
    public String toString() {
            return "BinarySearch Tree() => " + print(tree);
    }

    public static void main(String[] args) {
        BST bst = new BST();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int elems = sc.nextInt();
        for (int x = 1; x <= elems; x++) {
            System.out.print("Enter element : ");
            int val = sc.nextInt();
            bst.mkt(val);;
        }
        sc.close();

        System.out.println(bst);
    }
}
