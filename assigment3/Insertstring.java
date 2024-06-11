//1. Write a Java String Program to Insert a String into Another String.
public class InsertString {
    public static void main(String[] args) {
        String originalString = "Hello World";
        String stringToInsert = "Beautiful ";
        int index = 6;

        String result = originalString.substring(0, index) + stringToInsert + originalString.substring(index);
        System.out.println("Resulting String: " + result);
    }
}
