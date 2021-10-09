package exo1;

public class Main2 {

        public static void main(String[] args) {
            Mere2 mere = new Mere2();
            System.out.println(mere.meth);
            mere.printMeth();
            Fille2 fille = new Fille2();
            System.out.println(fille.meth);
            fille.printMeth();
            Mere2 mereFille = new Fille2();
            System.out.println( "avant cast "  + mereFille.meth);
            System.out.println("apres cast " + ((Fille2) mereFille).meth );
            mereFille.printMeth();

            /***
             * 4)
             * 42 ->  ca fait appel a la variable meth de la classe Mere2
             * 42 ->  printMeth est la méthode qui affiche la variable meth de la classe Mere2
             * 24 ->  ca affiche la variable meth de la classe Fille2
             * 42 ->  printMeth fait appel à la méthode de la classe Mere2 qui elle affiche merth de la classe Mere2
             * 42 ->  le champ .meth est celui qui se trouve dans l'espace mémoire de la classe Mere2
             * 42 ->  meme raison
             *
             *
             */


            Fille f;
            Fille f2 = null;

          //  f.axel();


        }
}

