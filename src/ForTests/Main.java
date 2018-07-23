package ForTests;

import java.io.*;
import java.text.DateFormat;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        File fl = new File("D:\\test.txt");
        try{
        fl.createNewFile();
        } catch (IOException ex){
            System.out.println(ex);
        }

/*        Calendar dateAndTime = Calendar.getInstance();
        Date dateTime = dateAndTime.getTime();
        String dateTimeStr = dateTime.toString();
        System.out.println(dateTimeStr);
        System.out.println(dateTimeStr);*/


        Date date = new Date();
        System.out.println(date.toString());
    }

}
