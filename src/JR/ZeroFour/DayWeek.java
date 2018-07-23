package JR.ZeroFour;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;
import java.util.Scanner;

public class DayWeek
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc= new Scanner(System.in);
        int day=sc.nextInt();
        if (day==1)
            System.out.println("понедельник");
        if (day==2)
            System.out.println("вторник");
        if (day==3)
            System.out.println("среда");
        if (day==4)
            System.out.println("четв");
        if (day==5)
            System.out.println("пятн");
        if (day==6)
            System.out.println("суб");
        if (day==7)
            System.out.println("воскр");
    }

}