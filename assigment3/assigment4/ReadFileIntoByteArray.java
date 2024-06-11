// 2. Write a Java program to read the contents of a file into a byte array.

public class ReadFileIntoByteArray {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] byteArray = new byte[(int) file.length()];
            fis.read(byteArray);
            fis.close();
            
            // Method 2: Using Files.readAllBytes
            // byte[] byteArray = Files.readAllBytes(file.toPath());
            
            System.out.println("File content read into byte array.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


