public class assignment {
    public class Main {
        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 20;
            int num3 = 15;
    
            int max = findMax(num1, num2, num3);
            j
            System.out.println("The maximum number is: " + max);
        }
    
        public static int findMax(int a, int b, int c) {
            int max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            return max;
        }
    }
    
    
}
