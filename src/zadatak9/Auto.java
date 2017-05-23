package zadatak9;

/**
 * Created by osman on 5/22/17.
 */
public class Auto {
    private String name;
    private int year;
    private int transmission_steps;
    private String color;
    private String transmission_type;
    private String country;

    public Auto(String name, int year, int transmission_steps,
                String color, String transmission_type, String country) {
        this.name = name;
        this.year = year;
        this.transmission_steps = transmission_steps;
        this.color = color;
        this.transmission_type = transmission_type;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTransmission_steps() {
        return transmission_steps;
    }

    public void setTransmission_steps(int transmission_steps) {
        this.transmission_steps = transmission_steps;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission_type() {
        return transmission_type;
    }

    public void setTransmission_type(String transmission_type) {
        this.transmission_type = transmission_type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
