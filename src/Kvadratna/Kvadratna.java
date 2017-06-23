package Kvadratna;

import java.util.Scanner;

/**
  Created by Omar on 22.06.2017..
 */
public class Kvadratna {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite tri broja: ");
        int i = 0;
        double a = 0;
        double b = 0;
        double c = 0;
        double d;
        double x1 = 0;
        double x2 = 0;
        String y;

        System.out.printf("Prvi broj (a): ");
        while (s.hasNext()) {
            if (i == 0) {
                a = s.nextDouble();
                System.out.printf("Drugi broj (b): ");
            }
            if (i == 1) {
                b = s.nextDouble();
                System.out.printf("Treci broj (c): ");
            }
            if (i == 2) {
                c = s.nextDouble();
                break;
            }

            i++;
        }


        d = ((b * b) - 4 * a * c);


        if (d == 0) {
            x1 = -b / 2 * a;
            x2 = x1;
            System.out.println("Funkcija ima jedno rjesenje x1=x2=" + x1);

        }

        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / 2 * a;
            x2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("Funkcija ima 2 rjesenja: ");
            System.out.println("x1=" + x1 +"   " + "x2=" + x2);
        }
        if (d < 0) {

            d = ((b * b) - 4 * a * c)*(-1);

            System.out.println("Rjesenja funkcije nisu realna");
            System.out.println("x1=" + (-b+"+" + "y*y" + Math.sqrt(d))+"/"+2*a );
            System.out.println("x2=" + (-b+"-" + "y*y" + Math.sqrt(d))+"/"+2*a );

        }


    }
}
