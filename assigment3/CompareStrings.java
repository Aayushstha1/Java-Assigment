    public class CompareStrings {
        public static void main(String[] args) {
            String string1 = "Hello World";
            String string2 = "hello world";
    
            int comparisonResult = string1.compareTo(string2);
            
            if (comparisonResult == 0) {
                System.out.println("The strings are equal.");
            } else if (comparisonResult > 0) {
                System.out.println("The first string is greater than the second string.");
            } else {
                System.out.println("The first string is less than the second string.");
            }
    
            comparisonResult = string1.compareToIgnoreCase(string2);
            if (comparisonResult == 0) {
                System.out.println("The strings are equal (case-insensitive).");
            } else if (comparisonResult > 0) {
                System.out.println("The first string is greater than the second string (case-insensitive).");
            } else {
                System.out.println("The first string is less than the second string (case-insensitive).");
            }
        }
    }
    

