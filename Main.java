import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = InputValidator.getValidatedInt(
                scanner,
                0,         
                100,  
                "Please enter a value between 0 and 100:",
                "Your value is invalid"
        );

        System.out.println("\nThe value chosen by the user is " + result);
        scanner.close();
    }
}
