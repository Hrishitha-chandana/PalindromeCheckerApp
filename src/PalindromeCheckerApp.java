public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ==========================
        // UC1: Application Startup
        // ==========================

        // Welcome message
        System.out.println("Welcome to Palindrome Checker App!");
        System.out.println("-----------------------------------");

        // Application details
        System.out.println("Application Name : Palindrome Checker");
        System.out.println("Version          : 1.0");

        // Startup confirmation
        System.out.println("\nApplication started successfully.");
        System.out.println("Moving to next module...\n");


        // ==========================
        // UC2: Hardcoded Palindrome Check
        // ==========================

        String word = "madam";   // Hardcoded string
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if palindrome
        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        System.out.println("\nProgram execution completed.");
    }
}

