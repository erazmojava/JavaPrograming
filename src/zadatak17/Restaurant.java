package zadatak17;

import java.util.ArrayList;

/**
 * Created by FSC on 14.6.2017.
 */
public class Restaurant extends Location implements AddMenu{

    private int id;
    private String ime;
    private double worker_count;
    private ArrayList<Menu> menus;

    public Restaurant(double latitude, double longitude, String city, String country, double zip_code, int id, String ime, double worker_count, ArrayList<Menu> menus) {
        super(latitude, longitude, city, country, zip_code);
        this.id = id;
        this.ime = ime;
        this.worker_count = worker_count;
        this.menus = menus;
    }

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getWorker_count() {
        return worker_count;
    }

    public void setWorker_count(double worker_count) {
        this.worker_count = worker_count;
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }


    @Override
    public void onMenuAdded(Menu menu) throws NameDuplicateException {
        if(this.getMenus().contains(menu))
            throw new NameDuplicateException("Message");
        else
            this.getMenus().add(menu);
    }
}
