package Zadatak14;

import java.util.ArrayList;

/**
 * Created by FSC on 31.5.2017.
 */
public class Zadatak14 {
    public static void main(String[] args) {
        ArrayList<Tacka> listaObjekata = new ArrayList<>();
        listaObjekata.add(new Tacka(12, 123));
        listaObjekata.add(new Krug(122, 123, 234, 123, 123));
        listaObjekata.add(new Kvadrat(13, 34, 54, 123, 43, 45));

        for (Object object : listaObjekata) {
            if (object instanceof Krug) {
                Krug krug =(Krug)object;
                System.out.println(krug.getxOsa());
            }


        }
    }
}
