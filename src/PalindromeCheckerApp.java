import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ==========================
        // UC1: Application Startup
        // ==========================
        System.out.println("Welcome to Palindrome Checker App!");
        System.out.println("-----------------------------------");

        System.out.println("Application Name : Palindrome Checker");
        System.out.println("Version          : 1.0");

        System.out.println("\nApplication started successfully.");
        System.out.println("Moving to next module...\n");


        // ==========================
        // UC2: Hardcoded Palindrome
        // ==========================
        String hardcoded = "madam";
        String reversedHardcoded = "";

        for (int i = hardcoded.length() - 1; i >= 0; i--) {
            reversedHardcoded = reversedHardcoded + hardcoded.charAt(i);
        }

        if (hardcoded.equals(reversedHardcoded)) {
            System.out.println("UC2 Result: " + hardcoded + " is a palindrome.");
        } else {
            System.out.println("UC2 Result: " + hardcoded + " is not a palindrome.");
        }


        // ==========================
        // UC3: User Input Palindrome
        // ==========================
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a word to check palindrome: ");
        String input = sc.nextLine();

        String reversedInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedInput = reversedInput + input.charAt(i);
        }

        if (input.equals(reversedInput)) {
            System.out.println("UC3 Result: " + input + " is a palindrome.");
        } else {
            System.out.println("UC3 Result: " + input + " is not a palindrome.");
        }

        sc.close();

        System.out.println("\nProgram execution completed.");
    }
}

