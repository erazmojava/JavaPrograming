package Zadatak17;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Mahir on 14.06.2017..
 */
public class Zadatak17 {
    public static void main (String [] args) {
        Calendar c =Calendar.getInstance();
        c.set(2017, 10, 30 );
        ArrayList<Restaurant> listaRestorana = new ArrayList();
        listaRestorana.add(new Restaurant(01, "Restoran1",
                20,new ArrayList<Menu>(), new Date(2017, 7, 12), new Location(555, 233, "Tuzla", "BiH", 75000)));
        listaRestorana.get(0).getMenus().add(new Menu(01, "Meni13", 222, new Date(2017, 10, 12)));
        listaRestorana.get(0).getMenus().add(new Menu(01, "Meni12", 222, new Date(2017, 9, 12)));
        listaRestorana.get(0).getMenus().add(new Menu(01, "Meni11", 222, new Date(2017, 8, 12)));
        listaRestorana.add(new Restaurant(01, "Restoran1",
                20,new ArrayList<Menu>(), new Date(2017, 7, 12), new Location(555, 233, "Tuzla", "BiH", 75000)));
        listaRestorana.get(1).getMenus().add(new Menu(01, "Meni8", 222, new Date(2017, 7, 12)));
        listaRestorana.get(1).getMenus().add(new Menu(01, "Meni7", 222, new Date(2017, 6, 12)));
        listaRestorana.get(1).getMenus().add(new Menu(01, "Meni5", 222, new Date(2017, 5, 12)));
        listaRestorana.add(new Restaurant(01, "Restoran1",
                20,new ArrayList<Menu>(), new Date(2017, 7, 12), new Location(555, 233, "Tuzla", "BiH", 75000)));
        listaRestorana.get(2).getMenus().add(new Menu(01, "Ime", 234, new Date(2017, 4, 12)));
        listaRestorana.get(2).getMenus().add(new Menu(01, "Meni4", 222, new Date(2017, 3, 12)));
        listaRestorana.get(2).getMenus().add(new Menu(01, "Meni2", 222, new Date(2017, 10, 12)));


        AddMenu addMenu =  new Menu(01, "Ime", 234, new Date(2017, 4, 12));
        for (Restaurant restaurant : listaRestorana) {
            for (Menu menu1 : restaurant.getMenus()) {
                try {
                    if (addMenu.equals(menu1.getDate().getDate())) {
                    }
                    throw new NameDuplicateException();
                } catch (NameDuplicateException a) {
                    a.printStackTrace();
                }
            }
        }

        for (Restaurant restaurant : listaRestorana )
                for (Menu menu1 : restaurant.getMenus()){
                if (menu1.getDate().getMonth()== 10){
                    System.out.println(menu1.getName());
                }





                            }
                        }
                       }















