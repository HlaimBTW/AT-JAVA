import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            if (isPalindrome(input)) {
                System.out.println("'" + input + "' est une palindrome.");
            } else {
                System.out.println("'" + input + "' n'est pas une palindrome.");
            }

            scanner.close();
        }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();

        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}