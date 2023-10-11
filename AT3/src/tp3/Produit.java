package tp3;
import java.util.Scanner;
public class Produit {
    private int id;
    private String libelle;
    private String marque;
    private float prix;
    
    
    int getid(){
        return this.id;
    }
    String getlibelle(){
        return this.libelle;
    }
    String getmarque(){
        return this.marque;
    }
    float getprix(){
        return this.prix;
    }
    void setid(int a){
        this.id = a;
    }
    void setlibelle(String a){
        this.libelle = a;
    }
    void setmarque(String a){
        this.marque = a ;
    }
    void setprix(float a){
        this.prix = a;
    }
 
public Produit(){
}

public Produit(int a, String b, String c, float d){
    this.setid ( a);
    this.setlibelle( b );
    this.setmarque ( c );
    if( d < 0  ){
        System.out.println("Le prix doit etre positif! ");
        this.setprix( 0 ) ;
    }else
        this.setprix( d );
}
public Produit(int a, String b, String c){
    this.setid ( a);
    this.setlibelle( b );
    this.setmarque ( c );
}
void SetPrix(){
    Scanner scan = new Scanner(System.in);
    this.setprix( scan.nextFloat() );
}
public String toString(){
    return "\nid: "+this.getid()+"\nlibelle: "+this.getlibelle()+"\nmarque: "+this.getmarque()+"\nprix: "+this.getprix();
} 
void afficher(){
    System.out.println( "\nid: "+this.getid()+"\nlibelle: "+this.getlibelle()+"\nmarque: "+this.getmarque()+"\nprix: "+this.getprix() );
}
}
