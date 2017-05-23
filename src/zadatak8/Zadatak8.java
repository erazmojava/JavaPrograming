package zadatak8;


import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak8 {

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()){
            numList.add(s.nextInt());
            if (numList.size() == 5){ // kad je unešeno 5 brojeva scanner se zatvara
                break;
            }
        }


        ArrayList<Integer> sortedList = new ArrayList<>(); //pravimo novu sortiranu listu
        sortedList.add(numList.get(0)); //dodajemo prvi broj u sortiranu listu
        for (int i = 1; i <numList.size(); i++){
            int tempSize = sortedList.size(); // pamtimo belicinu sortirane liste
           for (int j = 0; j< sortedList.size();j++){
               if (numList.get(i) > sortedList.get(j)){ //ako je novi broj veci od brojeva
                   // u sortiranoj listi dodajmo ga ispred tog broja u sortiranoj listi
                   sortedList.add(j, numList.get(i)); //dodaje ispred trenutnog broja u sortiranoj listi
                                                    //ako je veci od tog broja
                   break; //prekida petlju jer dodao broj da ne bi dodavao duplikate
               }
           }
           if (sortedList.size() == tempSize){ //ako se nista nije desilo u drugoj for petlji
                                             //dodajmo na kraj sortirane liste jer je trenutni broj najmanji
               sortedList.add(numList.get(i));
           }
        }
        System.out.println(sortedList.toString()); //ispis liste koristi se metod na listi toString();
    }

}