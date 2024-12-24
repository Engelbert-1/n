public class BinaryTree {
    Node root;   
    public BinaryTree(int key) {
        root = new Node(key);
    }
    public BinaryTree() {
        root = null;
    }
    
    // Phương thức duyệt cây - Inorder
    public void printInorder(Node node) {
        if (node == null)
            return;
        // Duyệt cây con trái
        printInorder(node.left);
        // In giá trị của nút
        System.out.print(node.value + " ");
        // Duyệt cây con phải
        printInorder(node.right);
    }

    // Phương thức duyệt cây - Preorder
    public void printPreorder(Node node) {
        if (node == null)
            return;
        // In giá trị của nút
        System.out.print(node.value + " ");
        // Duyệt cây con trái
        printPreorder(node.left);
        // Duyệt cây con phải
        printPreorder(node.right);
    }
    
    // Phương thức duyệt cây - Postorder
    public void printPostorder(Node node) {
        if (node == null)
            return;
        // Duyệt cây con trái
        printPostorder(node.left);
        // Duyệt cây con phải
        printPostorder(node.right);
        // In giá trị của nút
        System.out.print(node.value + " ");
    }
}