//Write a Java program to read input from the Java console.

import java.util.Scanner;

public class console {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
        scanner.close();
    }
}


