package tests;

public class Test extends Main {

    int a=1;
    int sa = 5;

    public void metod(int a) {
        a=2;
    }

    public int getSa() {
        return sa;
    }

    public void setSa(int sa) {
        this.sa = sa;
    }

    @Override
    void stMet (){
        System.out.println("к");
    }

    @Override
    public void printMet(String str) {
        System.out.println(str);
    }
}
