/*Первый поток выводит на экран дату и время каждые 5 секунд и это время записывает в файл currentdata.txt.
  Для определения даты и времени использовать класс java.util.Calendar.*/

package LabsKorolev.Lab2Threads;

import java.util.*;
import java.io.*;

public class FirstThread extends Thread {

    String filePath;
    String dateStr;
    BufferedWriter br = null;

    //конструктор потока с параметром расположения файла
    public FirstThread(String filePath) {
        this.filePath = filePath;
    }

    //получаем текущую дату\время и пишем их в конец файла
    @Override
    public void run() {
        File fileForDate = new File(filePath);

        //если файл не создан, то создаем
        if (!fileForDate.exists()) {
            try {
                fileForDate.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }

        while (true) {
            try {
                Date date = new Date();
                dateStr = date.toString();
                System.out.println("От первого потока: " + dateStr);
                br = new BufferedWriter(new FileWriter(fileForDate, true));
                br.write(dateStr);
                br.newLine(); // перевод на новую строку
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //останавливаем поток на 5 секунд
            try {
                sleep(5000); // Задержка в 5 сек
            } catch (Exception e) {
            }
        }
    }


}
