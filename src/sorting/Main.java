package sorting;

import java.util.*;
import java.util.stream.Collectors;


public class Main {


    public static void main(String args[]) {

    List <Integer> linkdLst = new LinkedList();
    ArrayList <Integer> arrayList = new ArrayList();


//      int myarr [] = {4,3,8,1,2};
//        System.out.println(Arrays.toString(SortingMethod.selectionSortInt(myarr)));


//        List arr = createListWithInt();
//        System.out.println(arr);
//    /*Внешний цикл каждый раз сокращает фрагмент массива,
//      так как внутренний цикл каждый раз ставит в конец
//      фрагмента максимальный элемент*/
//            for (int i = arr.size() - 1; i > 0; i--) {
//                for (int j = 0; j < i; j++) {
//            /*Сравниваем элементы попарно,
//              если они имеют неправильный порядок,
//              то меняем местами*/
//                    if ((int)arr.get(j) < (int)arr.get(j+1)) {
//                        int tmp = (int)arr.get(j);
//                        arr.set(j, (int)arr.get(j+1));
//                        arr.set(j+1, tmp);
//                    }
//                }
//            }
//            System.out.println(arr);

    }


    public static Integer [] sortArr (Integer [] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length-1;j++){
                if (arr[i]>arr[j+1]){
                    int tmp = arr [i];
                    arr [i] = arr [j+1];
                    arr [j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static List createListWithInt (){
        List arrList = new ArrayList(Arrays.asList(3,1,4,8,5,2));
        return arrList;
    }

    public static void merge1(ArrayList<Integer> a, ArrayList<Integer> b) {
        int size = b.size();
        a.ensureCapacity(size * 2);
        for (int i = 0; i < size; i++) {
            a.add(null);
        }
        for (int i = b.size(); i > 0; i--) {
            a.set((i << 1) - 1, b.get(i - 1));
            a.set((i << 1) - 2, a.get(i - 1));
        }
        Iterator<Integer> iter = a.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.println(Integer.toString(a.get(i)));
        }
    }


}
