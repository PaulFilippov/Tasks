/*Второй поток каждые 15 секунд проверяет размер файла currentdata.txt и если этот размер превысил 50 байт, то сохраняет файл под уникальным именем и обнуляет файл currentdata.txt.
  Уникальное имя файла должно содержать дату и время его создания.*/

package LabsKorolev.Lab2Threads;

import java.io.*;
import java.util.*;

public class SecondThread implements Runnable {

    private String pathfile;
    long sizeFile;
    Date date;
    String dateStr;

    public SecondThread(String pathfile) {
        this.pathfile = pathfile;
    }

    @Override
    public void run() {

        File dateFile = new File(pathfile);

        while (true) {
            if (!dateFile.exists()) {
                System.out.println("Из потока №2: " + "Такого файла нет");
            } else {
                sizeFile = dateFile.length();
                System.out.println("Из потока №2: " + "размер файла: " + sizeFile);
                if (sizeFile > 50L) {
                    date = new Date();
                    dateStr = date.toString();
                    String oldNameFile = dateFile.getName();
                    System.out.println(dateFile.getPath());
                    dateFile.renameTo(new File(pathfile.replace(oldNameFile,"") + dateStr.replace(':', '_') +
                            oldNameFile.substring(oldNameFile.indexOf('.'))));
                    }
            }
            try {
                Thread.sleep(15000); // Задержка в 5 сек
            } catch (Exception e) {
            }

        }
    }

}
