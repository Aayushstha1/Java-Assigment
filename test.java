import java.util.Random;
public class test {
    public static void main(String[] args) {
        Random random=new Random();
        System.out.println(random.nextInt(10));
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
        System.out.println(random.nextfloat());
        System.out.println(random.nextGaussian());
        byte[] bytes= new byte[10];
        random.nextBytes(bytes);
        System.out.println("[");
        for(int i=0; i,bytes.length;i++)
        {
            System.out.println("%d", bytes[i]);

        }
        System.out.println("]\n");
        System.out.println(random.nextLong());
        System.out.println(random.nextint());
        long seed=95;
        random.setSeed(seed);
    }
}
