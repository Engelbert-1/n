public class MyQueue {
    private Node front; 
    private Node rear; 

    public MyQueue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
    }

    public double dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Hàng đợi trống");
        }
        double dequeuedData = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return dequeuedData;
    }
}