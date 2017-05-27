package zadatak12;

import java.util.ArrayList;

/**
 * Created by osman on 5/27/17.
 */
public class School {
    private String name;
    private ArrayList<Classroom> classrooms;
    private Place place;
    private ArrayList<Student> students;

    public School() {
    }

    public School(String name, ArrayList<Classroom> classrooms, Place place) {
        this.name = name;
        this.classrooms = classrooms;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(ArrayList<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
