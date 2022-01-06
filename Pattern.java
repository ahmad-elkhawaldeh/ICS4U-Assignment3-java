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
    * Constant.
    */
    static final int ONE = 1;
    /**
    * Constant.
    */
    static final int FIVE = 5;
    /**
    * Constant.
    */
    static final int FIFTEEN = 15;

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Pattern() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Function finds the index of a number, using Binary Search recursively.
    * @param number
    * @return printPattern
    */
    public static String printPattern(final int number) {
         if (number < ONE) {
             return "";
         } else {
            if (number >= FIVE) {
                return printPattern(number - ONE) + " "
                    + number + printPattern(number - ONE) + "\n" + " ";
            } else {
               return printPattern(number - ONE) + " "
                    + number + printPattern(number - ONE);
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
        if (number < ONE || number > FIFTEEN) {
            System.out.println("Error: Worng input");
        } else {
            System.out.println("User input | Program output");
            System.out.println(number + "  | "
                               + printPattern(number));
            System.out.println("\n");
        }
    }
}
