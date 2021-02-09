package tests.pakB;

//import tests.A;

public class B {

    protected int xb;

    public void someFunc() {
        //x = 10; //Доступ к защищённому члену родительского класса
        //f();
        //A ref = new A();
        //ref.x = 13; //В контексте дочернего класса отношение к защищённым членам ЗАПРЕЩЕНО (приведет к ошибке компиляции)
        //String bebe = A.name; //Статические переменные - не исключение
    }
}