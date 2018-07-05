package ForTests;

public class Main {

    private Test1 t1;
    private Test1 t2;

    public static void main(String[] args) {
        Main m=new Main();
        m.t1=new Test1(3);
        m.t2=m.t1;
        m.t2.x++;
        System.out.println(m.t1);
        System.out.println(m.t2);
    }

}
