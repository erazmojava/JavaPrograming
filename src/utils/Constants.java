package utils;

import zadatak12.Classroom;
import zadatak12.Place;
import zadatak12.School;
import zadatak12.Student;
import zadatak9.Auto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 * Created by osman on 5/15/17.
 */
public class Constants {
    private static final ArrayList<Integer> numberList = new ArrayList<Integer>();
    public static ArrayList<Integer> getNumberList(){
        Random r = new Random();
        for (int i = 0; i< 20; i++){
            numberList.add(r.nextInt(1000) + 1);
        }
        return numberList;
    }
    public static ArrayList<Auto> getAutoList() {
        ArrayList<Auto> autos = new ArrayList();
        autos.add(new Auto("Mazda", 2014, 5, "red", "automatic", "Japan"));
        autos.add(new Auto("Alfa", 2000, 4, "blue", "manual", "Italy"));
        autos.add(new Auto("Golf", 2009, 5, "green", "automatic", "Germany"));
        autos.add(new Auto("Mercedes", 2016, 6, "blue", "manual", "Germany"));
        autos.add(new Auto("Lancia", 2002, 4, "red", "automatic", "Italy"));
        autos.add(new Auto("Yugo", 1990, 4, "green", "manual", "Serbia"));
        autos.add(new Auto("Toyota", 2006, 5, "blue", "manual", "Japan"));
        autos.add(new Auto("Lexus", 2010, 4, "red", "automatic", "China"));
        autos.add(new Auto("Jaguar", 2017, 8, "blue", "automatic", "Great Brittany"));
        return autos;
    }

    public static String getFormatedDate(Date date){
        SimpleDateFormat format =
                new SimpleDateFormat("dd-MM-yyyy");
        return format.format(date);
    }
    public static School getSchool(){
        School school = new School();
        Place schoolPlace = new Place("BiH", "Tuzla", 75000, "Franjevačka");
        ArrayList<Classroom> classrooms = new ArrayList<>();
        classrooms.add(new Classroom("First", 2, 1));
        classrooms.add(new Classroom("Second", 3, 2));
        classrooms.add(new Classroom("Third", 6, 3));
        classrooms.add(new Classroom("Fourth", 4, 4));
        school.setName("FirstSchool");
        school.setPlace(schoolPlace);
        school.setClassrooms(classrooms);
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Armin", 1, new Place("BiH", "Tuzla", 75000, "Ulica55")));
        students.add(new Student("Amir", 2, new Place("BiH", "Tuzla", 75000, "Ulica11")));
        students.add(new Student("Ervin", 1, new Place("BiH", "Tuzla", 75000, "Ulica55")));
        students.add(new Student("Mahir", 3, new Place("BiH", "Tuzla", 75000, "Ulica33")));
        students.add(new Student("Omar", 4, new Place("BiH", "Tuzla", 75000, "Ulica17")));
        students.add(new Student("Emin", 2, new Place("BiH", "Tuzla", 75000, "Ulica44")));
        students.add(new Student("Sabit", 3, new Place("BiH", "Tuzla", 75000, "Ulica44")));
        students.add(new Student("Jasmin", 3, new Place("BiH", "Tuzla", 75000, "Ulica17")));
        school.setStudents(students);
        return school;
    }
}
