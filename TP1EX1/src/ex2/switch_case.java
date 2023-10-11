package ex2;
import java.util.Scanner;
public class switch_case {
	public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Donner un nombre");
        n = input.nextInt();
        switch (n) {
        case 0:
            System.out.println("Null");
            break;
        case 1,2:
            System.out.println("Petit");
            break;
        case 3,4,5:
            System.out.println("moyen");
            break;
        default:
            System.out.println("Grand");
    }
        
        input.close();
    }
}
