package zadatak10;

import utils.Constants;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Date;

public class Zadatak10 {

    public static void main(String[] args) {
        ArrayList<Cips> arrayList = new ArrayList<>();
        arrayList.add(new Cips(new Osoba("test", "test",
                26,
                ""),
                "", new Date(new Date().getTime()-587438778),
                ""));

        ArrayList<Cips> sortCips = new ArrayList<>();
        sortCips.add(arrayList.get(0));
        for (int i = 1; i< arrayList.size(); i++){
            int size = sortCips.size();
            for (int j = 0; j< sortCips.size();i++){
                if (sortCips.get(j).getDatum().getTime()<
                        arrayList.get(i).getDatum().getTime()){
                    sortCips.add(j,arrayList.get(i));
                    break;
                }
            }
            if (size == sortCips.size()){
                sortCips.add(arrayList.get(i));
            }

        }

        for (Cips cips : sortCips){
            System.out.println("Datum vađenja: " +
                    Constants.getFormatedDate(cips.getDatum()));
        }
        ArrayList<Osoba> listaOsobe = new ArrayList<>();
        for (Cips cips : arrayList){
            listaOsobe.add(cips.getOsoba());
        }
        ArrayList<Osoba> sortedOsobe = new ArrayList<>();
        sortedOsobe.add(listaOsobe.get(0));
        for (int i = 1; i<listaOsobe.size(); i++){
            int size = sortedOsobe.size();
            for (int j= 0; j< sortedOsobe.size(); j++){
                if (listaOsobe.get(i).getGodine() >
                        sortedOsobe.get(j).getGodine()){
                    sortedOsobe.add(j, listaOsobe.get(i));
                    break;
                }
            }
            if (size == sortedOsobe.size()){
                sortedOsobe.add(listaOsobe.get(i));
            }
        }
        ArrayList<Osoba> osogeGodine = new ArrayList<>();
        for (Osoba osoba : sortedOsobe){
            if (osoba.getGodine() < 33){
                osogeGodine.add(osoba);
            }
        }
        for (Osoba osoba: osogeGodine){
            System.out.println(osoba.getIme() + "  "+ osoba.getGodine());
        }
    }

}