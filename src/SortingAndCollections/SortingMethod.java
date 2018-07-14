package SortingAndCollections;

import java.util.Arrays;
import java.util.Random;

public class SortingMethod {


    public static int[] makeArray() {
        int arrayint[] = new int[]{1, 3, 2, 34, 21, 19};
        return arrayint;
    }


    public static int[] makeRandArray(int sizemas) {
        int[] arrayint = new int[sizemas];
        Random random = new Random();
        for (int i = 0; i < sizemas; i++) {
            arrayint[i] = random.nextInt(101) - 50;
        }
        String intArrayString = Arrays.toString(arrayint);
        System.out.println(intArrayString);
        return arrayint;
    }


    /*
Сортировка выбором
Сортировка выбором представляет собой механизм сортировки, который начинается с поиска наименьшего элемента в массиве и размешение его первым.
Затем находится второй наименьший элемент и размещается вторым, и так до тех пор пока весь массив не отсортируется.
    */

    public static void selectionSortInt(int[] arr) {
    /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        for (int i = 0; i < arr.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = arr[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i + 1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) { //если 1й элемент минимальный, то не перезаписываем его в себя же
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }


    /*
Сортировка вставкой
Алгоритм сортировки вставкой просматривает данные в виде двух половинок.
Левая половина отсортированных элементов, правая которые нужно отсортировать.
В каждой итерации, один элемент из правой половины берется и добавляется в левую половину так, что левая половина по-прежнему остается отсортированной.
Сортировка вставкой сортирует за время О(n²)
*/
    private void insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            int key = elements[i];
            int j = i - 1;
            while (j >= 0 && key < elements[j]) {
                elements[j + 1] = elements[j];
                j--;
            }// end while loop
            elements[j + 1] = key;
        }// end for loop
    }



    /*
СОРТИРОВКА МЕТОДОМ ПУЗЫРЬКА (BUBBLE SORT).
Алгоритм проходит массив от начала и до конца, сравнивая попарно соседние элементы, Если элементы стоят в неправильном порядке,
то они меняются местами, таким образом, после первого прохода на конце массива оказывается максимальный элемент (для сортировки по возрастанию).
Затем проход массива повторяется, и на предпоследнем месте оказывается другой наибольший после максимального элемент и т.д.
В итоге, наименьший элемент постепенно перемещается  к началу массива («всплывает» до нужной позиции как пузырёк в воде).
*/

    public static void bubbleSort(int[] arr) {
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        String intArrayString = Arrays.toString(arr);
        System.out.println(intArrayString);
    }


    public static void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }

    static int partition(int arr[], int left, int right)
    {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }


}
