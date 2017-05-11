package zadatak1;

import java.util.ArrayList;

public class Zadatak1 {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(3);
        numberList.add(14);
        numberList.add(7);
        numberList.add(0);
        int total = 0;
        int maxElement = 0;
        double avgValue;

        for (Integer number : numberList){ //iterativna for petlja
            if (maxElement < number){
                maxElement = number;
            }
            total+=number;
        }
        avgValue = total/numberList.size();
        //System.out.printf za ispisiavnje u konzoli %s znaci bilo koji tip \n novi red
        System.out.printf("Najveci element niza je: %s\n", maxElement);
        System.out.printf("Zbir elemenata je: %s\n", total);
        System.out.printf("Prosjecna vrijenost niza je: %s\n", avgValue);
    }
}