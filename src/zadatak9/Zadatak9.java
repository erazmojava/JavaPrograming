//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package zadatak9;

import java.util.ArrayList;
import java.util.Iterator;

import utils.Constants;

import javax.crypto.AEADBadTagException;

public class Zadatak9 {
    public Zadatak9() {
    }

    public static void main(String[] args) {
        ArrayList<Auto> autos = Constants.getAutoList();
        ArrayList<Auto> yearAutos = new ArrayList();

        for (int i = 1; i < autos.size(); ++i) {
            int size = yearAutos.size();

            for (int j = 0; j < yearAutos.size(); ++j) {
                if ((autos.get(i)).getYear() > (yearAutos.get(j)).getYear()) {
                    yearAutos.add(j, autos.get(i));
                    break;
                }
            }


            if (yearAutos.size() == size) {
                yearAutos.add(autos.get(i));
            }
        }

        System.out.println("Sortirana auta po godini: ");
        for (Auto auto : yearAutos) {
            System.out.println(auto.getYear() + "  " + auto.getName());
        }

        ArrayList<Auto> redAutos = new ArrayList<>();

        System.out.println();
        System.out.println("Crvena auta: ");

        for (Auto auto : autos) {
            if (auto.getColor().equals("red")) {
                redAutos.add(auto);
            }
        }
        for (Auto auto : redAutos) {
            System.out.println(auto.getColor() + "  " + auto.getName());
        }
        ArrayList<Auto> transmisiontypeAutos = new ArrayList<>();

        for (Auto auto : autos) {
            if (auto.getTransmission_type().equals("manual")) {
                transmisiontypeAutos.add(auto);
            }
        }
        System.out.println();
        System.out.println("Sortirana auta po transmision type: ");

        for (Auto auto : transmisiontypeAutos) {
            System.out.println(auto.getTransmission_type() + "  " + auto.getName());
        }

        ArrayList<Auto> countryAutos = new ArrayList();

        for (int i = 1; i < autos.size(); ++i) {
            int size = countryAutos.size();

            for (int j = 0; j < countryAutos.size(); ++j) {
                if ((autos.get(i)).getYear() > (countryAutos.get(j)).getYear()) {
                    countryAutos.add(j, autos.get(i));
                    break;
                }
            }

            if (countryAutos.size() == size) {
                countryAutos.add(autos.get(i));
            }
        }
        System.out.println();
        System.out.println("Sortirana auta po godini i zemlji podrijekla: ");
        for (Auto auto : countryAutos) {
            System.out.println(auto.getYear() + "  " + auto.getCountry() + "  " + auto.getName());
        }


    }
}
