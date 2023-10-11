package tp3;

public class Magasin {
    private int id,cap;
    private String adr;
    private int cpt = 0 ;
    Produit Prods[];
    
    void setid(int id){
        this.id = id;
    }
    void setcap(int cap){
        this.cap = cap;
    }
    void setadr(String adr){
        this.adr = adr;
    }
    void setcpt(int cpt){
        this.cpt = cpt;
    }
    int getid(){
        return this.id;
    }
    int getcap(){
        return this.cap;
    }
    String getadr(){
        return this.adr;
    }
    int getcpt(){
        return this.cpt;
    }
    
    
    public Magasin( int id, String adr,int cap){
        this.setid(id);
        this.setadr(adr);
        this.setcap(cap);
        this.Prods = new Produit[cap];
    }
    public boolean ajouterProd(Produit P) {
        if ( this.getcpt() < this.getcap() && this.chercherProd(P) == false ){
            this.Prods[this.getcpt()] = P ;
            this.setcpt(this.getcpt()+1) ;
            return true;
        }
        return false;
    }
    
    public void afficherMag(){
        System.out.println("\nid: "+this.getid());
        System.out.println("adresse: "+this.getadr());
    }
    
    public void afficherMagProd(){
        int i;
        this.afficherMag();
        if (this.Prods.length == 0 ){
            System.out.println("\npas de produits");
        }else{
            for(i=0;i<this.getcpt();i++){
                System.out.println("\n\nProduit n "+ (i+1) +": \n");
                this.Prods[i].afficher();
            }
        }
    }
    public String toString(){
        int i;
        String resCh ;
        resCh = "id : "+this.getid() +"\nadresse"+this.getadr()+"\n";
        if (this.Prods.length == 0 ){
            resCh += "\npas de produits";
        }else{
            for(i=0;i<this.cpt;i++){
                resCh += "\n\nProduit n "+ (i+1) +": \n";
                resCh += this.Prods[i].toString();
            }
        }
        return resCh;
    } 
    
    
    public boolean chercherProd(Produit p){
        for(int i=0 ; i < this.getcpt() ; i++){
            if( this.Prods[i] == p ){
                return true;
            }
        }
        return false;
    }
    
    public boolean supprimerProd(Produit p){
        int s = 0 ;
        int i;
        if( this.chercherProd(p) ) {
            for( i = 0; i <this.getcpt() ; i++  ){
                if( s == 1){
                    this.Prods[i-1] = this.Prods[i] ;
                }
                if( this.Prods[i].getlibelle() == p.getlibelle() ){
                    s=1;
                }
            }
            this.setcpt( this.getcpt() -1 );
            this.Prods[this.getcpt()] = null;
            return true;
        }
        return false;
    } 
}
