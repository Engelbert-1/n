// Lớp Node đại diện cho mỗi nút trong cây tìm kiếm nhị phân
class Node {
    int data; // Dữ liệu số nguyên được lưu trữ trong nút
    Node left;   // Tham chiếu đến nút con bên trái
    Node right;  // Tham chiếu đến nút con bên phải

    // Constructor để khởi tạo nút với dữ liệu
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}