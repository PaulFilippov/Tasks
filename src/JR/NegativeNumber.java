package JR;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class NegativeNumber {
    public static void main(String[] args) throws Exception {

        String a=null;
        int aa;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            a = reader.readLine();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        aa=Integer.parseInt(a);

        if (aa >= 0) {
            aa = aa * 2;
        }
        else aa++;

        System.out.println(aa);

    }
}
