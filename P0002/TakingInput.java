import java.util.Scanner;

/**
 * Java Program to take input from user.
 */
public class TakingInput {
    public static void main(String[] args) {
        char c;
        int v_int;
        ;
        float v_float;
        String str;

        // Initializing the Scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter a String:");
        str = scanner.nextLine();

        System.out.println("Enter a Character:");
        c = scanner.next().charAt(0);

        System.out.println("Enter an Integer:");
        v_int = scanner.nextInt();

        System.out.println("Enter a Float:");
        v_float = scanner.nextFloat();

        // Printing data entered by user
        System.out.println("\nYou Entered the Following Data:");
        System.out.format("Char: %c\n", c);
        System.out.format("Integer: %d\n", v_int);
        System.out.format("Float: %.2f\n", v_float);  // Formatted to 2 decimal places
        System.out.format("String: %s\n", str);

        // Closing the scanner
        scanner.close();
    }
}
