package zadatak17;

/**
 * Created by FSC on 14.6.2017.
 */
public class Location {

    private double latitude;
    private double longitude;
    private String city;
    private String country;
    private double zip_code;

    public Location(double latitude, double longitude, String city, String country, double zip_code) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.city = city;
        this.country = country;
        this.zip_code = zip_code;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
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

    public double getZip_code() {
        return zip_code;
    }

    public void setZip_code(double zip_code) {
        this.zip_code = zip_code;
    }
}
