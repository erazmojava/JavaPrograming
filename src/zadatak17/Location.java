package zadatak17;

/**
 * Created by osman on 6/14/17.
 */
public class Location {
    private Long latitude;
    private Long longitude;
    private String city;
    private String country;

    public Location(Long latitude, Long longitude, String city, String country) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.city = city;
        this.country = country;
    }
}
