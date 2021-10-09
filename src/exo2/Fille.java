package exo2;

import java.io.IOException;

public class Fille extends Mere{
    void miage() {
        System.out.println("Miage");
    }

    public void a() {
        System.out.println("Fille_a");
    } //redef

    protected void b(Fille fille) {
        System.out.println("Fille_b(Fille)");
    } //redef

    public void c(Mere mere) {
        System.out.println("Fille_c(Mere)");
    } //redef

    void c(Fille b) {
        System.out.println("Fille_c(Fille)");
    } //surcharge de c

    static void d() {
        System.out.println("static Fille_d");
    }

    static void d(Mere mere) {
        System.out.println("Fille_d(Mere)");
    } //surcharge de d

//    private void e() {
//        System.out.println("Fille_e");
//    } // il faut que la signature soit celle de la classe mère donc protected
//
//    protected void f() { //meme raison donc public
//        System.out.println("Fille_f");
//    }

    String g() { //redef
        System.out.println("Fille_g");
        return "c";
    }

  /*  char h() {   //il faut que la signature soit celle de la classe mère donc int
        System.out.println("Fille_h");
        return 'c';
    }*/

//    int i() {  //la méthode i est mal défini car elle doit avoir la meme signature que celle de Mere
//        System.out.println("Fille_i");
//        return 3;
//    }

    void j() throws IOException {  //I0Exception est une classe fille de Exception donc c'est bon
        System.out.println("Fille_j");
    } //redef

//    void k() throws Exception { // il faut utiliser au moins l'exception de la classe Mere (I0Exception) et pas faire de noivelles exceptions qui ne sont pas dans la classe Mere
//        System.out.println("Fille_k");
//    }

    void l() {
        System.out.println("Fille_l");
    } //redef

    void m() throws IOException, IllegalArgumentException {
        System.out.println("Fille_m");
    } //redef
}
