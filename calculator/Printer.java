package calculator;

public class Printer {

    public static void print(Object... args) {

        if (args.length == 2) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
            }
        } else {
            System.out.println(args[0]);
        }

    }
}
