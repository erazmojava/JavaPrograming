package zadatak17;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by FSC on 14.6.2017.
 */
public class zadatak17 {
    public static void main(String[] args) {


        ArrayList<Restaurant> restoraunts = new ArrayList();
        restoraunts.add(new Restaurant(12,23,"Tuzla", "BiH", 75000,1,"Sedra",5,new ArrayList<Menu>()));
        restoraunts.get(0).getMenus().add(new Menu(1,"menu1",1,new Date(2017,10,14)));
        restoraunts.get(0).getMenus().add(new Menu(2,"menu2",1,new Date(2017,6,15)));
        restoraunts.get(0).getMenus().add(new Menu(3,"menu3",1,new Date(2017,11,17)));
        restoraunts.add(new Restaurant(121,233,"Tuzla", "BiH", 75000,2,"Limenka",6,new ArrayList<Menu>()));
        restoraunts.get(1).getMenus().add(new Menu(1,"menu1",2,new Date(2017,6,14)));
        restoraunts.get(1).getMenus().add(new Menu(2,"menu2",2,new Date(2017,10,15)));
        restoraunts.get(1).getMenus().add(new Menu(3,"menu3",2,new Date(2017,11,17)));
        restoraunts.add(new Restaurant(1212,2331,"Tuzla", "BiH", 75000,3,"Sarajka",7,new ArrayList<Menu>()));
        restoraunts.get(2).getMenus().add(new Menu(1,"menu1",3,new Date(2017,6,14)));
        restoraunts.get(2).getMenus().add(new Menu(2,"menu2",3,new Date(2017,11,15)));
        restoraunts.get(2).getMenus().add(new Menu(3,"menu3",3,new Date(2017,10,17)));


        for (Restaurant restaurant : restoraunts){
            for (Menu menu : restaurant.getMenus()){
                if (menu.getDate().getMonth()==10){
                    System.out.println("Menu sa 10-im mjesecom");
                    System.out.println(restaurant.getIme() +"   "+ menu.getId() +"   "+ menu.getDate().getMonth());
                }

            }

        }

    }
}
