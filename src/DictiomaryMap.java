import java.util.*;

public class DictiomaryMap {

    public static void main(String[] args) {
        removeItemFromMap1(createMap());
    }

    public static Map<String, Integer> createMap() {
        Map<String, Integer> dictionary = new HashMap<String, Integer> ();
        dictionary.put("Сидоров", 1000);
        dictionary.put("Петров", 900);
        dictionary.put("Иванов", 400);
        dictionary.put("Степанов", 500);
        dictionary.put("Ыыыыы", 1000);
        dictionary.put("вверер", 900);
        dictionary.put("Иегнлоенл", 300);
        dictionary.put("уерпивв", 600);
        dictionary.put("онгблвакнор", 200);
        dictionary.put("щгжано", 100);
        return dictionary;
    }

    public static void removeItemFromMap1(Map<String, Integer> hmap) {
        Iterator itr = hmap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            if ((int)entry.getValue() < 500)
            {
                itr.remove();
            }
        }

        Iterator iterator = hmap.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Integer> pair = (Map.Entry<String, Integer>) iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + ":" + value);
        }

    }


}
