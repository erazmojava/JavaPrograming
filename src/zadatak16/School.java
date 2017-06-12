package zadatak16;

/**
 * Created by Mahir on 07.06.2017..
 */
public class School extends Place {

    private String name;

    public School( String name, double zip_code, String street, String city, String country) {
        super(zip_code, street, city, country);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}