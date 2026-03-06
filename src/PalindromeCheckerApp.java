import java.util.*;

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

// ==========================
// UC12 Strategy Interface
// ==========================
interface PalindromeStrategy {
    boolean check(String text);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean check(String text) {

        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return text.equals(reversed);
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String text) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : text.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    // ==========================
    // UC9 Recursive Method
    // ==========================
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("----------------------------------");

        System.out.println("Application Name : Palindrome Checker");
        System.out.println("Version          : 1.0\n");

        Scanner sc = new Scanner(System.in);

        // ==========================
        // UC2 Hardcoded
        // ==========================
        String hardcoded = "madam";
        String reversedHardcoded = "";

        for (int i = hardcoded.length() - 1; i >= 0; i--)
            reversedHardcoded += hardcoded.charAt(i);

        System.out.println("UC2 Result: " +
                (hardcoded.equals(reversedHardcoded) ? "Palindrome" : "Not Palindrome"));

        // ==========================
        // UC3 Reverse String
        // ==========================
        System.out.print("\nEnter word for UC3: ");
        String input = sc.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--)
            reversed += input.charAt(i);

        System.out.println("UC3 Result: " +
                (input.equals(reversed) ? "Palindrome" : "Not Palindrome"));

        // ==========================
        // UC4 Character Array
        // ==========================
        System.out.print("\nEnter word for UC4: ");
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

        System.out.println("UC4 Result: " +
                (isPalindrome ? "Palindrome" : "Not Palindrome"));

        // ==========================
        // UC5 Stack
        // ==========================
        System.out.print("\nEnter word for UC5: ");
        String stackInput = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char c : stackInput.toCharArray())
            stack.push(c);

        String reversedStack = "";

        while (!stack.isEmpty())
            reversedStack += stack.pop();

        System.out.println("UC5 Result: " +
                (stackInput.equals(reversedStack) ? "Palindrome" : "Not Palindrome"));

        // ==========================
        // UC7 Deque
        // ==========================
        System.out.println("\nUC7 Deque Method");

        String dequeInput = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : dequeInput.toCharArray())
            deque.addLast(c);

        boolean isDequePalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isDequePalindrome = false;
                break;
            }
        }

        System.out.println("Result: " + isDequePalindrome);

        // ==========================
        // UC8 LinkedList
        // ==========================
        System.out.println("\nUC8 LinkedList Method");

        String llInput = "madam";

        LinkedList<Character> list = new LinkedList<>();

        for (char c : llInput.toCharArray())
            list.add(c);

        boolean isLLPalindrome = true;

        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isLLPalindrome = false;
                break;
            }
        }

        System.out.println("Result: " + isLLPalindrome);

        // ==========================
        // UC9 Recursion
        // ==========================
        System.out.print("\nEnter word for UC9: ");
        String recInput = sc.nextLine();

        boolean recResult =
                isPalindromeRecursive(recInput, 0, recInput.length() - 1);

        System.out.println("UC9 Result: " +
                (recResult ? "Palindrome" : "Not Palindrome"));

        // ==========================
        // UC10 Ignore Case & Space
        // ==========================
        System.out.print("\nEnter sentence for UC10: ");
        String sentence = sc.nextLine();

        String normalized = sentence.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        boolean sentencePalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                sentencePalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("UC10 Result: " +
                (sentencePalindrome ? "Palindrome" : "Not Palindrome"));

        // ==========================
        // UC11 OOP Service
        // ==========================
        System.out.print("\nEnter text for UC11: ");
        String oopInput = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean oopResult = checker.checkPalindrome(oopInput);

        System.out.println("UC11 Result: " +
                (oopResult ? "Palindrome" : "Not Palindrome"));

        // ==========================
        // UC12 Strategy Pattern
        // ==========================
        System.out.println("\nUC12 Strategy Pattern");

        System.out.print("Enter word: ");
        String strategyInput = sc.nextLine();

        System.out.println("Choose Algorithm:");
        System.out.println("1 Stack Strategy");
        System.out.println("2 Deque Strategy");

        int choice = sc.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1)
            strategy = new StackStrategy();
        else
            strategy = new DequeStrategy();

        boolean strategyResult = strategy.check(strategyInput);

        System.out.println("UC12 Result: " +
                (strategyResult ? "Palindrome" : "Not Palindrome"));
        // ==========================
// UC13: Performance Comparison
// ==========================
        System.out.println("\nUC13: Performance Comparison");
        System.out.println("--------------------------------");

        sc.nextLine(); // clear buffer

        System.out.print("Enter text for performance test: ");
        String perfInput = sc.nextLine();

// Reverse Method
        long start1 = System.nanoTime();
        String reversed = "";
        for (int i = perfInput.length() - 1; i >= 0; i--) {
            reversed += perfInput.charAt(i);
        }
        boolean result1 = perfInput.equals(reversed);
        long end1 = System.nanoTime();

// Stack Method
        long start2 = System.nanoTime();
        Stack<Character> stack = new Stack<>();
        for (char c : perfInput.toCharArray()) {
            stack.push(c);
        }
        String reversedStack = "";
        while (!stack.isEmpty()) {
            reversedStack += stack.pop();
        }
        boolean result2 = perfInput.equals(reversedStack);
        long end2 = System.nanoTime();

// Deque Method
        long start3 = System.nanoTime();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : perfInput.toCharArray()) {
            deque.addLast(c);
        }
        boolean result3 = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                result3 = false;
                break;
            }
        }
        long end3 = System.nanoTime();

// Display Results
        System.out.println("\nPerformance Results:");
        System.out.println("Reverse Method: " + result1 + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Method: " + result2 + " | Time: " + (end2 - start2) + " ns");
        System.out.println("Deque Method: " + result3 + " | Time: " + (end3 - start3) + " ns");

        sc.close();

        System.out.println("\nProgram execution completed.");
    }
}