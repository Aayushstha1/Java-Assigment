public class MultiCatchBlock1 {
    public static void main (string[]args){
        try{
            int a[]=new int[5];
            a[5]=30/0;

        }
        catch(ArthemeticException e)
        {
            System.out.println("Arthemetic Expression occurs");

        }
       catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBounds Exception occurs");
       }
       catch(Exception e)
       {
        System.out.println("parent Exception Occurs");
       }
       System.out.println("reset the code");
    }
}
    

