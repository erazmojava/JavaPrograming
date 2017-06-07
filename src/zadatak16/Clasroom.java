package zadatak16;

/**
 * Created by User on 7.6.2017.
 */
public class Clasroom {
    private String name;
    private int student_count;
    private int classroom_id;

    public Clasroom(String name, int student_count, int classroom_id) {
        this.name = name;
        this.student_count = student_count;
        this.classroom_id = classroom_id;
    }
    public Clasroom(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudent_count() {
        return student_count;
    }

    public void setStudent_count(int student_count) {
        this.student_count = student_count;
    }

    public int getClassroom_id() {
        return classroom_id;
    }

    public void setClassroom_id(int classroom_id) {
        this.classroom_id = classroom_id;
    }
}
