package JR.ZeroFour;

/* Светофор
Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зеленый сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
Пример для числа 2.5:
зеленый
Пример для числа 3:
желтый
Пример для числа 4:
красный
Пример для числа 5:
зеленый
*/

import java.io.*;

public class StopLight {
    public static void main(String[] args) throws Exception {

        String minStr = null;
        Double min;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            minStr = reader.readLine();
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Считанная строка: " + minStr);
        min = Double.parseDouble(minStr);

        if ((min % 5) < 3) {
            System.out.println("Зеленый");
        } else if ((min% 5) < 4) {
            System.out.println("Желтый");
        } else System.out.println("Красный");
    }
}