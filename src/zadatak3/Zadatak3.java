package zadatak3;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //Scanner obezbjedjuje unos u konzolu
        int smallestPositiveNumber = -1;//posto se trazi najmanji pozitivan broj a ne smije biti 0
                                        //onda defailtna vrijednost treba da bude negativan broj
        while (s.hasNext()){ //s.hasNext() čitaj sa ulaza sve sto dolazi
            int num = s.nextInt(); // num je broj koji je unesen sa tastature
                                  //pošto je kod nas nexInt moramo unijeti cio broj
            if (num == 0) break; //break prekida for petlju i gasi skener

            if (num < 0){ //ako je uneseni broj manji od 0 znaci da je negativan, a mi trazimo
                          // pozitivan broj zato koristimo continue da preskocimo uneseni broj
                continue;
            }
            if (smallestPositiveNumber == -1){ // ako je smallest num -1 znaci nije unsen nijedan pozitivan
                                               //broj znaci da je novi broj najmanji pozitivan broj
                smallestPositiveNumber = num;
            }
            if (num < smallestPositiveNumber){ //ako je novi broj manji od smallest num-a, onda smallest postaje
                                               // novi broj
                smallestPositiveNumber = num;
            }
        }

        //Stringove u javi mozemo sastavljati sa plus-om
        if (smallestPositiveNumber > -1){
            System.out.println("Smallest positive number is: " + smallestPositiveNumber);
        }else {
            System.out.println("All your numbers are negative");
        }
    }
}