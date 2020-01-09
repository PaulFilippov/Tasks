package javaRush;

import java.io.*;


//считает кол-во символов латиницы в файле
public class BonusWords {

    public static void main(String[] args) throws IOException {

        int count = 0;
        FileInputStream in = new FileInputStream(args[0]);

        //available возвращает кол-во байт доступных для чтения в данный момент
        while (in.available() > 0) {
            int data = in.read();
           /* if ((data >= Integer.valueOf('A') && data <= Integer.valueOf('Z'))
                    || (data >= Integer.valueOf('a') && data <= Integer.valueOf('z'))) {
                count++;
            } */

            if ((data >= 'A' && data <= 'Z')
                    || (data >= 'a' && data <= 'z')) {
                count++;
            }
        }
        in.close();
        System.out.println(Integer.valueOf(count));
    }

}
