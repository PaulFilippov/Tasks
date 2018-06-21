import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LongestSequence {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //заполняем список
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(readString()));
        }

        for (Integer s : list) {
            System.out.println(s);
        }

        getLongestSequence(list);
    }

    public static String readString() {
        String stringFromConsole = null;
        System.out.println("Введите число");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            stringFromConsole = br.readLine();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return stringFromConsole;
    }

    public static void getLongestSequence(List<Integer> list) {
        int maxcount=1;
        int count=1;
        for (int i = 0; i < list.size(); i++) {
            if (i!=list.size()-1){
                if(list.get(i).equals(list.get(i+1))){
                    count++;
                }else{
                    if (maxcount<=count){
                        maxcount=count;
                        count=1;
                    }
                }
            }
            }
            System.out.println(maxcount);
        }
    }

