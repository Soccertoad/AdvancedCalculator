package Calculator.FunctionsUntil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataManagement {
    /**
     * Gets double value from user
     * @param input Scanner for user input
     * @return A double value inputed from the user
     */
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
 * Gets char input from user
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
public static int validIntegerInput(Scanner input){
    while(true){
        try {
            return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid data entry: Please enter a number");
            input.next();
        }
    }
}
public static void print(double[] printArray){
    for(int i=0; i<printArray.length; i++){
        System.out.println(printArray[i]);
    }
}
public static void printAnswers(double[] answers){
    System.out.println("A: " + answers[0]);
    System.out.println("B: " + answers[1]);
    System.out.println("C: " + answers[2]);
    if(answers.length>=4){
        System.out.println("Answer: " + answers[3]);
    }
}
}
