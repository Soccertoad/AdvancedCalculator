package FunctionsUntil;
import java.util.Scanner;

import FunctionsUntil.customMath;

public class geometry {

public class triangle{

    public static double triangleArea(double length, double width){
        return (length * width)/2;
    }
    /**
     * Uses Pythagorean Theorem to find the values of each side of a triangle
     * @param values Value of each side mapped to an index in assending order
     * @param missingValue The side the user want to find
     * @return The list containing the values of each sides value
     */
    public static double[] pythagoreanTheorem(Scanner input){
        System.out.println("Pythagorean Theorem: ");
        
        double[] values = new double[3];
        String unknownSide;
        double a, b, c;

        System.out.println("What Side is unknown? [a, b, or c]");
        unknownSide = input.nextLine();
        
        a = values[0];
        b = values[1];
        c = values[2];
        switch(unknownSide){
            case "a":
                System.out.println("What is the b value?");
                b = input.nextDouble();
                System.out.println("What is the c value? (Longest Side/Hypothenuse)");
                c = input.nextDouble();
                //c squared - b squared
                a = customMath.pow(c, 2)- customMath.pow(b, 2);
                //square root of a
                a = customMath.customSqrt(a);
            break;
            case "b":
                System.out.println("What is the a value?");
                a = input.nextDouble();
                System.out.println("What is the c value? (Longest Side/Hypothenuse)");
                c = input.nextDouble(); 
                //c squared - a squared
                b = customMath.pow(c, 2)- customMath.pow(a, 2);
                //square root of b
                b = customMath.customSqrt(b);
            break;
            case "c":
                System.out.println("What is the a value?");
                a = input.nextDouble();
                System.out.println("What is the b value?");
                b = input.nextDouble();
                //a squared + b squared
                c = customMath.pow(a, 2) + customMath.pow(b, 2);
                //square root of c
                c = customMath.customSqrt(c);
            break;
        }

        values[0] = a;
        values[1] = b;
        values[2] = c;

        return values;
    }
}

}
