package zadatak17;

import java.util.Date;

/**
 * Created by osman on 6/14/17.
 */
public class Menu {
    private String name;
    private Long id;
    private Long restaurant_id;
    private Date date;

    public Menu(String name, Long id, Long restaurant_id, Date date) {
        this.name = name;
        this.id = id;
        this.restaurant_id = restaurant_id;
        this.date = date;
    }
    public Menu(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(Long restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
