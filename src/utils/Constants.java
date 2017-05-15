package utils;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by osman on 5/15/17.
 */
public class Constants {
    private static final ArrayList<Integer> numberList = new ArrayList<Integer>();
    public static ArrayList<Integer> getNumberList(){
        Random r = new Random();
        for (int i = 0; i< 20; i++){
            numberList.add(r.nextInt());
        }
        return numberList;
    }
}
