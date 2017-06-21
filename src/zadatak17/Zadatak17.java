package zadatak17;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by osman on 6/14/17.
 */
public class Zadatak17 {
    public static void main(String [] args){
        Calendar c = Calendar.getInstance();
        c.set(2017, 10, 30);
        Date date = c.getTime();
        new Date(2017,10, 30);

        ArrayList<Restaurant> restaurants =new ArrayList<>();
        restaurants.add(new Restaurant(1l,
                20, new Location(555l,5555l,"dsda","ds"),
                "Restodsa", new ArrayList<>()));
        restaurants.get(0).getMenus().add(new Menu("NAme",15l, 1l,
                new Date(2017,10,22)));
        restaurants.get(0).getMenus().add(new Menu("NAme",15l, 1l,
                new Date(2017,10,22)));

        restaurants.add(new Restaurant(1l,
                20, new Location(555l,5555l,"dsda","ds"),
                "Restodsa", new ArrayList<>()));
        restaurants.get(1).getMenus().add(new Menu("NAme",15l, 1l,
                new Date(2017,10,22)));
        restaurants.get(1).getMenus().add(new Menu("NAme",15l, 1l,
                new Date(2017,10,22)));

        try {
            restaurants.get(0).onAddedMenu(new Menu());
        } catch (NameDuplicateException e) {
           System.out.println("MESSAGE: " + e.getMessage());
        }
    }
}
