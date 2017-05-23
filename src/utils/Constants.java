package utils;

import zadatak9.Auto;

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
            numberList.add(r.nextInt(1000) + 1);
        }
        return numberList;
    }
    public static ArrayList<Auto> getAutoList() {
        ArrayList<Auto> autos = new ArrayList();
        autos.add(new Auto("Mazda", 2014, 5, "red", "automatic", "Japan"));
        autos.add(new Auto("Alfa", 2000, 4, "blue", "manual", "Italy"));
        autos.add(new Auto("Golf", 2009, 5, "green", "automatic", "Germany"));
        autos.add(new Auto("Mercedes", 2016, 6, "blue", "manual", "Germany"));
        autos.add(new Auto("Lancia", 2002, 4, "red", "automatic", "Italy"));
        autos.add(new Auto("Yugo", 1990, 4, "green", "manual", "Serbia"));
        autos.add(new Auto("Toyota", 2006, 5, "blue", "manual", "Japan"));
        autos.add(new Auto("Lexus", 2010, 4, "red", "automatic", "China"));
        autos.add(new Auto("Jaguar", 2017, 8, "blue", "automatic", "Great Brittany"));
        return autos;
    }
}
