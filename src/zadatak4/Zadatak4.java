package zadatak4;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite dva broja i operaciju koju zelite izvrsiti.");
        int i = 0;
        double firstNumber = 0;
        double secondNumber = 0;
        String operation = "+";

        System.out.printf("Prvi broj: ");
        while (s.hasNext()){
            if(i == 0){
                firstNumber = s.nextDouble();
                System.out.printf("Drugi broj: ");
            }
            if(i == 1){
                secondNumber = s.nextDouble();
                System.out.printf("Operacija: ");
            }
            if(i == 2){
                s.nextLine();
                operation = s.nextLine();
                s.close();
                break;
            }

            i++;
        }
        System.out.printf("Rezultat ove operacije je: %s", getResult(firstNumber,secondNumber, operation));
    }

    public static double getResult(double first, double second, String operation){
       return 0;
    }
}