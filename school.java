class AddDistance{
    
}

class Student {
    String student_name;
    int roll_no;

    void AssigningValues(String name, int roll) {
        this.student_name = name;
        this.roll_no = roll;
    }

    void Displaydetails() {
        System.out.println("Student's name: " + this.student_name);
        System.out.println("The roll no of student: " + this.roll_no);
    }
}

public class School {


    public static void main(String[] args) {
        Student studentA =new Student();
        Student studentB = new Student();
        studentA.AssigningValues("John", 101);
        studentB.AssigningValues("Lovely", 12);
        studentA.Displaydetails();
        studentB.Displaydetails();
        
    }
}