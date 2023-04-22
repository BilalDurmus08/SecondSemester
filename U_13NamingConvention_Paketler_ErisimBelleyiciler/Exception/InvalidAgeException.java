package U_13NamingConvention_Paketler_ErisimBelleyiciler.Exception;

import java.io.PrintStream;

public class InvalidAgeException extends ArithmeticException {
    public InvalidAgeException (String message){
        super(message);
    }

    @Override
    public void printStackTrace(PrintStream s) {
        System.out.println("This is a Invalid Age U_13NamingConvention_Paketler_ErisimBelleyiciler.Exception");
    }

}
