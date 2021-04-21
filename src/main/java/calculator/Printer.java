package calculator;

/**
 * This class is used to print messages, variables, results, etc. Just call the
 * function and pass the parameters with ",". For example:
 * "Printer.print("Kbiters consists of ", 3, " people" );" <-- It will show:
 * "Kbiters consists of 3 people".
 *
 * @author: Kbiters
 * @version: 14/04/2021
 * @see:
 **/

public class Printer {

    /**
     * Function to print an argument or several arguments
     *
     * @param args The args parameter defines the number
     *             of elements that the series will have.
     */
    public static void print(Object... args) {

        for (Object arg : args) {
            System.out.print(arg + " ");
        }
    }
}
