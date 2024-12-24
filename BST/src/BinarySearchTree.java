class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    // Insert a new node with given value
    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    // Search for a node with given value
    Node search(int value) {
        return searchRec(root, value);
    }

    Node searchRec(Node root, int value) {
        if (root == null || root.value == value) {
            return root;
        }

        if (root.value > value) {
            return searchRec(root.left, value);
        }

        return searchRec(root.right, value);
    }

    // Delete a node with given value
    void delete(int value) {
        root = deleteRec(root, value);
    }

    Node deleteRec(Node root, int value) {
        if (root == null) {
            return root;
        }

        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.value = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.value);
        }

        return root;
    }

    int minValue(Node root) {
        int minValue = root.value;
        while (root.left != null) {
            root = root.left;
            minValue = root.value;
        }
        return minValue;
    }

    // In-order traversal
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    // Deletion by copying
    void deleteByCopying(int value) {
        root = deleteByCopyingRec(root, value);
    }

    Node deleteByCopyingRec(Node root, int value) {
        if (root == null) {
            return root;
        }

        if (value < root.value) {
            root.left = deleteByCopyingRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteByCopyingRec(root.right, value);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            Node temp = root.right;
            while (temp.left != null) {
                temp = temp.left;
            }
            root.value = temp.value;

            // Delete the inorder successor
            root.right = deleteByCopyingRec(root.right, root.value);
        }

        return root;
    }
}