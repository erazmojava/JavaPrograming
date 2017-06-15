package zadatak17;

import java.util.ArrayList;

/**
 * Created by osman on 6/14/17.
 */
public class Restaurant {
    private Long id;
    private int worker_count;
    private Location location;
    private String name;
    private ArrayList<Menu> menus;

    public Restaurant(Long id, int worker_count, Location location, String name, ArrayList<Menu> menus) {
        this.id = id;
        this.worker_count = worker_count;
        this.location = location;
        this.name = name;
        this.menus = menus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getWorker_count() {
        return worker_count;
    }

    public void setWorker_count(int worker_count) {
        this.worker_count = worker_count;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public void setMenus(ArrayList<Menu> menus) {
        this.menus = menus;
    }
}
