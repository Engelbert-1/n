class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        head = null;
    }

    // q1
    public void addToHead(String x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }

    // q2
    public void addToTail(String x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // q3
    public void addAfter(Node p, String x) {
        if (p == null) {
            return;
        }
        Node newNode = new Node(x);
        newNode.next = p.next;
        p.next = newNode;
    }

    // q4
    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // q5
    public String deleteFromHead() {
        if (head == null) {
            return null; 
        }
        String value = head.data;
        head = head.next;
        return value;
    }

    // q6
    public String deleteFromTail() {
        if (head == null) {
            return null; 
        }
        if (head.next == null) {
            String value = head.data;
            head = null;
            return value;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        String value = temp.next.data;
        temp.next = null;
        return value;
    }

    // q7
    public String deleteAfter(Node p) {
        if (p == null || p.next == null) {
            return null; 
        }
        String value = p.next.data;
        p.next = p.next.next;
        return value;
    }

    // q8
    public void dele(String x) {
        if (head == null) {
            return;
        }
        if (head.data.equals(x)) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && !temp.next.data.equals(x)) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // q9
    public Node search(String x) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(x)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // q10
    public int count() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}