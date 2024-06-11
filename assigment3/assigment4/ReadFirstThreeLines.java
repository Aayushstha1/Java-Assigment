// 4. Write a Java program to read the first 3 lines of a file.

public class ReadFirstThreeLines {
    public static void main(String[] args) {
        String filePath = "example.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int count = 0;
            while ((line = br.readLine()) != null && count < 3) {
                System.out.println(line);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
