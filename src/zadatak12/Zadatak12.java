package zadatak12;

import utils.Constants;

import java.util.ArrayList;

/**
 * Created by osman on 5/27/17.
 */
public class Zadatak12 {
    public static void main(String[] args) {
        School school = Constants.getSchool();
        //na klasi student ima lista studenata ima lista classroom-a
        System.out.println("Zadatak12 a)");
        for (Student student : school.getStudents()) {
            for (Classroom classroom : school.getClassrooms()) {
                if (student.getClassroom_id() == classroom.getClassroom_id()) {
                    if (classroom.getName().equals("First")) {
                        System.out.println(classroom.getName() +" " +student.getName());

                    }

                }
            }
        }
        System.out.println("Zadatak12 b) ");
       for(Student student:school.getStudents()){
            if(student.getPlace().getStreet().equals("Ulica17")){
                System.out.println(student.getName()+" "+student.getPlace().getStreet());
            }
       }
       System.out.println("Zadatak12 c) ");
        ArrayList<String> Imena = new ArrayList<>();
        for(Student student:school.getStudents()){
        for(Classroom classroom:school.getClassrooms()){
            if(classroom.getStudent_count()>3){
                if(student.getClassroom_id()==classroom.getClassroom_id()){
                    System.out.println(classroom.getName()+" count: "+ classroom.getStudent_count());
                    System.out.println(student.getName());

                    }
                }
            }

            }
        }
    }


