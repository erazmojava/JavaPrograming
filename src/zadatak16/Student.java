package zadatak16;

/**
 * Created by User on 7.6.2017.
 */
public class Student extends Person implements CompareStudent{
    private int index_number;
    private School school;

    public Student(String name, String surname, int age, String sex, Place place, int index_number, School school) {
        super(name, surname, age, sex, place);
        this.index_number = index_number;
        this.school = school;
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

    @Override
    public int onStudentCompare(Student student) {
        if (this.index_number > student.getIndex_number()){
            return  1;
        }
        if (this.index_number < student.getIndex_number()){
            return  -1;
        }
        return 0;
    }
}
