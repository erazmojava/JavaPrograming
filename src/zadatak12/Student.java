package zadatak12;

/**
 * Created by osman on 5/27/17.
 */
public class Student {
    private String name;
    private int classroom_id;
    private Place place;

    public Student(String name, int classroom_id, Place place) {
        this.name = name;
        this.classroom_id = classroom_id;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassroom_id() {
        return classroom_id;
    }

    public void setClassroom_id(int classroom_id) {
        this.classroom_id = classroom_id;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
