package zadatak12;

import utils.Constants;

import java.util.ArrayList;

/**
 * Created by osman on 5/27/17.
 */
public class Zadatak12 {
    public static void main(String [] args){
       School school = Constants.getSchool();
       /////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Zadatak12 a)");
        for (Student student : school.getStudents()){
           for (Classroom classroom : school.getClassrooms()){
               if (classroom.getName().equals("First") && student.getClassroom_id() == classroom.getClassroom_id()){
                   System.out.println(classroom.getName()+ "  " + student.getName());
               }
           }

       }
       ///////////////////////////////////////////////////////////////////////////////////////////
       System.out.println();
       System.out.println("Zadatak12 b)");
        for (Student student : school.getStudents()){
           if (student.getPlace().getStreet().equals("Ulica17")){
               System.out.println(student.getName() +"  " + student.getPlace().getStreet());
           }
        }
        ///////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();
        System.out.print("Zadatak12 c)");
        for (Classroom classroom : school.getClassrooms()){
            if (classroom.getStudent_count() > 3){
                System.out.println();
                System.out.println(classroom.getName() +"  count: "+classroom.getStudent_count());
                for (Student student : school.getStudents()){
                    if (student.getClassroom_id() == classroom.getClassroom_id()){
                        System.out.println(student.getName());
                    }
                }
            }
        }
        //////////////////////////////////////////////////////////////////////////////////////////
    }
}
