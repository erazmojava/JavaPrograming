package zadatak12;

import utils.Constants;

import java.util.ArrayList;


public class Zadatak12 {
    public static void main(String[] args) {
        School school = Constants.getSchool();
        ArrayList<Classroom> sortStudent = new ArrayList<>();
        ArrayList<Student> sortStudentClass = new ArrayList<>();
        System.out.println("Zadatak12 a)");
        for (Classroom classroom : school.getClassrooms()) {
            sortStudent.add(classroom);
            for (Student student : school.getStudents()) {
                sortStudentClass.add(student);
            }
        }
        for (Student student : school.getStudents()) {
            if (student.getClassroom_id() == 1) {
                System.out.println("First" + " " + student.getName());


            }
        }

        System.out.println(" ");
        System.out.println("Zadatak12 b)");
        ArrayList<Student> sortUlica = new ArrayList<>();
        ArrayList<Place> sortPlace = new ArrayList<>();
        for (Student student : school.getStudents()) {
            sortUlica.add(student);
        }

        for (Student student : sortUlica) {
            if (student.getPlace().getStreet().equals("Ulica17")) {
                System.out.println(student.getName() + " " + student.getPlace().getStreet());
            }
        }
        System.out.println(" ");
        System.out.println("Zadatak12 c)");
        for (Classroom classroom : school.getClassrooms()) {
            if (classroom.getStudent_count() > 3) {
                System.out.println(classroom.getName() + " " + "count: " + classroom.getStudent_count());
                for (Student student : school.getStudents()) {
                    if (student.getClassroom_id() == classroom.getClassroom_id()) {
                        System.out.println(student.getName());
                    }
                }
            }
        }
    }}








