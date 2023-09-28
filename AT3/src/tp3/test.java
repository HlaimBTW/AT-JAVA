package tp3;
import java.util.Scanner;
public class test {
	public static void main(String[]arg) {
		Scanner S = new Scanner(System.in);
		//Q1
		System.out.println("---------- Q1 --------------");
		Produit p1 = new Produit();
		p1.Afficher();
		//Q2
		System.out.println("---------- Q2 --------------");
		Produit p2 = new Produit();
		p2.id = 111;
		p2.lib = "beurre";
		p2.marque = "Delice";
		Produit p3 = new Produit(222,"Yaourt","Vitalait",0.0f);
		
		Produit p4 = new Produit(333,"Tomate","Sicam",5.300f);
		//Q3
		System.out.println("---------- Q3 --------------");
		p2.Afficher();
		p3.Afficher();
		p4.Afficher();
		//Q4
		System.out.println("---------- Q4 --------------");
		p2.prix = 1.700f;
		p2.Afficher();
		//Q5
		System.out.println("---------- Q5 --------------");
		System.out.println("Donner le prix de Produit id = "+p3.id);
		p3.prix = S.nextFloat();
		//Q6
		System.out.println("---------- Q6 --------------");
		p2.Afficher();
		p3.Afficher();
		p4.Afficher();
	}
}
