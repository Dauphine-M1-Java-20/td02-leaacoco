package exo2;

public class Main {
    public static void main(String[] args) throws Exception {
        Mere mere = new Mere();
        Mere mereFille = new Fille();
        Fille fille = new Fille();

       // mere.miage(); //la méthode miage n'est pas défini dans la classe Mere
        fille.miage(); //"miage"
       // mereFille.miage(); //on ne peut pas utiliser la méthode miage de la calsse Fille car elle n'est pas défini dans la classe Mere
        ((Fille) mereFille).miage(); //"miage"

        mere.a(); // "Mere_a"
        mereFille.a(); //"Fille_a"
        fille.a(); //"Fille_a"
        ((Mere) mereFille).a(); //"Fille_a"
        mereFille.b(null);//"Fille_b(Fille)"

        mereFille.c(); //"Mere_c"
        mereFille.c(mere); //"Fille_c(Mere)"
        mereFille.c(mereFille); //"Fille_c(Mere)"
        mereFille.c(fille);//"Fille_c(Mere)"
        fille.c(fille); //"Fille_c(Fille)"

        mere.d(); //"static Mere_d"
        mereFille.d(); //static Mere_d"

        mere.printF(); //"Mere_f"
        mereFille.printF(); //"f{}"

        mereFille.j(); //"Fille_j"
        mereFille.k(); //"Fille_k"
        mereFille.l(); //"Fille_l"
        mereFille.m(); // Fille_m"
    }
    // 3) U
}
