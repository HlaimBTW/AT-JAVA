package somme;
import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        int n;
        int s = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            s += i;
        }
        System.out.println("Sum from 1 to " + n + " is: " + s);
        
        input.close();
    }
}
