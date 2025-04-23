package FunctionsUntil;
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
    public static double[] pythagoreanTheorem(double[] values, String missingValue){
        double a, b, c;
        a = values[0];
        b = values[1];
        c = values[2];
        switch(missingValue){
            case "a":
                //c squared - b squared
                a = customMath.pow(c, 2)- customMath.pow(b, 2);
                //square root of a
                a = customMath.customSqrt(a);
            break;
            case "b":
                //c squared - a squared
                b = customMath.pow(c, 2)- customMath.pow(a, 2);
                //square root of b
                b = customMath.customSqrt(b);
            break;
            case "c":
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
