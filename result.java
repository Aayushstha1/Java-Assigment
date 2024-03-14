// a school has following grading system 
/**
 * below 25 -F
 * 25-45 - E
 * 45-50 D
 * 50-60 C
 * 60-70 B
 * above 80 A
 */
import java.util.Scanner; //importing for to get user input

public class result {
    public static void main(String[] arg) {
        //creating objects
        Scanner sc = new Scanner(System.in);// for getting the user inputs
       
        System.out.println("Enter the marks of student:");
        int marks = sc.nextInt();//this line  is used to take integer value from user
        if (marks <= 25) {
            System.out.println("Your Grade is F");
        } else if (marks <= 45) {
            System.out.println("Your Grade is E");
        } else if (marks <= 50) {
            System.out.println("Your Grade is D");
        }
        else if (marks <= 60) {
            System.out.println("Your Grade is C");
        } else if (marks <= 80) {
            System.out.println("Your Grade is B");
        } else {
            System.out.println("Your Grade is A");
        }
        sc.close();
    }
}