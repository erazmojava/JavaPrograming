package zadatak10;

import utils.Constants;

import java.util.ArrayList;
import java.util.Date;

public class Zadatak10 {

    public static void main(String[] args) {
        ArrayList<Cips> arrayList = new ArrayList<>();
        arrayList.add(new Cips(new Osoba("Omar", "Brbutovic", 12, "Tuzla"), "Tuzla", new Date(new Date().getTime() - 457365938), "Tuzla"));
        arrayList.add(new Cips(new Osoba("Armin", "Babovic", 34, "Sarajevo"), "Sarajevo", new Date(new Date().getTime() - 555136538), "Sarajevo"));
        arrayList.add(new Cips(new Osoba("Tarik", "Dzambic", 45, "Mostar"), "Mostar", new Date(new Date().getTime() - 978336538), "Mostar"));
        arrayList.add(new Cips(new Osoba("Hamza", "Babajic", 26, "Banja Luka"), "Banja Luka", new Date(new Date().getTime() - 1234362538), "Banja Luka"));


        ArrayList<Cips> sortCips = new ArrayList<>();
        sortCips.add(arrayList.get(0));

        for (int i = 1; i < arrayList.size(); i++) {
            int size = sortCips.size();

            for (int j = 0; j < sortCips.size(); j++) {
                if ((sortCips.get(j)).getDatum().getTime() < (arrayList.get(i)).getDatum().getTime()) {
                    sortCips.add(j, arrayList.get(i));
                    break;
                }
            }

            if (sortCips.size() == size) {
                sortCips.add(arrayList.get(i));

            }

        }
        for (Cips cips : sortCips)
            System.out.println("Datum vadenja:" + "  " + Constants.getFormatedDate(cips.getDatum()));
        System.out.println();

        ArrayList<Osoba> listaOsobe = new ArrayList<>();
        for (Cips cips : arrayList) {
            listaOsobe.add(cips.getOsoba());
        }
        ArrayList<Osoba> sortedOsoba = new ArrayList<>();
        sortedOsoba.add(listaOsobe.get(0));
        for (int i = 1; i < listaOsobe.size(); i++) {
            int size = sortedOsoba.size();
            for (int j = 0; j < sortedOsoba.size(); j++) {
                if (listaOsobe.get(i).getGodine() > sortedOsoba.get(j).getGodine()) {
                    sortedOsoba.add(j, listaOsobe.get(i));
                    break;

                }
            }
            if (size == sortedOsoba.size()) {
                sortedOsoba.add(listaOsobe.get(i));
            }
        }
        ArrayList<Osoba> arangeOsobe = new ArrayList<>();
        for (Osoba osoba : sortedOsoba) {
            if (osoba.getGodine() < 33) {
                arangeOsobe.add(osoba);
            }

        }
        for (Osoba osoba : arangeOsobe) {
            System.out.println(" Osobe sa godinama manjim od 33:" + "  " + osoba.getIme() + "  " + osoba.getGodine());



            }
        ArrayList<Cips> tuzlaCips = new ArrayList<>();

        for (Cips cips : arrayList) {
            if (cips.getOpstina().equals("Tuzla")) {
                tuzlaCips.add(cips);
            }
        }
        for (Cips cips : tuzlaCips) {
            System.out.println();
            System.out.println("Cips vaden u Tuzli kod:" + "  " + cips.getOsoba().getIme());
        }
    }
}
