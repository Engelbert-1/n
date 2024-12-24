import java.util.Scanner;

// Lớp Main để minh họa việc sử dụng cây tìm kiếm nhị phân
public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        // Chèn các chuỗi vào cây tìm kiếm nhị phân
        System.out.println("Nhập các chuỗi để chèn vào cây tìm kiếm nhị phân (nhấn enter để dừng):");
        String input;
        while (!(input = scanner.nextLine()).isEmpty()) {
            bst.insert(input);
        }

        // Hiển thị cây tìm kiếm nhị phân bằng cách duyệt theo thứ tự trung tố
        System.out.println("Cây tìm kiếm nhị phân (duyệt theo thứ tự trung tố):");
        bst.inorder(bst.root);
        System.out.println();

        // Tìm kiếm một giá trị trong cây tìm kiếm nhị phân
        System.out.println("Nhập một chuỗi để tìm kiếm:");
        String searchValue = scanner.nextLine();
        Node searchResult = bst.search(searchValue);
        if (searchResult != null)
            System.out.println(searchValue + " được tìm thấy trong cây tìm kiếm nhị phân.");
        else
            System.out.println(searchValue + " không được tìm thấy trong cây tìm kiếm nhị phân.");

        scanner.close();
    }
}