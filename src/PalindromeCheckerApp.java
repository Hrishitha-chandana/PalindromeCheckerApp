import java.util.Scanner;
import java.util.Stack;

// ==========================
// UC11: OOP Service Class
// ==========================
class PalindromeChecker {

    public boolean checkPalindrome(String text) {

        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    // ==========================
    // UC9 Recursive Method
    // ==========================
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App!");
        System.out.println("-----------------------------------");

        System.out.println("Application Name : Palindrome Checker");
        System.out.println("Version          : 1.0");

        System.out.println("\nApplication started successfully.\n");

        // UC2
        String hardcoded = "madam";
        String reversedHardcoded = "";

        for (int i = hardcoded.length() - 1; i >= 0; i--) {
            reversedHardcoded += hardcoded.charAt(i);
        }

        if (hardcoded.equals(reversedHardcoded))
            System.out.println("UC2 Result: " + hardcoded + " is a palindrome.");
        else
            System.out.println("UC2 Result: " + hardcoded + " is not a palindrome.");

        Scanner sc = new Scanner(System.in);

        // UC3
        System.out.print("\nEnter word for UC3 check: ");
        String input = sc.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (input.equals(reversed))
            System.out.println("UC3 Result: " + input + " is a palindrome.");
        else
            System.out.println("UC3 Result: " + input + " is not a palindrome.");

        // UC4
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

        System.out.println("UC4 Result: " + (isPalindrome ? "Palindrome" : "Not Palindrome"));

        // UC5
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

        System.out.println("UC5 Result: " +
                (stackInput.equals(reversedStack) ? "Palindrome" : "Not Palindrome"));

        // UC7
        System.out.println("\nUC7: Deque-Based Optimized Palindrome Checker");

        String dequeInput = "refer";

        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        for (char c : dequeInput.toCharArray())
            deque.addLast(c);

        boolean isDequePalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isDequePalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + dequeInput);
        System.out.println("Is Palindrome? : " + isDequePalindrome);

        // UC8
        System.out.println("\nUC8: Linked List Based Palindrome Checker");

        String llInput = "madam";

        java.util.LinkedList<Character> list = new java.util.LinkedList<>();

        for (char c : llInput.toCharArray())
            list.add(c);

        boolean isLLPalindrome = true;

        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isLLPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + llInput);
        System.out.println("Is Palindrome? : " + isLLPalindrome);

        // UC9
        System.out.println("\nUC9: Recursive Palindrome Checker");

        System.out.print("Enter word for UC9 check: ");
        String recInput = sc.nextLine();

        boolean result = isPalindromeRecursive(recInput, 0, recInput.length() - 1);

        System.out.println("UC9 Result: " +
                (result ? "Palindrome" : "Not Palindrome"));

        // UC10
        System.out.println("\nUC10: Case-Insensitive & Space-Ignored Palindrome");

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        String normalized = sentence.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        boolean isSentencePalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isSentencePalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("UC10 Result: " +
                (isSentencePalindrome ? "Palindrome" : "Not Palindrome"));

        // ==========================
        // UC11: OOP Palindrome Service
        // ==========================
        System.out.println("\nUC11: Object-Oriented Palindrome Service");

        System.out.print("Enter text: ");
        String oopInput = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean oopResult = checker.checkPalindrome(oopInput);

        System.out.println("UC11 Result: " +
                (oopResult ? "Palindrome" : "Not Palindrome"));

        sc.close();

        System.out.println("\nProgram execution completed.");
    }
}