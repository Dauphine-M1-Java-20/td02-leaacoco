package exo2;

public class Main {
    public static void main(String[] args) throws Exception {
        Mere mere = new Mere();
        Mere mereFille = new Fille();
        Fille fille = new Fille();

       // mere.miage(); //la méthode miage n'est pas défini dans la classe Mere
        fille.miage();
       // mereFille.miage(); //on ne peut pas utiliser la méthode miage de la calsse Fille car elle n'est pas défini dans la classe Mere
        ((Fille) mereFille).miage();

        mere.a();
        mereFille.a();
        fille.a();
        ((Mere) mereFille).a();
        mereFille.b(null);

        mereFille.c();
        mereFille.c(mere);
        mereFille.c(mereFille);
        mereFille.c(fille);
        fille.c(fille);

        mere.d();
        mereFille.d();

        mere.printF();
        mereFille.printF();

        mereFille.j();
        mereFille.k();
        mereFille.l();
        mereFille.m();
    }
    // 3) U
}
