import java.util.ArrayList;
import java.util.List;

class Employee {
    private final int id;
    private final String name;
    private final String gender;
    private final double basicSalary;

    public Employee(int id, String name, String gender, double basicSalary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }
}

class Manager extends Employee {
    private double bonusSalary;

    public Manager(int id, String name, String gender, double basicSalary, double bonusSalary) {
        super(id, name, gender, basicSalary);
        this.bonusSalary = bonusSalary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    @Override
    public double calculateSalary() {
        return super.getBasicSalary() + bonusSalary;
    }
}

class Project {
    private final String projectCode;
    private final String projectName;
    private final String startDate;
    private final String endDate;
    private final int totalHours;
    private final List<Employee> employees;

    public Project(String projectCode, String projectName, String startDate, String endDate, int totalHours) {
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalHours = totalHours;
        this.employees = new ArrayList<>();
    }

    public String getProjectCode() {
        return projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

public class c {
    public static void main(String[] args) {
        // Tạo các đối tượng nhân viên và dự án
        Employee employee1 = new Employee(1, "John", "Male", 1000);
        Manager manager1 = new Manager(2, "Alice", "Female", 1500, 500);
        Project project1 = new Project("P001", "Project A", "2024-04-01", "2024-04-30", 160);

        // Thêm nhân viên vào dự án
        project1.addEmployee(employee1);
        project1.addEmployee(manager1);

        // In thông tin dự án
        System.out.println("Project Name: " + project1.getProjectName());
        System.out.println("Project Code: " + project1.getProjectCode());
        System.out.println("Start Date: " + project1.getStartDate());
        System.out.println("End Date: " + project1.getEndDate());
        System.out.println("Total Hours: " + project1.getTotalHours());

        // In thông tin các nhân viên tham gia dự án
        System.out.println("Employees in this project:");
        for (Employee employee : project1.getEmployees()) {
            System.out.println("Employee ID: " + employee.getId());
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Employee Gender: " + employee.getGender());
            System.out.println("Employee Basic Salary: " + employee.getBasicSalary());
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                System.out.println("Manager Bonus Salary: " + manager.getBonusSalary());
            }
            System.out.println("Employee Total Salary: " + employee.calculateSalary());
            System.out.println();
        }
    }
}