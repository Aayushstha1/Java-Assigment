
import java.util.Scanner;

public class factorial {
    //WAP to find the factorial of a user entered number

    public static void main(String []args)
    {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number to get the factorial of: ");
        int num = number.nextInt();
        int copyNum=num;
        int fact=1;
        while(num>0)
        {
            fact=fact*num;
            num--;
        }
        System.out.print("Factorial of " +copyNum+ " is " +fact);
    }
}

