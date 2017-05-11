package zadatak2;

import java.util.ArrayList;

public class Zadatak2 {

    public static void main(String[] args) {
        ArrayList<Radnik> radnikArrayList = new ArrayList<>();
        radnikArrayList.add(new Radnik("Zdravko", "Colic", 1000, 25));
        radnikArrayList.add(new Radnik("Omer", "Omerovic", 1200, 33));
        radnikArrayList.add(new Radnik("Zlatan", "Ibrahimovic", 800, 25));
        radnikArrayList.add(new Radnik("Jasenko", "Isic", 500, 41));
        radnikArrayList.add(new Radnik("Murga", "Drot", 400, 27));
        Radnik plataRadnik = radnikArrayList.get(0);
        Radnik godineRadnik = radnikArrayList.get(0);
        for (Radnik radnik : radnikArrayList){

        }
        System.out.printf("Radnik %s %s ima najveću platu(%s).\n",
                plataRadnik.getIme(), plataRadnik.getPrezime(), plataRadnik.getPlata());
        System.out.printf("Radnik %s %s ima najviše godina(%s).\n",
                godineRadnik.getIme(), godineRadnik.getPrezime(), godineRadnik.getGodine());

    }
}