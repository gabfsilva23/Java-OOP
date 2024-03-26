public class Casting {
    public static void main(String[] args) {
    	
        // Widening casting
        int myInt = 100;
        double myDouble = myInt; // No explicit cast needed
        System.out.println("Int value: " + myInt);
        System.out.println("Converted to double: " + myDouble);

        // Narrowing casting
        double anotherDouble = 9.99;
        int anotherInt = (int) anotherDouble; // Explicit cast needed
        System.out.println("Double value: " + anotherDouble);
        System.out.println("Converted to int: " + anotherInt);
        
        /*
         * To round a floating-point number to the nearest whole number in Java, you can use the Math.round() method.
         *  This method rounds a floating-point
         *  value to the nearest integer using normal rounding rules (half up):
         *  
        float number = 9.99f;
		int rounded = Math.round(number);
		System.out.println("Rounded: " + rounded); // Output will be 10
		
		
		If you want to ensure that any number greater than 9.5 is rounded up to 10, you can use the Math.ceil()
		method, which always rounds a number up to the nearest whole number:
		
		double number = 9.99;
		int roundedUp = (int) Math.ceil(number);
		System.out.println("Rounded up: " + roundedUp); // Output will be 10
         */
    }
}