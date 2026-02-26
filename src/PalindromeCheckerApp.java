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
            reversedHardcoded += hardcoded.charAt(i);
        }

        if (hardcoded.equals(reversedHardcoded)) {
            System.out.println("UC2 Result: " + hardcoded + " is a palindrome.");
        } else {
            System.out.println("UC2 Result: " + hardcoded + " is not a palindrome.");
        }


        // ==========================
        // UC3: Reverse String Method
        // ==========================
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a word for UC3 check: ");
        String input = sc.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println("UC3 Result: " + input + " is a palindrome.");
        } else {
            System.out.println("UC3 Result: " + input + " is not a palindrome.");
        }


        // ==========================
        // UC4: Character Array + Two Pointer
        // ==========================
        System.out.print("\nEnter a word for UC4 check: ");
        String word = sc.nextLine();

        char[] arr = word.toCharArray();

        int left = 0;
        int right = arr.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("UC4 Result: " + word + " is a palindrome.");
        } else {
            System.out.println("UC4 Result: " + word + " is not a palindrome.");
        }

        sc.close();

        System.out.println("\nProgram execution completed.");
    }
}

