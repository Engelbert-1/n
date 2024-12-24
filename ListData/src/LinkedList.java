class LinkedList {
    Node head;

    // Thêm một nút vào đầu danh sách
    void addToHead(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }

    // Thêm một nút vào cuối danh sách
    void addToTail(int x) {
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

    // Thêm một nút có giá trị x sau nút p
    void addAfter(Node p, int x) {
        if (p == null) {
            System.out.println("Previous node cannot be null");
            return;
        }
        Node newNode = new Node(x);
        newNode.next = p.next;
        p.next = newNode;
    }

    // Duyệt từ đầu đến cuối và hiển thị thông tin của tất cả các nút trong danh sách
    void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Xóa phần đầu và trả về thông tin của nó
    int deleteFromHead() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        int deletedData = head.data;
        head = head.next;
        return deletedData;
    }

    // Xóa phần đuôi và trả lại thông tin của nó
    int deleteFromTail() {
        if (head == null || head.next == null) {
            return deleteFromHead();
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        int deletedData = secondLast.next.data;
        secondLast.next = null;
        return deletedData;
    }

    // Xóa nút sau nút p và trả về thông tin của nó
    int deleteAfter(Node p) {
        if (p == null || p.next == null) {
            System.out.println("Node p is null or the next node doesn't exist");
            return -1;
        }
        int deletedData = p.next.data;
        p.next = p.next.next;
        return deletedData;
    }

    // Xóa nút đầu tiên có thông tin bằng x
    void delete(int x) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == x) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != x) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Node with value " + x + " not found");
        }
    }

    // Tìm kiếm nút đầu tiên có thông tin x và trả về tham chiếu đến nút đó
    Node search(int x) {
        Node current = head;
        while (current != null && current.data != x) {
            current = current.next;
        }
        return current;
    }

    // Đếm số lượng nút trong danh sách
    int count() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Sắp xếp danh sách theo thứ tự tăng dần
    void sort() {
        if (head == null || head.next == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            Node index = current.next;
            while (index != null) {
                if (current.data > index.data) {
                    int temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    // Chuyển danh sách liên kết đơn thành mảng
    int[] toArray() {
        int[] arr = new int[count()];
        Node current = head;
        int i = 0;
        while (current != null) {
            arr[i++] = current.data;
            current = current.next;
        }
        return arr;
    }

    // Hợp nhất hai danh sách liên kết đơn có thứ tự thành một danh sách có thứ tự
    void merge(LinkedList list) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = list.head;
        sort();
    }

    // Thêm một nút có giá trị x trước nút p
    void addBefore(Node p, int x) {
        if (p == null) {
            System.out.println("Node p cannot be null");
            return;
        }
        if (head == null || head == p) {
            addToHead(x);
            return;
        }
        Node current = head;
        while (current.next != p && current.next != null) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Node p not found");
            return;
        }
        Node newNode = new Node(x);
        newNode.next = p;
        current.next = newNode;
    }

    // Đính kèm danh sách liên kết đơn vào cuối danh sách liên kết đơn khác
    void append(LinkedList list) {
        if (head == null) {
            head = list.head;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = list.head;
    }

    // Tìm và trả về giá trị lớn nhất trong danh sách
    int max() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        int max = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    // Tìm và trả về giá trị nhỏ nhất trong danh sách
    int min() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        int min = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    // Trả về tổng của tất cả các giá trị trong danh sách
    int sum() {
        int sum = 0;
        Node current = head;
        while (current != null) {
            sum += current.data;
            current = current.next;
        }
        return sum;
    }

    // Trả về giá trị trung bình của tất cả các giá trị trong danh sách
    double avg() {
        int count = count();
        if (count == 0) {
            return 0;
        }
        return (double) sum() / count;
    }

    // Kiểm tra và trả về true nếu danh sách được sắp xếp, trả về false nếu danh sách không được sắp xếp
    boolean isSorted() {
        if (head == null || head.next == null) {
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.data > current.next.data) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    // Chèn nút có giá trị x vào danh sách đã sắp xếp để danh sách mới được sắp xếp
    void insert(int x) {
        if (head == null || x <= head.data) {
            addToHead(x);
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data < x) {
            current = current.next;
        }
        addAfter(current, x);
    }

    // Đảo ngược danh sách liên kết đơn chỉ bằng một lần duyệt qua danh sách
    void reverse() {
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

    // Kiểm tra xem hai danh sách liên kết đơn có nội dung giống nhau hay không
    boolean isEqual(LinkedList list) {
        Node current1 = this.head;
        Node current2 = list.head;
        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return current1 == null && current2 == null;
    }
}