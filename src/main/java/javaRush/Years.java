package javaRush;

/* Количество дней в году
Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
"количество дней в году: x", где х - 366 для високосными года, х - 365 для обычного года.
Подсказка: В високосном году - 366 дней, тогда как в обычном  - 365.
Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 — високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 — невисокосные.
*/

import java.io.*;

public class Years {
    public static void main(String[] args) throws Exception {

        String yearStr = null;
        int yearInt;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            yearStr = reader.readLine();
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Считанная строка: " + yearStr);
        yearInt = Integer.parseInt(yearStr);

        if ((yearInt % 4) != 0) {
            System.out.println("Обычный");
        } else if (yearInt % 100 == 0) {
            if (yearInt % 400 == 0) {
                System.out.println("Високосный");
            } else System.out.println("Обычный");
        } else System.out.println("Високосный");
    }
}