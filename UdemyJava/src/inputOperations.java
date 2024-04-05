import java.util.Scanner;

public class inputOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Example 1: Read a word
        System.out.print("Enter a word: ");
        String word = input.next();
        System.out.println("You entered: " + word);

        // Example 2: Read an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered: " + number);

        // Example 3: Read a double value
        System.out.print("Enter a double value: ");
        double value = input.nextDouble();
        System.out.println("You entered: " + value);

        // Example 4: Read a single character
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        System.out.println("You entered: " + ch);

        // Example 5: Read an entire line
        input.nextLine(); // Clean the buffer
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.println("You entered: " + sentence);

        input.close();
    }
}