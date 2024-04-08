
import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    // Constructor
    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Getter for hire date
    public LocalDate getHireDate() {
        return hireDate;
    }

    // Method to calculate years of service
    public int calculateYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(hireDate, currentDate);
        return period.getYears();
    }

    public static void main(String[] args) {
        // Example usage
        LocalDate hireDate = LocalDate.of(2018, 7, 15);
        Employee employee = new Employee("John Doe", 50000.0, hireDate);
        
        // Print employee information
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: $" + employee.getSalary());
        System.out.println("Employee Hire Date: " + employee.getHireDate());
        System.out.println("Years of Service: " + employee.calculateYearsOfService());
    }
}