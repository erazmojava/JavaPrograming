package zadatak16;

/**
 * Created by User on 7.6.2017.
 */
public class School extends Place{
    private String name;
    private Clasroom clasroom;

    public School(int zip_code, String street, String city, String country, String name, Clasroom clasroom) {
        super(zip_code, street, city, country);
        this.name = name;
        this.clasroom = clasroom;
    }

    public School(String name, Clasroom clasroom) {
        this.name = name;
        this.clasroom = clasroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clasroom getClasroom() {
        return clasroom;
    }

    public void setClasroom(Clasroom clasroom) {
        this.clasroom = clasroom;
    }
    public School(){}
}
