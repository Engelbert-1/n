import java.util.Scanner;

class Cat {
    private final int id;
    private String name;
    private String gender;
    private double price;

    // Phương thức khởi tạo
    public Cat(int id, String name, String gender, double price) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.price = price;
    }

    // Phương thức hiển thị thông tin mèo
    public void display() {
        System.out.println("Mèo: ID-" + id + ", Name: " + name + ", Gender: " + gender + ", Price: $" + price);
    }
}

// Lớp sinh viên
class Student {
    private int id;
    private String name;
    private String gender;
    private double score;

    // Phương thức khởi tạo
    public Student(int id, String name, String gender, double score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    // Phương thức hiển thị thông tin sinh viên
    public void display() {
        System.out.println("Sinh viên: ID-" + id + ", Name: " + name + ", Gender: " + gender + ", Score: " + score);
    }
}

// Lớp quản lý
class Management {
    private Cat cat;
    private Student student;

    // Phương thức khởi tạo
    public Management(Cat cat, Student student) {
        this.cat = cat;
        this.student = student;
    }

    // Phương thức hiển thị thông tin mèo và sinh viên
    public void displayInfo() {
        cat.display();
        student.display();
    }
}

public class f {
    public static void main(String[] args) {
        // Nhập thông tin mèo
        try (Scanner scanner = new Scanner(System.in)) {
            // Nhập thông tin mèo
            System.out.println("Nhập thông tin mèo:");
            System.out.print("ID: ");
            int catId = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống
            System.out.print("Name: ");
            String catName = scanner.nextLine();
            System.out.print("Gender: ");
            String catGender = scanner.nextLine();
            System.out.print("Price: $");
            double catPrice = scanner.nextDouble();
            Cat cat = new Cat(catId, catName, catGender, catPrice);
            
            // Nhập thông tin sinh viên
            System.out.println("Nhập thông tin sinh viên:");
            System.out.print("ID: ");
            int studentId = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống
            System.out.print("Name: ");
            String studentName = scanner.nextLine();
            System.out.print("Gender: ");
            String studentGender = scanner.nextLine();
            System.out.print("Score: ");
            double studentScore = scanner.nextDouble();
            Student student = new Student(studentId, studentName, studentGender, studentScore);
            
            // Tạo đối tượng quản lý và hiển thị thông tin
            Management management = new Management(cat, student);
            System.out.println("\nThông tin vừa nhập:");
            management.displayInfo();
        }
    }
}