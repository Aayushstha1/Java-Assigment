public class remove {
        public static void main(String[] args) {
            String originalString = "000012345";
            String result = originalString.replaceFirst("^0+(?!$)", "");
            System.out.println("String without leading zeros: " + result);
        }
    }
    

