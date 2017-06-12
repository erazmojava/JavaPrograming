package zadatak16;

/**
 * Created by Mahir on 07.06.2017..
 */
public class Classroom {

    private String name;
    private double student_count;
    private double clasroom_id;

    public Classroom(String name, double student_count, double clasroom_id) {
        this.name = name;
        this.student_count = student_count;
        this.clasroom_id = clasroom_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStudent_count() {
        return student_count;
    }

    public void setStudent_count(double student_count) {
        this.student_count = student_count;
    }

    public double getClasroom_id() {
        return clasroom_id;
    }

    public void setClasroom_id(double clasroom_id) {
        this.clasroom_id = clasroom_id;
    }
}
