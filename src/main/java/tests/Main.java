package tests;

import java.util.LinkedList;
import java.util.List;

public class Main implements Interf{

    private int[] arr = new int[]{1,2,3,4,5};

    public static void main(String[] args) {

        List <Integer> lst = new LinkedList<>();
        lst.add(3);

        System.out.println(lst.get(2));

    }

    @Override
    public void printMet(String str) {
        System.out.println(str);
    }

}
