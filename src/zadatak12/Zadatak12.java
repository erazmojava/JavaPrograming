package zadatak12;

import utils.Constants;

import java.util.ArrayList;

public class Zadatak12 {
    public static void main(String[] args) {
        School school = Constants.getSchool();      //na klasi student ima lista studenata ima lista classroom-a
        System.out.println("Zadatak12 a)");
        ArrayList<Classroom> classrooms = Constants.getSchool().getClassrooms();
        ArrayList<Student> students = Constants.getSchool().getStudents();

        for (Classroom classroom : classrooms) {
            if (classroom.getName().equals("First")) {
                for (Student student : students) {
                    if (student.getClassroom_id() == 1) {
                        System.out.println(student.getName() + "  " + classroom.getName());


                    }
                }
            }
        }
        System.out.println();
        System.out.println("Zadatak12 b)");


        for (Student student : students) {
            if (student.getPlace().getStreet().equals("Ulica17")) {
                System.out.println(student.getName() + "  " + student.getPlace().getStreet());

            }
        }
        System.out.println();
        System.out.println("Zadatak12 c)");


        for (Classroom classroom : classrooms) {
            if (classroom.getStudent_count() > 3){
                System.out.println(classroom.getName() + "   " + classroom.getStudent_count());

            }
        }
    }
}