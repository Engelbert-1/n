class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // Thêm một nút vào đầu danh sách
    public void addToHead(String x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }

    // Thêm một nút vào cuối danh sách
    public void addToTail(String x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Operation 3: Add After
    public void addAfter(Node p, String x) {
        if (p == null) {
            System.out.println("Node p is null.");
            return;
        }
        Node newNode = new Node(x);
        newNode.next = p.next;
        p.next = newNode;
    }

    // Operation 4: Traverse
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Operation 5: Delete From Head
    public String deleteFromHead() {
        if (head == null) {
            System.out.println("List is empty.");
            return null;
        }
        String deletedData = head.data;
        head = head.next;
        return deletedData;
    }

    // Operation 6: Delete From Tail
    public String deleteFromTail() {
        if (head == null) {
            System.out.println("List is empty.");
            return null;
        }
        if (head.next == null) {
            String deletedData = head.data;
            head = null;
            return deletedData;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        String deletedData = current.next.data;
        current.next = null;
        return deletedData;
    }

    // Operation 7: Delete After
    public String deleteAfter(Node p) {
        if (p == null || p.next == null) {
            System.out.println("Node p is null or p is the last node.");
            return null;
        }
        String deletedData = p.next.data;
        p.next = p.next.next;
        return deletedData;
    }

    // Operation 8: Delete First Occurrence
    public void delete(String x) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.data.equals(x)) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && !current.next.data.equals(x)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Element " + x + " not found.");
        }
    }

    // Operation 9: Search
    public Node search(String x) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(x)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Operation 10: Count
    public int count() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}