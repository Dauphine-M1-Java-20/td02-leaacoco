package exo3;

public class Expr {
    public double valeur;
    public Expr (double valeur){
        this.valeur=valeur;
    }
    public double eval(){
       return valeur;
    }
}
