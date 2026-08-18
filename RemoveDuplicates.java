import java.util.Scanner;
import java.util.Stack;

public class RemoveDuplicates {
    static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
            
                stack.push(ch);
            }
        }

        String result = "";

        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String result = removeDuplicates(s);

        System.out.println("Result: " + result);

        sc.close();
    }
}