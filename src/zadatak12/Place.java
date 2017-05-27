package zadatak12;

/**
 * Created by osman on 5/27/17.
 */
public class Place {
    private String country;
    private String city;
    private int postal_code;
    private String street;

    public Place(String country, String city, int postal_code, String street) {
        this.country = country;
        this.city = city;
        this.postal_code = postal_code;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
