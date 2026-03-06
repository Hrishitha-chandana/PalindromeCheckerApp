import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    // ==========================
    // UC9: Recursive Method
    // ==========================
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

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


        Scanner sc = new Scanner(System.in);


        // ==========================
        // UC3: Reverse String Method
        // ==========================
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

        for (char c : stackInput.toCharArray()) {
            stack.push(c);
        }

        String reversedStack = "";

        while (!stack.isEmpty()) {
            reversedStack += stack.pop();
        }

        if (stackInput.equals(reversedStack)) {
            System.out.println("UC5 Result: " + stackInput + " is a palindrome.");
        } else {
            System.out.println("UC5 Result: " + stackInput + " is not a palindrome.");
        }


        // ==========================
        // UC7: Deque Method
        // ==========================
        System.out.println("\nUC7: Deque-Based Optimized Palindrome Checker");
        System.out.println("------------------------------------------------");

        String dequeInput = "refer";

        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        for (char c : dequeInput.toCharArray()) {
            deque.addLast(c);
        }

        boolean isDequePalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isDequePalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + dequeInput);
        System.out.println("Is Palindrome? : " + isDequePalindrome);


        // ==========================
        // UC8: LinkedList Method
        // ==========================
        System.out.println("\nUC8: Linked List Based Palindrome Checker");
        System.out.println("------------------------------------------------");

        String llInput = "madam";

        java.util.LinkedList<Character> list = new java.util.LinkedList<>();

        for (char c : llInput.toCharArray()) {
            list.add(c);
        }

        boolean isLLPalindrome = true;

        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isLLPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + llInput);
        System.out.println("Is Palindrome? : " + isLLPalindrome);


        // ==========================
        // UC9: Recursive Method
        // ==========================
        System.out.println("\nUC9: Recursive Palindrome Checker");
        System.out.println("----------------------------------");

        System.out.print("Enter word for UC9 check: ");
        String recInput = sc.nextLine();

        boolean result = isPalindromeRecursive(recInput, 0, recInput.length() - 1);

        if (result) {
            System.out.println("UC9 Result: " + recInput + " is a palindrome.");
        } else {
            System.out.println("UC9 Result: " + recInput + " is not a palindrome.");
        }

        sc.close();

        System.out.println("\nProgram execution completed.");
    }
}
