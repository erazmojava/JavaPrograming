package zadatak12;

import zadatak16.Person;

/**
 * Created by osman on 5/27/17.
 */
public class Student extends Person {
    private String name;
    private int classroom_id;
    private Place place;

    public Student(String name, int classroom_id, Place place) {
        this.name = name;
        this.classroom_id = classroom_id;
        this.place = place;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getClassroom_id() {
        return classroom_id;
    }

    public void setClassroom_id(int classroom_id) {
        this.classroom_id = classroom_id;
    }


}

