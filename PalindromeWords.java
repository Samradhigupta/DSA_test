import java.util.Scanner;

public class PalindromeWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        System.out.print("Palindrome word(s): ");

        for (String word : words) {

            word = word.toLowerCase();

            if (word.length() > 1) {

                int start = 0;
                int end = word.length() - 1;
                boolean palindrome = true;

                while (start < end) {

                    if (word.charAt(start) != word.charAt(end)) {
                        palindrome = false;
                        break;
                    }

                    start++;
                    end--;
                }

                if (palindrome) {
                    System.out.print(word + " ");
                }
            }
        }

        sc.close();
    }
}