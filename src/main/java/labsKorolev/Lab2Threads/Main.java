package labsKorolev.Lab2Threads;

/*Напишите программу, запускающую 2 независимых потока.
Первый поток выводит на экран дату и время каждые 5 секунд и это время записывает в файл currentdata.txt.
Для определения даты и времени использовать класс java.util.Calendar.
Второй поток каждые 15 секунд проверяет размер файла currentdata.txt и если этот размер превысил 50 байт, то сохраняет файл под уникальным именем и обнуляет файл currentdata.txt.
Уникальное имя файла должно содержать дату и время его создания.
Программа должна содержать 3 класса: первый реализует первый поток, второй класс реализует второй поток и третий класс  содержит метод main, из которого запускаются оба потока.
При работе с файлами организовать обработку исключительных ситуаций.
Для реализации некоторых операций с файлами используйте классы java.io.File и ja-va.io.FileOutputStream().
Создайте документацию по проекту. Таким образом, требуется написать 3 класса. Два из них будут представлять собой два потока и третий класс, содержащий метод main бу-дет запускать оба этих потока.

Создайте аплет с многопоточностью, выводящий теку-щее текущее время в формате hh:mm:ss, обновляемое каждую секунду.
Для определения даты и времени использовать класс java.util.Calendar.

При создании апплета в среде JBuilder необходимо:
1.	Выбрать пункт меню File.
2.	Выбрать пункт меню New.
3.	Выбрать вкладку Web.
4.	Выбрать ярлык Applet
После это будет сгенерирован простой аплет и код html файла, вызывающего Ваш аплет.

При создании апплета в среде NetBeans необходимо вы-брать:
1.	Выбрать пункт меню File, затем New File.
2.	Для создания апплета необходимо выбрать Categories – Java, затем выбрать FileTypes – Applet.
После чего отдельно создать html-файл (если среда Net-Beans не создаст его автоматически) для запуска Вашего ап-плета.
*/

public class Main {

    static String filePath = "C:\\Users\\SSDSystem\\Desktop\\Java\\JavaTasks\\currentdata.txt";
    //static String filePath = "C:\\Users\\SSDSystem\\Desktop\\Java\\JavaTasks\\currentdata.txt";

    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread(filePath);
        firstThread.start();
        Thread secondThread = new Thread(new SecondThread(filePath));
        secondThread.start();
    }
}
