package zadatak16;

/**
 * Created by User on 7.6.2017.
 */
public class Place {
    private int zip_code;
    private String street;
    private String city;
    private String country;

    public Place(int zip_code, String street, String city, String country) {
        this.zip_code = zip_code;
        this.street = street;
        this.city = city;
        this.country = country;
    }
    public Place(){

    }

    public int getZip_code() {
        return zip_code;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
