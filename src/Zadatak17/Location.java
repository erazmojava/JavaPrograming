package Zadatak17;

/**
 * Created by Mahir on 14.06.2017..
 */
public class Location {
    private double latitude;
    private double longtitude;
    private String city;
    private String country;
    private double zip_code;

    public Location(double latitude, double longtitude, String city, String country, double zip_code) {
        this.latitude = latitude;
        this.longtitude = longtitude;
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

    public double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
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
