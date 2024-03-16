/*
    WAP to print the given star pattern
              *
             * *
            * * *
           * * * *
          * * * * *
         * * * * * *

   Here, for odd rows: star is printed at even position and space at odd position
        for even rows: star is printed at odd position and space at even position
*/

public class patteran2 {
    public static void main(String[] args)
    {
        final int ROWS=6;
        int i, j, k;
        // Loop through each row
        for(i=1; i<=ROWS; i++)
        {
            // Print spaces before the stars
            for(j=1; j<=ROWS-i; j++)
            {
                System.out.print(" ");
            }

            // For even rows, print alternating stars and spaces
            if(i%2==0)
            {
                for(k=1; k<=2*i-1; k++)
                {
                    // print star at odd position and space at even position
                    if(j%2!=0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                    j++;
                }
            }

            // For odd rows, print alternating stars and spaces
            else
            {
                for(k=1; k<=2*i-1; k++)
                {
                    // print star at even position and space odd even position
                    if(j%2==0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                    j++;
                }
            }
            // Move to the next line after printing the row
            System.out.println(" ");
        }

    }
}