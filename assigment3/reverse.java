//2. Write a Java String Program to Reverse a String.


public class reverse {

}
    public static void main(String[] args) {
        String originalString = "Hello World";
        String reversedString = new StringBuilder(originalString).reverse().toString();
        System.out.println("Reversed String: " + reversedString);
    }


