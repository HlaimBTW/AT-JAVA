package tp3;

public class Magasin {
	String nom;
	String adresse;
	Produit produits[] = new Produit[10];
	int len = 0;
	void add_produit(Produit p) {
		if(len < 10) {
			//System.out.println(len);
			produits[len] = p;
			len++;
		}
	}
	void afficher_magasin() {
		System.out.println("Nom : "+nom+" | Adresse : "+adresse);
	}
	void affiche_produits() {
		System.out.println("[");
		for(int i = 0; i < len ; i++) {
			produits[i].Afficher();
		}
		System.out.println("]");
	}
	public Magasin() {}
	public Magasin(String n,String a) {
		nom = n;
		adresse = a;
	}
}
