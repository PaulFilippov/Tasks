package javaRush;

import java.io.*;
import java.util.*;

public class CheckForOrder {

    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    //заполняем список
    for (int i = 0; i < 10; i++) {
        list.add(readWord());
    }

    for (String s : list) {
        System.out.println(s);
    }

    checkOrdered(list);
}

    public static String readWord() {
        String textFromConsole = null;
        System.out.println("Введите слово");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            textFromConsole = br.readLine();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return textFromConsole;
    }

    public static void checkOrdered(List<String> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1).length() > list.get(i).length()) {
                System.out.print("Список не отсортирован, Упорядоченность нарушена на элементе с индексом: " + i);
                break;
            }
        }
    }
}