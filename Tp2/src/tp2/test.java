package tp2;
import java.util.Scanner;
public class test {
	public static void main(String[]arg)
	{
		Chemise ch1 = new Chemise();
		ch1.Ref = 111;
		ch1.Couleur ="Rouge";
		ch1.Type = "couton";
		ch1.Prix = 30;
		ch1.Afficher();
		Chemise ch2 = new Chemise();
		Scanner input = new Scanner(System.in);
		System.out.println("Ref : ");
		ch2.Ref = input.nextInt();
		System.out.println("Couleur : ");
		ch2.Couleur =input.next();
		System.out.println("Type : ");
		ch2.Type = input.next();
		System.out.println("Prix : ");
		ch2.Prix = input.nextFloat();
		ch2.Afficher();
		input.close();
		Chemise ch3 = new Chemise(112,"mauve","couton",20);
		ch3.Afficher();
	}
}
