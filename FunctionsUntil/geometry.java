package FunctionsUntil;
import java.util.Scanner;

import FunctionsUntil.CustomMath;

public class Geometry {

public class Triangle{

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
                a = CustomMath.pow(c, 2)- CustomMath.pow(b, 2);
                //square root of a
                a = CustomMath.customSqrt(a);
            break;
            case "b":
                System.out.println("What is the a value?");
                a = input.nextDouble();
                System.out.println("What is the c value? (Longest Side/Hypothenuse)");
                c = input.nextDouble(); 
                //c squared - a squared
                b = CustomMath.pow(c, 2)- CustomMath.pow(a, 2);
                //square root of b
                b = CustomMath.customSqrt(b);
            break;
            case "c":
                System.out.println("What is the a value?");
                a = input.nextDouble();
                System.out.println("What is the b value?");
                b = input.nextDouble();
                //a squared + b squared
                c = CustomMath.pow(a, 2) + CustomMath.pow(b, 2);
                //square root of c
                c = CustomMath.customSqrt(c);
            break;
        }

        values[0] = a;
        values[1] = b;
        values[2] = c;

        return values;
    }
}

}
