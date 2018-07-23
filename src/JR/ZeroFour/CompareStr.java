package JR.ZeroFour;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class CompareStr {
    public static void main(String[] args) throws Exception {
        String[] arr = new String[2];

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 2; i++) {
                arr[i] = reader.readLine();
                System.out.println("Строка " + i + " = " + arr[i]);
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        if ((arr[0].compareTo(arr[1]) == 0)) {
            System.out.println("Имена идентичны");
        } else if (arr[0].length()==arr[1].length()){
            System.out.println("Длины имен равны");
        }

    }
}