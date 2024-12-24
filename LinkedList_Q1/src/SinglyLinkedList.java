class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        head = null;
    }

    // q1
    public void addToHead(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }

    // q2
    public void addToTail(int x) {
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

    // q3:
    public void addAfter(Node p, int x) {
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
    public int deleteFromHead() {
        if (head == null) {
            return -1; 
        }
        int value = head.data;
        head = head.next;
        return value;
    }

    // q6
    public int deleteFromTail() {
        if (head == null) {
            return -1; 
        }
        if (head.next == null) {
            int value = head.data;
            head = null;
            return value;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int value = temp.next.data;
        temp.next = null;
        return value;
    }

    // q7
    public int deleteAfter(Node p) {
        if (p == null || p.next == null) {
            return -1; 
        }
        int value = p.next.data;
        p.next = p.next.next;
        return value;
    }

    // q8
    public void dele(int x) {
        if (head == null) {
            return;
        }
        if (head.data == x) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != x) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // q9
    public Node search(int x) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == x) {
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

    // q11
    public void deleAt(int i) {
        if (i < 0 || head == null) {
            return;
        }
        if (i == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int index = 0; index < i - 1; index++) {
            if (temp.next == null) {
                return;
            }
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // q12
    public void sort() {
        if (head == null) {
            return;
        }
        Node current = head, index;
        int temp;
        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    // q13
    public void dele(Node p) {
        if (head == null || p == null) {
            return;
        }
        if (head == p) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next != p) {
            temp = temp.next;
        }
        if (temp.next == p) {
            temp.next = p.next;
        }
    }

    // q14
    public int[] toArray() {
        int size = count();
        int[] arr = new int[size];
        Node temp = head;
        int i = 0;
        while (temp != null) {
            arr[i++] = temp.data;
            temp = temp.next;
        }
        return arr;
    }

    // q15
    public static SinglyLinkedList merge(SinglyLinkedList list1, SinglyLinkedList list2) {
        SinglyLinkedList mergedList = new SinglyLinkedList();
        Node p1 = list1.head;
        Node p2 = list2.head;
        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                mergedList.addToTail(p1.data);
                p1 = p1.next;
            } else {
                mergedList.addToTail(p2.data);
                p2 = p2.next;
            }
        }
        while (p1 != null) {
            mergedList.addToTail(p1.data);
            p1 = p1.next;
        }
        while (p2 != null) {
            mergedList.addToTail(p2.data);
            p2 = p2.next;
        }
        return mergedList;
    }

    // q16
    public void addBefore(Node p, int x) {
        if (head == null || p == null) {
            return;
        }
        if (head == p) {
            addToHead(x);
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next != p) {
            temp = temp.next;
        }
        if (temp.next == p) {
            Node newNode = new Node(x);
            newNode.next = p;
            temp.next = newNode;
        }
    }

    // q17
    public void attach(SinglyLinkedList list) {
        if (head == null) {
            head = list.head;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = list.head;
    }

    // q18
    public int max() {
        if (head == null) {
            return Integer.MIN_VALUE; 
        }
        int maxValue = head.data;
        Node temp = head.next;
        while (temp != null) {
            if (temp.data > maxValue) {
                maxValue = temp.data;
            }
            temp = temp.next;
        }
        return maxValue;
    }

    // q19
    public int min() {
        if (head == null) {
            return Integer.MAX_VALUE;
        }
        int minValue = head.data;
        Node temp = head.next;
        while (temp != null) {
            if (temp.data < minValue) {
                minValue = temp.data;
            }
            temp = temp.next;
        }
        return minValue;
    }

    // q20
    public int sum() {
        int sum = 0;
        Node temp = head;
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        return sum;
    }

    // q21
    public double avg() {
        int sum = 0;
        int count = 0;
        Node temp = head;
        while (temp != null) {
            sum += temp.data;
            count++;
            temp = temp.next;
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    // q22
    public boolean sorted() {
        if (head == null) {
            return true;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.data > temp.next.data) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    // q23
    public void insert(int x) {
        Node newNode = new Node(x);
        if (head == null || head.data >= x) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data < x) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // q24
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // q25
    public boolean isEqual(SinglyLinkedList other) {
        Node temp1 = this.head;
        Node temp2 = other.head;
        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1 == null && temp2 == null;
    }
}
