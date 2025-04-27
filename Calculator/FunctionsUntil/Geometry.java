package Calculator.FunctionsUntil;
import java.util.Scanner;
public class Geometry {
    public class GeometryMath{
        public static double triangleArea(double base, double height){
            return (base * height)/2;
        }
        public static double[] pythagoreanTheorem(char unknown, double[] sides){
            switch(unknown){
                case 'a' -> {
                    sides[0] = CustomMath.customSqrt(
                        CustomMath.pow(sides[2], 2) - CustomMath.pow(sides[1], 2)
                    );
                } 
                case 'b' -> {
                    sides[1] = CustomMath.customSqrt(
                        CustomMath.pow(sides[2], 2) - CustomMath.pow(sides[0], 2)
                    );
                }
                case 'c' -> {
                    sides[2] = CustomMath.customSqrt(
                        CustomMath.pow(sides[0], 2) + CustomMath.pow(sides[1], 2)
                    );
                }
                default -> System.out.println("Invalid Input");
            }
            return sides;
        }
    }
    public static double triangleArea(Scanner input){
        System.out.println("Triangle Area");
        double base, height;
        System.out.println("What is the length of the base?");
        base = DataManagement.validDoubleInput(input);
        System.out.println("What is the length of the height?");
        height = DataManagement.validDoubleInput(input);
        return GeometryMath.triangleArea(base, height);
    }
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