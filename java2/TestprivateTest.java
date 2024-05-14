 class TestPrivateTest {
    private int myNumber=10;
    public int getmyNumber(){
        return myNumber;
    }
    
}
class subPrivateTest extends PrivateTest {
    public void printSomething(){
        System.out.println("The value of myNumber is "+ this.myNumber);
        System.out.println("The value return by the method is "+ this.getmyNumber());
    }
}
class TestPrivateTest{
    public static void main(String[] args) {
        subPrivateTest spt = new SubPrivateTest();
        spt.printSomething();

    }
}
