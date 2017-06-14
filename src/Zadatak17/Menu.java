package Zadatak17;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Mahir on 14.06.2017..
 */
public class Menu {
    private int id;
    private String name;
    private double restaurant_id;
    private Date date;

    public Menu(int id, String name, double restaurant_id, Date date) {
        this.id = id;
        this.name = name;
        this.restaurant_id = restaurant_id;
        this.date = date;
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

    public double getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(double restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}


