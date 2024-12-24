import java.util.Scanner;

class Book {
    private String code;
    private String title;
    private String publisher;

    public Book(String code, String title, String publisher) {
        this.code = code;
        this.title = title;
        this.publisher = publisher;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }
}

public class BookManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[100]; // assuming a maximum of 100 books
        int count = 0;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1: Nhập sách");
            System.out.println("2: Xuất sách");
            System.out.println("3: Thoát chương trình");
            System.out.print("Chọn một chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            
            switch (choice) {
                case 1:
                    System.out.print("Nhập mã sách: ");
                    String code = scanner.nextLine();
                    System.out.print("Nhập tựa đề: ");
                    String title = scanner.nextLine();
                    System.out.print("Nhập NXB: ");
                    String publisher = scanner.nextLine();
                    books[count++] = new Book(code, title, publisher);
                    break;
                case 2:
                    System.out.println("Danh sách sách:");
                    for (int i = 0; i < count; i++) {
                        Book book = books[i];
                        System.out.println("Mã sách: " + book.getCode() + ", Tựa đề: " + book.getTitle() + ", NXB: " + book.getPublisher());
                    }
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}