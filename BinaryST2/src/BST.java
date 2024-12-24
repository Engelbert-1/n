class BinarySearchTree {
    Node root; // Gốc của cây tìm kiếm nhị phân

    // Constructor để khởi tạo một cây tìm kiếm nhị phân rỗng
    public BinarySearchTree() {
        root = null;
    }

    // Phương thức để chèn một giá trị chuỗi vào cây tìm kiếm nhị phân
    public void insert(String value) {
        root = insertRec(root, value);
    }

    // Phương thức trợ giúp cho việc chèn
    private Node insertRec(Node root, String value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        // So sánh chuỗi và chèn tương ứng
        int compareResult = value.compareTo(root.data);
        if (compareResult < 0)
            root.left = insertRec(root.left, value);
        else if (compareResult > 0)
            root.right = insertRec(root.right, value);

        return root;
    }

    // Phương thức để thực hiện duyệt theo thứ tự trung tố của cây tìm kiếm nhị phân
    public void inorder(Node p) {
        if (p != null) {
            inorder(p.left);
            System.out.print(p.data + " ");
            inorder(p.right);
        }
    }

    // Phương thức để tìm kiếm một giá trị chuỗi trong cây tìm kiếm nhị phân
    public Node search(String value) {
        return searchRec(root, value);
    }

    // Phương thức trợ giúp cho việc tìm kiếm
    private Node searchRec(Node root, String value) {
        if (root == null || root.data.equals(value))
            return root;

        int compareResult = value.compareTo(root.data);
        if (compareResult < 0)
            return searchRec(root.left, value);

        return searchRec(root.right, value);
    }
}