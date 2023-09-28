package tp2;

public class Chemise {
	int Ref;
	String Couleur;
	String Type;
	float Prix;
	void Afficher() {
		System.out.println("Ref : "+Ref+" | "+"Couleur : "+Couleur+" | "+"Type : "+Type+" | "+"Prix : "+Prix);
	}
	public Chemise() {}
	public Chemise(int r,String c,String t,float p) {
		Ref = r;
		Couleur = c;
		Type = t;
		Prix = p;
	}
}
