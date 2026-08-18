import java.util.Scanner;

public class DuplicateWords {
    static void findDuplicateWords(String str) {

        String[] words = str.split(" ");
        System.out.println("Duplicate words:");
        for (int i = 0; i < words.length; i++) {

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (words[i].equalsIgnoreCase(words[k])) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equalsIgnoreCase(words[j])) {
                    System.out.println(words[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        findDuplicateWords(str);

        sc.close();
    }
}