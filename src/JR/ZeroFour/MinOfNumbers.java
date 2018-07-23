package JR.ZeroFour;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class MinOfNumbers
{
    public static void main(String[] args) throws Exception
    {
        Double[] arr = new Double[2];


        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (int i=0;i<2;i++){
            arr[i] = Double.parseDouble(reader.readLine());
            System.out.println("Число "+i+" = "+arr[i]);
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        for (int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]) System.out.println(arr[i-1]);
        }

    }
}