package tp3;
//import java.util.Scanner;
public class test2 {
	public static void main(String[]arg) {
		//Scanner S = new Scanner(System.in);
		Magasin m1 = new Magasin("Aziza","Arriena");
		Produit p = new Produit(222,"Yaourt","Vitalait",0.0f);
		Produit p1 = new Produit(333,"Tomate","Sicam",5.300f);
		Produit p2 = new Produit(444,"beurre","Delice",1f);
		m1.add_produit(p);
		m1.add_produit(p1);
		m1.add_produit(p2);
		m1.afficher_magasin();
		m1.affiche_produits();
	}
}
