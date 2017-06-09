package zadatak16;

import zadatak12.Classroom;

/**
 * Created by Mahir on 07.06.2017..
 */
public class Student extends Person implements CompareStudent {

    private int index_number;
    private School school;
    private Place place;
    private Classroom classroom;

    public Student(String name, String surname, int age, String sex, Place place, int index_number, School school, Place place1, Classroom classroom) {
        super(name, surname, age, sex, place);
        this.index_number = index_number;
        this.school = school;
        this.place = place1;
        this.classroom = classroom;
    }

    public int getIndex_number() {
        return index_number;
    }

    public void setIndex_number(int index_number) {
        this.index_number = index_number;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
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

    @Override
    public int onCompareStudent(Student student) {

        if (this.school.equals("Škola34")) {
            return 1;
        }
        if (!this.school.getName().equals("Škola34")) {
            return -1;
        }
        if (this.place.getCity().equals("Tuzla")) {
            return 1;
        }
        if (!this.place.getCity().equals("Tuzla")) {
            return -1;
        }

        return 1;
    }
}