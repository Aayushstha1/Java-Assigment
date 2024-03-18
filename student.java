public class student {
    // Member variables
    String name;
    int rollNo;

    // Constructor
    public student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        // Creating two objects of class Student with specified values
        student student1 = new student("John", 2);
        student student2 = new student("Ram",3 );

        // Accessing attributes of the objects
        System.out.println("student 1:");
        System.out.println("Name: " + student1.name);
        System.out.println("Roll No: " + student1.rollNo);

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + student2.name);
        System.out.println("Roll No: " + student2.rollNo);
    }
}
