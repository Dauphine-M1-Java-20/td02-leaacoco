package exo1;

public class Mere {
    protected  int meth() {
        return 42;
    }
    protected static int  meth2(){
        return 42;
    }
    public void printMeth() {
        System.out.println(meth());
    }
    public void lea(){
        System.out.println("lea mere");
    }
    public void  printMeth2(){
        System.out.println(meth2());
    }
}
