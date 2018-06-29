package One;
import java.util.*;
/* На дворе 31 век
Написать программу, выводящую на экран нынешний год. На дворе 31 век, если что (см. предысторию).

Подсказка:
Возьмите текущий год и измените век на 31.
Вывести нужно число, состоящее из четырех цифр.
*/
public class Three {
    public static void main(String[] args)
    {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int century = 31;
        System.out.println((century-1)*100+year%100);
    }
}
