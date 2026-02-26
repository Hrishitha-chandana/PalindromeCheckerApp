import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ================= UC1 =================
        System.out.println("Welcome to Palindrome Checker App!");
        System.out.println("-----------------------------------");
        System.out.println("Application Name : Palindrome Checker");
        System.out.println("Version          : 1.0");
        System.out.println("\nApplication started successfully.\n");


        // ================= UC2 =================
        String hardcoded = "madam";
        String reversedHardcoded = "";

        for (int i = hardcoded.length() - 1; i >= 0; i--) {
            reversedHardcoded += hardcoded.charAt(i);
        }

        if (hardcoded.equals(reversedHardcoded))
            System.out.println("UC2: " + hardcoded + " is palindrome.");
        else
            System.out.println("UC2: " + hardcoded + " is not palindrome.");


        Scanner sc = new Scanner(System.in);


        // ================= UC3 =================
        System.out.print("\nEnter word for UC3: ");
        String input = sc.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (input.equals(reversed))
            System.out.println("UC3: Palindrome");
        else
            System.out.println("UC3: Not Palindrome");


        // ================= UC4 =================
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

        if (isPalindrome)
            System.out.println("UC4: Palindrome");
        else
            System.out.println("UC4: Not Palindrome");


        // ================= UC5 =================
        System.out.print("\nEnter word for UC5: ");
        String stackInput = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char c : stackInput.toCharArray())
            stack.push(c);

        String reversedStack = "";

        while (!stack.isEmpty())
            reversedStack += stack.pop();

        if (stackInput.equals(reversedStack))
            System.out.println("UC5: Palindrome");
        else
            System.out.println("UC5: Not Palindrome");


        // ================= UC6 =================
        System.out.print("\nEnter word for UC6: ");
        String data = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();

        for (char c : data.toCharArray()) {
            queue.add(c);
            stack2.push(c);
        }

        boolean result = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack2.pop()) {
                result = false;
                break;
            }
        }

        if (result)
            System.out.println("UC6: Palindrome");
        else
            System.out.println("UC6: Not Palindrome");


        sc.close();
        System.out.println("\nProgram execution completed.");
    }
}
