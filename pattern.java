public class pattern {
    /*
WAP to display the following pattern
    1
   212
  32123
 4321234
543212345

 */

    public static void main(String[] args) {
        int rows=5;     // Number of rows in the pattern
        int i, j;

        // Loop for iterating through each row
        for(i=1; i<=rows; i++)
        {
            for(j=i; j<=rows-1; j++)
            {
                System.out.print(" ");      // Loop for printing spaces before the numbers
            }

            for(j=i; j>=1; j--)     //Loop for printing decreasing numbers
            {
                System.out.print(j );       // Print the current number
            }

            for(j=2; j<=i; j++)     // Loop for printing increasing numbers except for the first row
                System.out.print( j );

            System.out.println("");     // Move to the next line
        }
    }
}

