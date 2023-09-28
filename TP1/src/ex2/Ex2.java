import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        String description;

        switch (n) {
            case 0:
                description = "petit";
            case 1:
            case 2:
                description = "Petit";
                break;
            case 3:
            case 4:
            case 5:
                description = "Moyen";
                break;
            default:
                description = "Grand";
                break;
        }

        System.out.println("n est " + description);

        scanner.close();
    }
}

