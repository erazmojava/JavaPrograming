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
}
