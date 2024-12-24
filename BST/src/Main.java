public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /*
                  50
               /     \
              30      70
             /  \    /  \
           20   40  60   80 */
        
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print in-order traversal of the BST
        tree.inorder();
        System.out.println();

        // Search for a node with value 60
        Node result = tree.search(60);
        System.out.println("Search result: " + (result != null ? "Found" : "Not Found"));

        // Delete a node with value 20
        tree.delete(20);
        tree.inorder();
        System.out.println();

        // Delete a node with value 30 by copying
        tree.deleteByCopying(30);
        tree.inorder();
    }
}