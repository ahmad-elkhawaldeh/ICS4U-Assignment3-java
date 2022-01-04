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
public class Pattern {
     /**
     * Constant.
     */
    static final int One = 1;
    /**
     * Constant.
     */
    static final int Five = 5;
    /**
     * Constant.
     */
    static final int Fifteen = 15;
    
    /**
    * Function finds the index of a number, using Binary Search recursively.
    * @param number
    * @return printPattern
    */
    public static final String printPattern(final int number) {
         if (number < One) {
             return "";
         } else {
            if (number >= Five) {
                return printPattern(number - One) + " "
                    + number + printPattern(number - 1) + "\n" + " ";
            } else {
               return printPattern(number - One) + " "
                    + number + printPattern(number - One);
            }
         }
    }
    
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number between 1 to 15");
        final int number  = sc.nextInt();
        if (number < One || number > Fifteen) {
            System.out.println("Error: Worng input");
        } else {
            System.out.println("User input | Program output");
            System.out.println( number + "  | " + printPattern(number));
            
            System.out.println("\n");
        }
    }
}
