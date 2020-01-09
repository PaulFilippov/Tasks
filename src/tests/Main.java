package tests;

public class Main implements Interf{

    private int x = 4;

    public static void main(String[] args) {

        Test t = new Test();
        System.out.println(t.a);
        t.metod(t.a);
        System.out.println(t.a);
        Interf interf = new Main();
        System.out.println();
        t.printMet("ууу");


    }

     void stMet (){
         System.out.println("к");
     }


    @Override
    public void printMet(String str) {
        System.out.println(str);
    }
}
