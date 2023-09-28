import java.util.Scanner;
public class Ex1 {
    public static int somme(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();
        scanner.close();
        int result = somme(n);
        System.out.println("la somme des premiers" + n + " nombres est: " + result);
    }
}
