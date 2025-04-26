package FunctionsUntil;

public class customMath {
    /**
     * Adds the addends
     * @param addends The numbers being added
     * @return The sum of the numbers
     */
    public static double addition(double... addends){
        double sum = 0;
        for (double i : addends){
            sum += i;
        }
        return sum;
    }
    /**
     * Subtracts the subtrahends (second and folllowing numbers) from the minuend (Starting number)
     * @param difference The number being subtracted from
     * @param subtrahends The numbers subracting
     * @return The difference of the numbers
     */
    public static double subtraction(double difference, double... subtrahends){
        for (double i : subtrahends){
            difference -= i;
        }
        return difference;
    }
    /**
     * Multiplies the factors
     * @param factors The numbers being multiplied
     * @return The product of the numbers
     */
    public static double multiplication(double... factors){
        double product = 1;
        for (double i : factors){
            product*=i;
        }
        return product;
    }
    /**
     * Divides the divisors (second and following numbers) from the quotent
     * @param quotient
     * @param divisors
     * @return
     */
    public static double division(double quotient, double... divisors){
        for (double i : divisors){
            try{
                if (i==0){
                    throw new ArithmeticException("/ by 0");
                }
                quotient /= i;
            } catch (ArithmeticException e){
                System.out.println("Skipped Value: Divide by 0 error");
            }
        }
        return quotient;
    }
    /**
     * Finds the value of a number to the given power
     * @param base The number being multiplied
     * @param exponent The power of the number/number of times the number is multiplied by it's self
     * @return The value of the base to the exponent power
     */
    public static double pow(double base, double exponent){
        double poweredNum = base;
        for (int i = 1; i < abVal(exponent); i++){
            poweredNum *= base;
        }
        if(exponent < 0){ 
            return 1/poweredNum;
        } else {
        return poweredNum;
        }
    }
    /**
     * Finds the absolute value of the given number:
     * @param initNum Intial Number
     * @return Absolute number of inputed value
     */
    public static double abVal(double initNum){
        //If the number is negative inverse the number
        if (initNum<0){
            return -initNum;
        }
        //returns same value otherwise
        else{ 
            return initNum;
        }
    }

    //  Used AI for assitance in the creation of the custom square root and rounding functions

    // Custom rounding function (nearest whole number)
    public static long roundWholeNum(double value) {
        if (value >= 0) {
            return (long)(value + 0.5);
        } else {
            return (long)(value - 0.5);
        }
    }
    /**
     * @param radicand The number being rooted
     * @param tolerance accuraccy of number
     * @return square root of inputed number
     */
    public static double customSqrt(double radicand, double tolerance) {
        // Checks if number is negative
        if (radicand < 0) {
            throw new IllegalArgumentException("Cannot compute square root of negative number");
        }
        if (radicand == 0 || radicand == 1) {
            return radicand;
        }

        double guess = radicand;
        while (abVal(guess * guess - radicand) > tolerance) {
            guess = (guess + radicand / guess) / 2.0;
        }

        long nearestWhole = roundWholeNum(guess);
        if (abVal(nearestWhole * nearestWhole - radicand) <= tolerance) {
            return nearestWhole;  // Perfect square root
        }

        // Manually trim to 10 decimal places (custom tolerance rounding)
        long scaledGuess = (long)(guess * 1e10);
        return scaledGuess / 1e10;
        }
    
    public static double customSqrt(double radicand){
        double tolerance = 1e-12;
        // Checks if number is negative
        if (radicand < 0) {
            throw new IllegalArgumentException("Cannot compute square root of negative number");
        }
        if (radicand == 0 || radicand == 1) {
            return radicand;
        }
        double guess = radicand;
        while (abVal(guess * guess - radicand) > tolerance) {
            guess = (guess + radicand / guess) / 2.0;
        }
        long nearestWhole = roundWholeNum(guess);
        if (abVal(nearestWhole * nearestWhole - radicand) <= tolerance) {
            return nearestWhole;  // Perfect square root
        }

        // Manually trim to 10 decimal places (custom tolerance rounding)
        long scaledGuess = (long)(guess * 1e10);
        return scaledGuess / 1e10;
    }
}
