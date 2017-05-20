package zadatak8;


import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak8 {

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()){
            numList.add(s.nextInt());
            if (numList.size() == 5){
                break;
            }
        }


        ArrayList<Integer> tempList = new ArrayList<>();
        tempList.add(numList.get(0));
        for (int i = 1; i <numList.size(); i++){
            int tempSize = tempList.size();
           for (int j = 0; j< tempList.size();j++){
               if (numList.get(i) > tempList.get(j)){
                   tempList.add(j, numList.get(i));
                   break;
               }
           }
           if (tempList.size() == tempSize){
               tempList.add(numList.get(i));
           }
        }
        System.out.println(tempList.toString());
    }

}