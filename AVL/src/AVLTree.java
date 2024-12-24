class AVLTree {
    Node root;
    // Constructor: Khởi tạo cây AVL với root là null
    AVLTree() {
        root = null;
    }
    
    // Hàm tính chiều cao của một nút
    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    // Hàm trả về số lớn nhất giữa hai số
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Xoay phải quanh nút y
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        // Thực hiện xoay
        x.right = y;
        y.left = T2;

        // Cập nhật chiều cao của các nút
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
        return x;
    }

    // Xoay trái quanh nút x
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        // Thực hiện xoay
        y.left = x;
        x.right = T2;
        // Cập nhật chiều cao của các nút
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
        return y;
    }

    // Lấy giá trị cân bằng của một nút
    int getBalance(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    // Chèn một nút mới vào cây AVL
    Node insert(Node node, int key) {
        if (node == null)
            return new Node(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node;

        // Cập nhật chiều cao của nút
        node.height = 1 + max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // Kiểm tra và thực hiện các phép xoay để cân bằng cây
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Tìm nút có giá trị nhỏ nhất trong một cây con
    Node minValueNode(Node node) {
        Node current = node;

        while (current.left != null)
            current = current.left;

        return current;
    }

    // Xóa một nút từ cây AVL
    Node deleteNode(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = deleteNode(root.left, key);
        else if (key > root.key)
            root.right = deleteNode(root.right, key);
        else {
            if ((root.left == null) || (root.right == null)) {
                Node temp = null;
                if (temp == root.left)
                    temp = root.right;
                else
                    temp = root.left;

                if (temp == null) {
                    temp = root;
                    root = null;
                } else
                    root = temp;
            } else {
                Node temp = minValueNode(root.right);

                root.key = temp.key;

                root.right = deleteNode(root.right, temp.key);
            }
        }

        if (root == null)
            return root;

        // Cập nhật chiều cao của nút và cân bằng cây
        root.height = max(height(root.left), height(root.right)) + 1;

        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // Duyệt cây theo thứ tự trước và in ra các giá trị
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}