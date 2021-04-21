package calculator;

/**
 * Class "Main" which will contain the method to initialize the whole program.
 *
 * @author: Kbiters
 * @version: 18/04/2021
 * @see:
 */
public class Main {
    /**
     * Special method, it is the one that allows to execute the code
     * of a program, instantiating the "menu" class and calling its
     * "run" method to initialize the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.run();
    }
}
