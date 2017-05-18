package zadatak1;

import java.util.ArrayList;

public class Zadatak1 {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>(); //lista brojeva
        numberList.add(1); //dodajemo novi elemet u listu
        numberList.add(3);
        numberList.add(14);
        numberList.add(7);
        numberList.add(0);
        int total = 0; // kreiramo varijablu tipa int i postavljamo joj vrijednost na 0
        int maxElement = 0; //početni maksimalni element
        double avgValue;

        for (Integer number : numberList){ //iterativna for petlja
            if (maxElement < number){ //slučaj da je maximalni element manji
                                           // od novog elementa, novi element postaje maksimalni
                maxElement = number;
            }
            total+=number; // varijabla total se svaki put povecava za vrijednost varijable number
        }
        avgValue = total/numberList.size();
        //System.out.printf za ispisiavnje u konzoli %s znaci bilo koji tip \n novi red
        // %s -String
        // %d -double, Integer
        System.out.printf("Najveci element niza je: %s\n", maxElement);
        System.out.printf("Zbir elemenata je: %s\n", total);
        System.out.printf("Prosjecna vrijenost niza je: %s\n", avgValue);
    }
}