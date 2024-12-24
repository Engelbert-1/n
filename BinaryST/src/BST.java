import java.util.LinkedList;
import java.util.Queue;

// Lớp Binary Search Tree
class BinarySearchTree {
    Node root; // Gốc của cây tìm kiếm nhị phân

    // Constructor để khởi tạo một cây tìm kiếm nhị phân rỗng
    public BinarySearchTree() {
        root = null;
    }

    // Phương thức để kiểm tra cây có rỗng hay không
    public boolean isEmpty() {
        return root == null;
    }

    // Phương thức để xóa sạch cây
    public void clear() {
        root = null;
    }

    // Phương thức để tìm kiếm một giá trị trong cây tìm kiếm nhị phân
    public Node search(int x) {
        return searchRec(root, x);
    }

    // Phương thức trợ giúp cho việc tìm kiếm
    private Node searchRec(Node root, int x) {
        if (root == null || root.data == x)
            return root;

        if (x < root.data)
            return searchRec(root.left, x);
        
        return searchRec(root.right, x);
    }

    // Phương thức để chèn một giá trị vào cây tìm kiếm nhị phân
    public void insert(int x) {
        if (search(x) == null) {
            root = insertRec(root, x);
        }
    }

    // Phương thức trợ giúp cho việc chèn
    private Node insertRec(Node root, int x) {
        if (root == null) {
            root = new Node(x);
            return root;
        }

        if (x < root.data)
            root.left = insertRec(root.left, x);
        else if (x > root.data)
            root.right = insertRec(root.right, x);

        return root;
    }

    // Phương thức để duyệt cây theo chiều rộng
    public void breadth() {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            if (tempNode.left != null)
                queue.add(tempNode.left);

            if (tempNode.right != null)
                queue.add(tempNode.right);
        }
    }

    // Phương thức duyệt cây theo thứ tự trước (preorder)
    public void preorder(Node p) {
        if (p != null) {
            System.out.print(p.data + " ");
            preorder(p.left);
            preorder(p.right);
        }
    }

    // Phương thức duyệt cây theo thứ tự giữa (inorder)
    public void inorder(Node p) {
        if (p != null) {
            inorder(p.left);
            System.out.print(p.data + " ");
            inorder(p.right);
        }
    }

    // Phương thức duyệt cây theo thứ tự sau (postorder)
    public void postorder(Node p) {
        if (p != null) {
            postorder(p.left);
            postorder(p.right);
            System.out.print(p.data + " ");
        }
    }

    // Phương thức đếm số lượng nút trong cây
    public int count() {
        return countRec(root);
    }

    // Phương thức trợ giúp cho việc đếm số lượng nút
    private int countRec(Node root) {
        if (root == null)
            return 0;
        return 1 + countRec(root.left) + countRec(root.right);
    }

    // Phương thức tìm giá trị nhỏ nhất trong cây
    private int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    // Phương thức tìm nút có giá trị nhỏ nhất
    public Node min() {
        return minRec(root);
    }

    // Phương thức trợ giúp cho việc tìm nút có giá trị nhỏ nhất
    private Node minRec(Node root) {
        if (root == null || root.left == null)
            return root;

        return minRec(root.left);
    }

    // Phương thức tìm nút có giá trị lớn nhất
    public Node max() {
        return maxRec(root);
    }

    // Phương thức trợ giúp cho việc tìm nút có giá trị lớn nhất
    private Node maxRec(Node root) {
        if (root == null || root.right == null)
            return root;

        return maxRec(root.right);
    }

    // Phương thức tính tổng các giá trị trong cây
    public int sum() {
        return sumRec(root);
    }

    // Phương thức trợ giúp cho việc tính tổng các giá trị trong cây
    private int sumRec(Node root) {
        if (root == null)
            return 0;
        return root.data + sumRec(root.left) + sumRec(root.right);
    }

    // Phương thức tính giá trị trung bình của các nút trong cây
    public int avg() {
        int sum = sum();
        int count = count();
        return count == 0 ? 0 : sum / count;
    }

    // Phương thức tính chiều cao của cây
    public int height() {
        return heightRec(root);
    }

    // Phương thức trợ giúp cho việc tính chiều cao của cây
    private int heightRec(Node root) {
        if (root == null)
            return 0;
        return 1 + Math.max(heightRec(root.left), heightRec(root.right));
    }
}