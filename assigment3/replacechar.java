public class replacechar {
        public static void main(String[] args) {
            String originalString = "Hello World";
            int index = 6;
            char newChar = 'J';
    
            String result = originalString.substring(0, index) + newChar + originalString.substring(index + 1);
            System.out.println("Resulting String: " + result);
        }
    }
    

