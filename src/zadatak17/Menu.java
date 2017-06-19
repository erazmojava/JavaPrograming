package zadatak17;

import java.util.Date;

/**
 * Created by FSC on 14.6.2017.
 */
public class Menu implements AddMenu {

    private int id;
    private String name;
    private double restoraunt_id;
    private Date date;


    public Menu(int id, String name, double restoraunt_id, Date date) {
        this.id = id;
        this.name = name;
        this.restoraunt_id = restoraunt_id;
        this.date = date;
    }

    public double getId() {
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

    public double getRestoraunt_id() {
        return restoraunt_id;
    }

    public void setRestoraunt_id(double restoraunt_id) {
        this.restoraunt_id = restoraunt_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public void onMenuAdded(Menu menu) throws NameDuplicateException {

    }

}

