package zadatak3;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int smallestPositiveNumber = -1;
        while (s.hasNext()){
            int num = s.nextInt();
            if (num == 0) break;

            if (num < 0){
                continue;
            }
            if (smallestPositiveNumber == -1){
                smallestPositiveNumber = num;
            }
            if (num < smallestPositiveNumber){
                smallestPositiveNumber = num;
            }
        }
        if (smallestPositiveNumber > -1){
            System.out.println("Smallest positive number is: " + smallestPositiveNumber);
        }else {
            System.out.println("All your numbers are negative");
        }
    }
}