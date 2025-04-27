package FunctionsUntil;
import java.util.Scanner;

public class Geometry {
    public class GeometryMath{
        /**
         * Find the area of a triangle
         * @param base The base of the triangle
         * @param height The height of the triangle
         * @return The area of the triangle
         */
        public static double triangleArea(double base, double height){
            return (base * height)/2;
        }
        /**
         * Finds the value of the unknown side using Pythagorean Theorem
         * @param unknown The unknown triangle side
         * @param sides array of side lengths [a, b, c]
         * @return The unknown side length
         */
        public static double[] pythagoreanTheorem(char unknown, double[] sides){
            switch(unknown){
                case 'a' -> {
                    // Square Root of c squared - b squared
                    sides[0] = CustomMath.customSqrt(
                        CustomMath.pow(sides[2], 2) - CustomMath.pow(sides[1], 2)
                    );
                } 
                case 'b' -> {
                    // Square Root of c squared - a squared
                    sides[1] = CustomMath.customSqrt(
                        CustomMath.pow(sides[2], 2) - CustomMath.pow(sides[0], 2)
                    );
                }
                case 'c' -> {
                    // Square Root of a squared + b squared
                    sides[2] = CustomMath.customSqrt(
                        CustomMath.pow(sides[0], 2) + CustomMath.pow(sides[1], 2)
                    );
                }
                default -> System.out.println("Invalid Input");
            }
            return sides;
        }
    }
    /**
     * Finds the Area of a triangle
     * @param input Scanner to get user input
     * @return The Area of the triangle
     */
    public static double triangleArea(Scanner input){
        System.out.println("Triangle Area");
        double base, height;
        System.out.println("What is the length of the base?");
        base = DataManagement.validDoubleInput(input);
        System.out.println("What is the length of the height?");
        height = DataManagement.validDoubleInput(input);
        return GeometryMath.triangleArea(base, height);
    }
    /**
     * Uses Pythagorean Theorem to find the values of each side of a triangle
     * @param input The scanner for user input
     * @return An array containing each side length
     */
    public static double[] pythagoreanTheorem(Scanner input){
        System.out.println("Pythagorean Theorem: ");
        
        double[] sides = new double[3];
        char unknownSide;

        System.out.println("What Side is unknown? [a, b, or c]");
        while(true){
            try {
                unknownSide = DataManagement.validCharInput(input, "[a, b, or c]");
                if(unknownSide != 'a' && unknownSide != 'b' && unknownSide != 'c'){
                    throw new IllegalArgumentException("Invalid Data");
                }
                break;
            } catch (IllegalArgumentException e) {
                continue;
            }
        }
        
        switch(unknownSide){
            case 'a' -> {
                System.out.println("What is the b value?");
                sides[1] = input.nextDouble();
                System.out.println("What is the c value? (Longest Side/Hypothenuse)");
                sides[2] = input.nextDouble();
            }
            case 'b' ->{
                System.out.println("What is the a value?");
                sides[0] = input.nextDouble();
                System.out.println("What is the c value? (Longest Side/Hypothenuse)");
                sides[2] = input.nextDouble(); 

            }
            case 'c' -> {
                System.out.println("What is the a value?");
                sides[0] = input.nextDouble();
                System.out.println("What is the b value?");
                sides[1] = input.nextDouble();
            }
        }
        sides = GeometryMath.pythagoreanTheorem(unknownSide, sides);
        return sides;
    }
}