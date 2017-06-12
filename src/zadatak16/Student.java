package zadatak16;

import zadatak16.School;
import zadatak16.Classroom;


/**
 * Created by Mahir on 07.06.2017..
 */
public class Student extends Person implements CompareStudent {

    private String index_number;
    private School school;
    private Classroom classroom;

    public Student(String name, String surname, int age, String sex, double zip_code, String street, String city, String country, String index_number, School school, Classroom classroom) {
        super(name, surname, age, sex, zip_code, street, city, country);
        this.index_number = index_number;
        this.school = school;
        this.classroom = classroom;
    }

    public String getIndex_number() {
        return index_number;
    }

    public void setIndex_number(String index_number) {
        this.index_number = index_number;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public String onCompareStudent(Student student) {

        if (this.school.equals(school.getName())) {
            return null;
        }


        return null;
    }
}