public class mathOperations {

    public static void main(String[] args) {
        // Addition
        int sum = 5 + 3;
        System.out.println("Addition: 5 + 3 = " + sum);

        // Subtraction
        int difference = 10 - 4;
        System.out.println("Subtraction: 10 - 4 = " + difference);

        // Multiplication
        int product = 6 * 7;
        System.out.println("Multiplication: 6 * 7 = " + product);

        // Division
        double quotient = 15.0 / 3;
        System.out.println("Division: 15.0 / 3 = " + quotient);

        // Modulo (Remainder)
        int remainder = 17 % 5;
        System.out.println("Remainder (Modulo): 17 % 5 = " + remainder);

        // Increment and Decrement
        int count = 0;
        count++; // Increment count by 1
        System.out.println("Increment: count = " + count);

        int value = 10;
        value--; // Decrement value by 1
        System.out.println("Decrement: value = " + value);

        // Exponentiation (Power)
        double base = 2.0;
        int exponent = 3;
        double result = Math.pow(base, exponent);
        System.out.println("Exponentiation: 2.0 ^ 3 = " + result);

        // Square Root
        double number = 25.0;
        double sqrt = Math.sqrt(number);
        System.out.println("Square Root of 25.0 = " + sqrt);

        // Absolute Value
        int negativeValue = -7;
        int absValue = Math.abs(negativeValue);
        System.out.println("Absolute Value of -7 = " + absValue);

        // Trigonometric Functions (Sine, Cosine, Tangent)
        double angleInDegrees = 30.0;
        double angleInRadians = Math.toRadians(angleInDegrees);
        double sinValue = Math.sin(angleInRadians);
        double cosValue = Math.cos(angleInRadians);
        double tanValue = Math.tan(angleInRadians);
        System.out.println("Sin(30°) = " + sinValue);
        System.out.println("Cos(30°) = " + cosValue);
        System.out.println("Tan(30°) = " + tanValue);

        // Random Numbers
        double randomValue = Math.random();
        System.out.println("Random Value between 0 and 1: " + randomValue);

        // Constants
        double pi = Math.PI;
        double e = Math.E;
        System.out.println("Value of π (Pi) = " + pi);
        System.out.println("Value of e (Euler's Number) = " + e);
    }
}