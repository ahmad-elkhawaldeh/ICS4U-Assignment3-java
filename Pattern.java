/*
* The pattern prgram
*
* @author  Ahmad El-khawaldeh
* @version 1.0
* @since   2020-01-01
*/

import java.util.Scanner;

/**.
 * Pattern
 */
public final class Pattern {
    /**
    * Function finds the index of a number, using Binary Search recursively.
    * @param number
    * @return printPattern
    */
    public static String printPattern(int number) {
         if (number < 1) {
             return "";
         } else {
            if (number >= 5) {
                return printPattern(number - 1) + " "
                    + number +printPattern(number - 1) + "\n" + " ";
            } else
               return printPattern(number - 1) + " "
                    + number + printPattern(number - 1);
         }
    }
    
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        final Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number between 1 to 15");
        final int number  = sc.nextInt();
        if (number < 1 || number > 15) {
            System.out.println("Error: Worng input");
        } else {
            System.out.println("User input | Program output");
            System.out.println( number + "  | " + printPattern(number));
            
            System.out.println("\n");
        }
    }
}
