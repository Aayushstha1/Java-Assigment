public class Test2 {
    public static void main(String[] args) {
        Integer i = 2;
        Double d = 3.5;
        System.out.println(i.intValue());  // Corrected from system.out.println
        System.out.println(d.doubleValue());  // Corrected from system.out.println

        String ageStr = "16";  // Corrected from string
        System.out.println("Age " + ageStr + " in 10 years is " + (Integer.parseInt(ageStr) + 10));  // Corrected from integer.parselnt
        
        System.out.println("Note that + with strings does concatenation, not addition: " + (ageStr + 10));
    }
}
