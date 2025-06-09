import java.util.Scanner;

public class InputValidator {

    /**
     * Prompts the user for an integer input between lowerBound and upperBound.
     *
     * @param scanner       Scanner object to read user input.
     * @param lowerBound    Minimum acceptable value (inclusive).
     * @param upperBound    Maximum acceptable value (inclusive).
     * @param prompt        The prompt message to show the user.
     * @param errorMessage  The error message to show when input is invalid.
     * @return A valid integer value within the specified bounds.
     */
    public static int getValidatedInt(Scanner scanner, int lowerBound, int upperBound,
                                      String prompt, String errorMessage) {
        int value;
        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= lowerBound && value <= upperBound) {
                    return value;
                } else {
                    System.out.println(errorMessage);
                }
            } else {
                // Invalid input (not an integer)
                System.out.println(errorMessage);
                scanner.next(); // Clear invalid input
            }
        }
    }
}
