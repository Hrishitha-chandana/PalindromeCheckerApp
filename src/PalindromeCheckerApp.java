import java.util.Scanner;
import java.util.Stack;

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

        System.out.print("\nEnter word for UC3 check: ");
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
        // UC4: Character Array Method
        // ==========================
        System.out.print("\nEnter word for UC4 check: ");
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


        // ==========================
        // UC5: Stack-Based Method
        // ==========================
        System.out.print("\nEnter word for UC5 check: ");
        String stackInput = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push characters
        for (char c : stackInput.toCharArray()) {
            stack.push(c);
        }

        String reversedStack = "";

        // Pop characters
        while (!stack.isEmpty()) {
            reversedStack += stack.pop();
        }

        if (stackInput.equals(reversedStack)) {
            System.out.println("UC5 Result: " + stackInput + " is a palindrome.");
        } else {
            System.out.println("UC5 Result: " + stackInput + " is not a palindrome.");
        }

        sc.close();

        System.out.println("\nUC7: Deque-Based Optimized Palindrome Checker");
        System.out.println("------------------------------------------------");

        String dequeInput = "refer";

// Create Deque
        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

// Insert characters into deque
        for (char c : dequeInput.toCharArray()) {
            deque.addLast(c);
        }

// Assume palindrome initially
        boolean isDequePalindrome = true;

// Compare front and rear elements
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isDequePalindrome = false;
                break;
            }
        }

// Display result
        System.out.println("Input : " + dequeInput);
        System.out.println("Is Palindrome? : " + isDequePalindrome);
        System.out.println("\nUC8: Linked List Based Palindrome Checker");
        System.out.println("------------------------------------------------");

        String llInput = "madam";

        java.util.LinkedList<Character> list = new java.util.LinkedList<>();

// Convert string to LinkedList
        for (char c : llInput.toCharArray()) {
            list.add(c);
        }

        boolean isLLPalindrome = true;

// Compare from both ends
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isLLPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + llInput);
        System.out.println("Is Palindrome? : " + isLLPalindrome);
        System.out.println("\nProgram execution completed.");
    }
}

