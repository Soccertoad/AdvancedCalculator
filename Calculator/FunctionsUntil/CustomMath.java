package Calculator.FunctionsUntil;
public class CustomMath {
    public static double addition(double... addends){
        double sum = 0;
        for (double i : addends){
            sum += i;
        }
        return sum;
    }
    public static double subtraction(double difference, double... subtrahends){
        for (double i : subtrahends){
            difference -= i;
        }
        return difference;
    }
    public static double multiplication(double... factors){
        double product = 1;
        for (double i : factors){
            product*=i;
        }
        return product;
    }
    public static double division(double quotient, double... divisors){
        for (double i : divisors){
                if (i==0){
                    System.out.println("Skipped Value: Divide by 0 error");
                    continue;
                }
                quotient /= i;
        }
        return quotient;
    }
    public static long factorial(int base){
        if(base<0){
            throw new IllegalArgumentException("Not defined for negative factorial");
        } 
        if (base == 0 || base == 1){
            return 1;
        }
        return base * factorial(base - 1);
    }
    public static double pow(double base, double exponent){
        double poweredNum = 1;
        if(exponent==0) {
            return 1;
        } 
        for (int i = 0; i < absoluteValue(exponent); i++){
            poweredNum *= base;
        }
        if(exponent<0){
            poweredNum = 1 / poweredNum;
        }
        return poweredNum;
    }
    public static double absoluteValue(double initNum){
        if (initNum<0) {
            return -initNum;
        } else {
            return initNum;
        }
    }
    public static long roundWholeNum(double value) {
        if (value >= 0) {
            return (long)(value + 0.5);
        }else{
            return (long)(value - 0.5);
        }
    }
    public static double customSqrt(double radicand, double tolerance) {
        if (radicand < 0) {
            throw new IllegalArgumentException("Cannot compute square root of negative number");
        }
        if (radicand == 0 || radicand == 1) {
            return radicand;
        }
        double guess = radicand;
        while (absoluteValue(guess * guess - radicand) > tolerance) {
            guess = (guess + radicand / guess) / 2.0;
        }
        long nearestWhole = roundWholeNum(guess);
        if (absoluteValue(nearestWhole * nearestWhole - radicand) <= tolerance) {
            return nearestWhole;  // Perfect square root
        }
        long scaledGuess = (long)(guess * 1e10);
        return scaledGuess / 1e10;
        }
    public static double customSqrt(double radicand){
        double tolerance = 1e-12;
        return customSqrt(radicand, tolerance);
    }
}