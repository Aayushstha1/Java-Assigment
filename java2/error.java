public class error {
    public static void main(string[]args){
        try {
        int[] myNumber={1,2,3};
        System.out.println(myNumber[10]);
    }
    catch(Exception e){
        System.out.println("Something went wrong.");
    }
}
}