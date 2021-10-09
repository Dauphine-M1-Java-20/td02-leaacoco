package exo1;

public class Fille extends Mere {

    public  int meth() {

        return 24;
    }
    public static int meth2(){
        return 24;
    }
    public void axel(){
        System.out.println("axel");
         this.lea();
         super.lea();

    }

    @Override
    public void lea() {
        System.out.println("lea fille");

    }

}
