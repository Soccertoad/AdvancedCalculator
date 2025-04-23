package FunctionsUntil;

public class customMath {
    /**
     * Finds the value of a number to the power of another number
     * @param num Inital Number
     * @param powerOf The power of the number
     * @return Value of the inital number to the power of inputed number
     */
    public static double pow(double num, double powerOf){
        double poweredNum = num;

        for (int i = 0; i <= abVal(powerOf); i++){
            poweredNum *= num;
        }
        if(powerOf < 0) return 1/poweredNum;
        return poweredNum;
    }

    /**
     * Finds the absolute value of the given number:
     * @param initNum Intial Number
     * @return Absolute number of inputed value
     */
    public static double abVal(double initNum){
        //If the number is negative inverse the number
        if (initNum<0) return initNum*-1;
        //returns same value otherwise
        else return initNum;
    }

    //  Used AI for assitance in the creation of the custom square root function
    /**
     * 
     * @param squareNum the squared inputed number
     * @param precision accuraccy of number
     * @return square root of inputed number
     */
    public static double customSqrt(double squareNum, double precision) {
        // Checks if number is negative
        if (squareNum < 0) {
            throw new IllegalArgumentException("Cannot compute square root of negative number");
        }
        if (squareNum == 0 || squareNum == 1) {
            return squareNum;
        }
        double rootedNum = squareNum;
        while (abVal(rootedNum * rootedNum - squareNum) > precision) {
            rootedNum = (rootedNum + squareNum / rootedNum) / 2.0;
        }
        return rootedNum;
    }
    public static double customSqrt(double squareNum){
        double precision = 1e-10;
        // Checks if number is negative
        if (squareNum < 0) {
            throw new IllegalArgumentException("Cannot compute square root of negative number");
        }
        if (squareNum == 0 || squareNum == 1) {
            return squareNum;
        }
        double rootedNum = squareNum;
        while (abVal(rootedNum * rootedNum - squareNum) > precision) {
            rootedNum = (rootedNum + squareNum / rootedNum) / 2.0;
        }
        return rootedNum;
    }
}
