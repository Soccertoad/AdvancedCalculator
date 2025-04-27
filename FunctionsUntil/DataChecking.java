package FunctionsUntil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataChecking {
    public static double validDoubleInput(Scanner input){
    while(true){
        try {
            return input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid data entry: Please enter a number");
            input.next();
        }
    }
}
/**
 * 
 * @param input Scanner for user input
 * @param validDataOptions Finish "Please enter " provide the wanted data
 * @return A char value inputed from the user
 */
public static char validCharInput(Scanner input, String validDataOptions){
    while(true){
        try {
            return input.next().toLowerCase().strip().charAt(0);
        } catch (InputMismatchException e) {
            System.out.println("Invalid data entry: Please enter " + validDataOptions);
            input.next();
        }
    }
}
}
