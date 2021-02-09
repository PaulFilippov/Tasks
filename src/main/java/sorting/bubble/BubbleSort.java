package sorting.bubble;

import java.util.*;
import java.util.List;

public class BubbleSort {


    public static void main(String[] args) {

        List<Integer> arlst = crtArrListMassive(10);
        showArrListMassive(arlst);
        arlst = bubbleSorting(arlst);
        showArrListMassive(arlst);
    }

    private static List<Integer> bubbleSorting(List<Integer> lstArrMas) {
        for (int j = lstArrMas.size() - 1; j >= 1; j--) {
            for (int i = 0; i < j ; i++) {
                int max = lstArrMas.get(i);
                if (lstArrMas.get(i) > lstArrMas.get(i + 1)) {
                    int tmp = lstArrMas.get(i + 1);
                    lstArrMas.set(i + 1, lstArrMas.get(i));
                    lstArrMas.set(i, tmp);
                }
            }
        }
        return lstArrMas;
    }

    private static List<Integer> crtArrListMassive(int size) {
        List<Integer> sm = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            sm.add(rndmGenInt());
        }
        return sm;
    }

    private static int rndmGenInt() {
//        double a = 20 + Math.random()*40;
        int a = (int) (Math.random() * 100);
        return a;
    }

    private static void showArrListMassive(List<Integer> mas) {
//        for (int number : mas){
//            System.out.println(number);
//        }
        System.out.println(mas);
    }


//    private static List<Integer> showArrListMassive(List<Integer> mas) {
//        mas.forEach(number -> System.out.println(number));
//        return mas;
//    }

}

