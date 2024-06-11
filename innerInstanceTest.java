class myClass {
    public int myNumber = 10;
    public int getMyNumber(){
        return myNumber;

    }
    
}
/**
 * InnerInstanceTest
 */
public class innerInstanceTest {
    public static void main(String[] args) {
        myClass mc = new myClass();
        System.out.println("The value of myClass is "+mc.myNumber);
        System.out.println("The value returned by the method is "+mc.myNumber);
    }

    
}
