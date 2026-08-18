import java.util.Scanner;

public class Substring {
    static boolean isSubstring(String str1, String str2) {
        for (int i = 0; i <= str2.length() - str1.length(); i++) {
            int j;
            for (j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) != str2.charAt(i + j)) {
                    break;
                }
            }
            if (j == str1.length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isSubstring(str1, str2)) {
            System.out.println(str1 + " is a substring of the given string.");
        } else {
            System.out.println(str1 + " is not a substring of the given string.");
        }
        sc.close();
    }
}