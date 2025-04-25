package FunctionsUntil;

public class customMath {
    /**
     * Finds the value of a number to the power of another number
     * @param num Inital Number
     * @param exponent The power of the number
     * @return Value of the inital number to the power of inputed number
     */
    public static double pow(double num, double exponent){
        double poweredNum = num;

        for (int i = 1; i < abVal(exponent); i++){
            poweredNum *= num;
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
     * @param squareNum the squared inputed number
     * @param tolerance accuraccy of number
     * @return square root of inputed number
     */
    public static double customSqrt(double squareNum, double tolerance) {
        // Checks if number is negative
        if (squareNum < 0) {
            throw new IllegalArgumentException("Cannot compute square root of negative number");
        }
        if (squareNum == 0 || squareNum == 1) {
            return squareNum;
        }

        double guess = squareNum;
        while (abVal(guess * guess - squareNum) > tolerance) {
            guess = (guess + squareNum / guess) / 2.0;
        }

        long nearestWhole = roundWholeNum(guess);
        if (abVal(nearestWhole * nearestWhole - squareNum) <= tolerance) {
            return nearestWhole;  // Perfect square root
        }

        // Manually trim to 10 decimal places (custom tolerance rounding)
        long scaledGuess = (long)(guess * 1e10);
        return scaledGuess / 1e10;
        }
    
    public static double customSqrt(double squareNum){
        double tolerance = 1e-12;
        // Checks if number is negative
        if (squareNum < 0) {
            throw new IllegalArgumentException("Cannot compute square root of negative number");
        }
        if (squareNum == 0 || squareNum == 1) {
            return squareNum;
        }
        double guess = squareNum;
        while (abVal(guess * guess - squareNum) > tolerance) {
            guess = (guess + squareNum / guess) / 2.0;
        }
        long nearestWhole = roundWholeNum(guess);
        if (abVal(nearestWhole * nearestWhole - squareNum) <= tolerance) {
            return nearestWhole;  // Perfect square root
        }

        // Manually trim to 10 decimal places (custom tolerance rounding)
        long scaledGuess = (long)(guess * 1e10);
        return scaledGuess / 1e10;
    }
}
