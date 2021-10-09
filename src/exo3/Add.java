package exo3;

public class Add extends Expr{
   public Add(Expr expr1,Expr expr2){
       super(expr1.valeur + expr2.valeur);
   }
}
