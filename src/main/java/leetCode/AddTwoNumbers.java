package leetCode;

/*
2. Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {

    public static List addTwoNumbers(List<Integer> number1, List<Integer> number2) {
        List<Integer> number3 = new LinkedList<>();
        int sizeOfNumber1 = number1.size();
        int sizeOfNumber2 = number2.size();
        int sizeOfNumber3;

        if (sizeOfNumber1 < sizeOfNumber2) {
            sizeOfNumber3 = sizeOfNumber2;
            int startIndex = sizeOfNumber1;
            int differentSize = sizeOfNumber2 - sizeOfNumber1;
            for (int index = startIndex; startIndex <= sizeOfNumber3; startIndex++) {
                number1.add(0);
            }
        } else if (sizeOfNumber1 > sizeOfNumber2) {
            sizeOfNumber3 = sizeOfNumber1;
            int startIndex = sizeOfNumber2;
            int differentSize = sizeOfNumber1 - sizeOfNumber2;
            for (int index = startIndex; startIndex <= sizeOfNumber3; startIndex++) {
                number2.add(0);
            }
        } else sizeOfNumber3 = sizeOfNumber2;

        int tenToNext = 0;
        for (int i = 0; i < sizeOfNumber3; i++) {
            int intFromNumber1 = number1.get(i);
            int intFromNumber2 = number2.get(i);
            int sumOfIntFromNumbers = tenToNext + intFromNumber1 + intFromNumber2;
            tenToNext = 0;
            if (sumOfIntFromNumbers / 10 > 1) {
                number3.add(sumOfIntFromNumbers % 10);
                tenToNext = 1;
                if (i == sizeOfNumber3) {
                    sizeOfNumber3++;
                    number1.add(0);
                    number2.add(0);
                }
            } else number3.add(sumOfIntFromNumbers);
        }
        return number3;
    }

    public static void main(String[] args) {

        List<Integer> number1 = new LinkedList<>(Arrays.asList(2, 4, 0, 3));
        List<Integer> number2 = new LinkedList<>(Arrays.asList(5, 6, 7));
        List<Integer> number3 = addTwoNumbers(number1, number2);
        System.out.println(getIntNumber(number3));
    }

    public static int getIntNumber(List<Integer> lst) {
        int number = 0;
        for (int i = lst.size()-1; i >= 0; i--) {
            if (i == 0) {
                number = number + lst.get(0);
            } else {
                number = number + lst.get(i) * (int) Math.pow(10, i);
            }
        }
        return number;
    }

}
