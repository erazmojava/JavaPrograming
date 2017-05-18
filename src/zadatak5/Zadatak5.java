package zadatak5;

import utils.Constants;

import java.util.ArrayList;

public class Zadatak5 {

    public static void main(String[] args) {
        ArrayList<Integer> numList = Constants.getNumberList();
        ArrayList<Integer> parniLista = new ArrayList<>();
        ArrayList<Integer> neparniLista = new ArrayList<>();
        ArrayList<Integer> pozitivniLista = new ArrayList<>();
        ArrayList<Integer> negativniLista = new ArrayList<>();
        ArrayList<Integer> prostiLista = new ArrayList<>();

        for (Integer num : numList) {
            if (num > 0) {
                pozitivniLista.add(num);
            } else {
                negativniLista.add(num);
            }

            if (num % 2 == 0) {
                parniLista.add(num);
            } else {
                neparniLista.add(num);
            }
        }
        System.out.println("Parni brojevi su :");
        for (Integer parni : parniLista){
            System.out.printf("%d ", parni);
        }
        System.out.println();
        System.out.println("Neparni brojevi su :");
        for (Integer neparni : neparniLista){
            System.out.printf("%d ", neparni);
        }
        System.out.println();
    }
}