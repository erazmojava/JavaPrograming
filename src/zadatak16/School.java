package zadatak16;

import java.util.ArrayList;

/**
 * Created by pc on 7.6.2017.
 */
public class School {
    private String name;
    private Place place;
    private Classroom classroom;

    public School(String name, Place place, Classroom classroom) {
        this.name = name;
        this.place = place;
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
