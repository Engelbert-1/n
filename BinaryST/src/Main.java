public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Kiểm tra cây rỗng
        System.out.println("Cây rỗng: " + bst.isEmpty());

        // Chèn các giá trị vào cây tìm kiếm nhị phân
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // duyệt theo chiều rộng
        System.out.println("Cây tìm kiếm nhị phân (duyệt theo chiều rộng):");
        bst.breadth();
        System.out.println();

        //preorder
        System.out.println("Duyệt cây theo thứ tự trước:");
        bst.preorder(bst.root);
        System.out.println();

        // inorder
        System.out.println("Duyệt cây theo thứ tự giữa:");
        bst.inorder(bst.root);
        System.out.println();

        // postorder
        System.out.println("Duyệt cây theo thứ tự sau:");
        bst.postorder(bst.root);
        System.out.println();

        // search
        int searchValue = 40;
        Node searchResult = bst.search(searchValue);
        if (searchResult != null)
            System.out.println(searchValue + " được tìm thấy trong cây tìm kiếm nhị phân.");
        else
            System.out.println(searchValue + " không được tìm thấy trong cây tìm kiếm nhị phân.");

        // Tìm min, max
        System.out.println("Giá trị nhỏ nhất trong cây tìm kiếm nhị phân: " + bst.min().data);
        System.out.println("Giá trị lớn nhất trong cây tìm kiếm nhị phân: " + bst.max().data);

        // Đếm số nút 
        System.out.println("Số lượng nút trong cây tìm kiếm nhị phân: " + bst.count());

        // tổng các giá trị 
        System.out.println("Tổng các giá trị trong cây tìm kiếm nhị phân: " + bst.sum());

        // giá trị trung bình các nút 
        System.out.println("Giá trị trung bình của các nút trong cây tìm kiếm nhị phân: " + bst.avg());

        //chiều cao 
        System.out.println("Chiều cao của cây tìm kiếm nhị phân: " + bst.height());

        // Xóa sạch cây
        bst.clear();
        System.out.println("Cây đã được xóa: " + bst.isEmpty());
    }
}