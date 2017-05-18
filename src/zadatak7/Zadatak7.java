package zadatak7;

import java.util.Scanner;

public class Zadatak7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()){
            int num = s.nextInt();
            for(int i = 0; i< num; i++){ //petlja za novi red
                for (int j=num-i ;j>0 ; j--){ //petlja za zvijezde
                                              //pošto je i uvijek veće za jedan, a nama treba broj zvijezda
                                              //da je manji za jedan, logično da cemo uupan broj redova
                                              //umanivat za vrijednost i
                    System.out.print("*");
                }
                System.out.println();
            }

                break;
        }
    }

}