public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Xây dựng cây nhị phân
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Kiểm tra các kiểu duyệt cây
        System.out.println("Duyệt trước (Preorder):");
        tree.printPreorder(tree.root);

        System.out.println("\nDuyệt giữa (Inorder):");
        tree.printInorder(tree.root);

        System.out.println("\nDuyệt sau (Postorder):");
        tree.printPostorder(tree.root);
    }
}