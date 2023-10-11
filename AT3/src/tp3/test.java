package tp3;
import java.util.Scanner;
public class test {
    public static void main(String arg[]){
        /*
        Produit prod ;
        Produit prod1 = new Produit(111,"beurre","Dalice");
        Produit prod2 = new Produit(222,"Yaourt","Delice");
        Produit prod3 = new Produit(333,"Tomate","Sicam",5.300f);
        
        
        prod1.afficher();
        prod2.afficher();
        prod3.afficher();
        
        prod = new Produit();
        prod.libelle = "lait";
        prod.prix = 1.700f;
        prod.afficher();
        
        System.out.print("produit "+prod1.id+", donnez le prix:");
        prod1.SetPrix();
        
        System.out.print("produit "+prod2.id+", donnez le prix:");
        prod2.SetPrix();
        
        System.out.print("produit "+prod.libelle+", donnez l'id:");
        Scanner scan = new Scanner(System.in);
        prod.id = scan.nextInt();
        
        System.out.print("produit "+prod.libelle+", la marque:");
        scan = new Scanner(System.in);
        prod.marque = scan.nextLine();
        
        prod1.afficher();
        prod2.afficher();
        prod.afficher();
        */
        
        Magasin mag = new Magasin(142,"ksdhj",15);
        Produit prod3 = new Produit(333,"beurre","Delice",5.300f);
        Produit prod2 = new Produit(44,"Yaourt","Delice",-6.00f);
        Produit prod1 = new Produit(77,"Tomate","Sicam",7.00f);
        
        System.out.println( "ajout p1 :" +mag.ajouterProd(prod1));
        System.out.println( "ajout p2 :" +mag.ajouterProd(prod2));
        System.out.println( "ajout p2 :" +mag.ajouterProd(prod2));
        System.out.println( "ajout p3 :" +mag.ajouterProd(prod3));
        System.out.println( "\n\nAffichage :");
        mag.afficherMagProd();
        
        System.out.println("rech p1 :"+ mag.chercherProd(prod1));
        System.out.println("rech p2 :"+ mag.chercherProd(prod2));
        
        System.out.println("supp p1 :"+ mag.supprimerProd(prod1));
        System.out.println("supp p1 :"+ mag.supprimerProd(prod1));
        
        System.out.println( "\n\ntostring:\n");
        System.out.println(mag.toString());
    }
}
