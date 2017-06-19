package Zadatak17;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Mahir on 14.06.2017..
 */
public class Restaurant implements AddMenu {

    private int id;
    private String name;
    private int worker_count;
    private ArrayList<Menu> menus;
    private Location location;

    public Restaurant(int id, String name, int worker_count, ArrayList<Menu> menus, Date date, Location location) {
        this.id = id;
        this.name = name;
        this.worker_count = worker_count;
        this.menus = menus;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorker_count() {
        return worker_count;
    }

    public void setWorker_count(int worker_count) {
        this.worker_count = worker_count;
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public void setMenus(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public void onMenuAdded(Menu menu) throws NameDuplicateException {
        if (this.getMenus().add(menu)){
            throw new NameDuplicateException("Dupli meni");

        }
    }
}







