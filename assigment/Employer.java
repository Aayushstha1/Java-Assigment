
class Employee {
    void display() {
        System.out.println("Name of class in Employee");
    }

    void calcSalary() {
        System.out.println("Salary of employee is 10000");
    }
}

class Engineer extends Employee {
    @Override
    void calcSalary() {
        System.out.println("Salary of employee is 20000");
    }
}

public class Employer {
    public static void main(String[] args) {
        // Using single object instantiation
        Employee emp = new Engineer();

        // Display the name of the class
        emp.display();

        // Display the salary calculated based on the object type
        emp.calcSalary();
    }
}