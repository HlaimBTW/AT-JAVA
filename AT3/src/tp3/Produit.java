package tp3;

public class Produit {
	int id;
	String lib;
	String marque;
	float prix;
	void Afficher()
	{
		System.out.println("Identifiant : "+id+" | "+"Libellé : "+lib+" | "+"Marque : "+marque+" | "+"Prix : "+prix);
	}
	public Produit() {}
	public Produit(int i,String l,String m,float p) {
		id = i;
		lib = l;
		marque = m;
		prix = p;
	}
}
