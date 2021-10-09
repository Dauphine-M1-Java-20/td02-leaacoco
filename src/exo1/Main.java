package exo1;

public class Main {
        public static void main(String[] args) {
            Mere mere = new Mere();
            System.out.println(mere.meth());
            //le code affiche 42
            mere.printMeth();
            //le code affiche 42
            Fille fille = new Fille();
            System.out.println(fille.meth());
            //le code affiche 24 car on fait a la methode met de la classe Fille
            fille.printMeth();
            //le code affiche 24 car printMeth fait appel a meth de la methode Fille
            Mere mereFille = new Fille();
            System.out.println(mereFille.meth());
            //le code affiche 24
            mereFille.printMeth();
            //le code affiche 24
         fille.axel();
         /****

         2) S'il est dans Fille, un objet de type Fille a accès à 2 méthodes meth, une première à travers
          this.meth() et le deuxième super.meth().
          Et s'il est dans Main il a accès qu'a la méthode meth de la classe fille donc une seule fois.

          3) Si les méthodes meth sont statiques, le comportements de meth est différent.
          42
          42
          24
          42
          42
          42

          */


        }
}
