public class LoggerStackTrace {

    public static void main(String[] args) {
        log("In main method");
    }

    public static void log (String str){
        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName()
                + ": " + Thread.currentThread().getStackTrace()[2].getMethodName()
                + ": " + str) ;
    }

}
