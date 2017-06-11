package zadatak16;

import java.util.ArrayList;

/**
 * Created by pc on 7.6.2017.
 */
public class Student extends Person implements CompareStudent {
    private String index_number;
    private School school;

    @Override
    public int onStudentCompare(Student student) {


        return 0;
    }

    public Student(String name, String surname, Integer age, String sex, Place place, String index_number, School school) {
        super(name, surname, age, sex, place);
        this.index_number = index_number;
        this.school = school;
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
}