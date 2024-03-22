public class DataTypes {
    public static void main(String[] args) {
        // Primitive data types
        boolean flag = true; // boolean: true or false
        char letter = 'A'; // char: single 16-bit Unicode character

        // Numeric Primitive data types
        // Integer
        byte b = 100; // byte: 8-bit signed integer
        short s = 10000; // short: 16-bit signed integer
        int i = 100000; // int: 32-bit signed integer
        long l = 100000L; // long: 64-bit signed integer

        // Floating point
        float f = 234.5f; // float: 32-bit floating point
        double d = 123.4; // double: 64-bit floating point

        // Non-primitive data types
        String text = "Hello World"; // String: a sequence of characters
        int[] array = {1, 2, 3, 4, 5}; // array: a collection of elements of the same type

        // Output examples
        System.out.println("Boolean value: " + flag);
        System.out.println("Character value: " + letter);
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Integer value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("String value: " + text);
        System.out.print("Array values: ");
        
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}