package SortingAndCollections;

import SortingAndCollections.SortingMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class Main {

    public static void main(String args[]) {

        SortingMethod.bubbleSort(SortingMethod.makeArray());
        SortingMethod.bubbleSort(SortingMethod.makeRandArray(10));

        CollectionTest test1 = new CollectionTest(1, 5);
        CollectionTest test2 = new CollectionTest(1, 5);
        System.out.println(test1 == test2);
        System.out.println(test1.equals(test2));


      int[] array1={2,3,6,1,5,4};
      int array2[]={24,31,63,16,52,47};
     // ArrayList <Integer> list1= new ArrayList <Integer> (Arrays.asList(array1));
     // ArrayList <Integer> list2= new ArrayList <Integer> (Arrays.asList(array2));
     // merge1(list1, list2);

    }


    public static void merge1(ArrayList<Integer> a, ArrayList<Integer> b) {

        int size = b.size();
        a.ensureCapacity(size*2);
        for (int i=0; i<size; i++){
            a.add(null);
        }

        for (int i=b.size(); i>0; i--){
            a.set((i<<1)-1,b.get(i-1));
            a.set((i<<1)-2,a.get(i-1));
        }

    /*    for (ArrayList fio:a.size()){
            System.out.println(fio);
        }*/

        Iterator<Integer> iter = a.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        for(int i=0; i<a.size();i++){
            System.out.println(Integer.toString(a.get(i)));
        }

    }

}
