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
        ArrayList<Auto> sortAutos = new ArrayList();

        sortAutos.add(autos.get(0));
        for (int i = 1; i < autos.size(); ++i) {
            int size = sortAutos.size();

            for (int j = 0; j < sortAutos.size(); ++j) {
                if ((autos.get(i)).getYear() > (sortAutos.get(j)).getYear()) {
                    sortAutos.add(j, autos.get(i));
                    break;
                }
            }

            if (sortAutos.size() == size) {
                sortAutos.add(autos.get(i));
            }
        }

        System.out.println("Sortirana auta po godini: ");
        for (Auto auto : sortAutos) {
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

        ArrayList<Auto> italijaAutos = new ArrayList<>();
        System.out.println();
        System.out.println("Auta koja nisu Italijanska: ");
        for (Auto auto : autos) {
            if (!auto.getCountry().equals("Italy")) {
                italijaAutos.add(auto);
            }
        }
            for (Auto auto1 : italijaAutos) {
                System.out.println((auto1.getCountry() + "  " + auto1.getName()));
            }
        }
    }

