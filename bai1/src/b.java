import java.util.ArrayList;
import java.util.List;


class Student {
    private int id;
    private String name;
    private String address;
    private String gender;
    private List<Course> enrolledCourses; 
    private Campus campus; 

    public Student(int id, String name, String address, String gender, Campus campus) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.campus = campus;
        this.enrolledCourses = new ArrayList<>();
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public Campus getCampus() {
        return campus;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }
}


class Course {
    private String code;
    private String name;
    private int credits;

    public Course(String code, String name, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
    }


    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }
}


class Campus {
    private String code;
    private String name;
    private String address;

    public Campus(String code, String name, String address) {
        this.code = code;
        this.name = name;
        this.address = address;
    }

  
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

public class b {
    public static void main(String[] args) {
        
        Campus campus1 = new Campus("C001", "FPTU Campus 1", "Address 1");
        Campus campus2 = new Campus("C002", "FPTU Campus 2", "Address 2");

        
        Course course1 = new Course("CS101", "Introduction to Programming", 3);
        Course course2 = new Course("CS201", "Data Structures", 4);

        
        Student student1 = new Student(1, "Hoang", "Thach Hoa", "Nam", campus1);
        Student student2 = new Student(2, "Hanh", "Tan Xa", "Nu", campus2);

        
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        
        System.out.println("Student 1 Information:");
        System.out.println("ID: " + student1.getId());
        System.out.println("Name: " + student1.getName());
        System.out.println("Address: " + student1.getAddress());
        System.out.println("Gender: " + student1.getGender());
        System.out.println("Campus: " + student1.getCampus().getName());
        System.out.println("Enrolled Courses:");
        for (Course course : student1.getEnrolledCourses()) {
            System.out.println("- " + course.getName() + " (" + course.getCode() + ")");
        }

        
        System.out.println("\nStudent 2 Information:");
        System.out.println("ID: " + student2.getId());
        System.out.println("Name: " + student2.getName());
        System.out.println("Address: " + student2.getAddress());
        System.out.println("Gender: " + student2.getGender());
        System.out.println("Campus: " + student2.getCampus().getName());
        System.out.println("Enrolled Courses:");
        for (Course course : student2.getEnrolledCourses()) {
            System.out.println("- " + course.getName() + " (" + course.getCode() + ")");
        }
    }
}



public class Cake {
    private String maker;
    private int price;
    
    public Cake(){
    
}
   
public Cake(String maker, int price){
    this.maker=maker;
    this.price=price;
}

public String getMaker(){
    String firstPart = maker.substring(0, maker.length() -1).toLowerCase();
    String lastPart = maker.substring( maker.length() -1).toUpperCase();
    return firstPart + lastPart;
}

public int getPrice(){
    return price;
}

public void setPrice(int price){
    this.price =price;
}}



public class Coffee {
    private String name;
    protected int size;
    
    public Coffee(){
   
}
    
public Coffee(String name, int size){
    this.name=name;
    this.size=size;
}

public String getName(){
    return name;
}

public int getSize(){
    return size;
}

public void setName(String name){
    this.name = name;
}

public String toString(){
    return name + ", " +size;
}}




public class SpecCoffee extends Coffee{
    private int price;
    
    public SpecCoffee(){
        super();
    }
    public SpecCoffee(String name, int size, int price){
        super(name, size);
        this.price = price;
    }
    
    public String toString(){
        return super.toString() + ", " +price;
    }
    
    public void setData(){
        setName("CF"+ getName());
    }
    
    public int getValue(){
        if(getSize() > 10){
            return price;
        }else{
            return price + 5;
        }
    
    }
}
