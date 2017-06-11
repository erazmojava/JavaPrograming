package zadatak16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


/**
 * Created by osman on 6/5/17.
 */
public class Zadatak16 {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("Mujo", "Mujic", 22, "male",
                new Place(7500, "Street", "Tuzla", "BiH")));
        personArrayList.add(new Person("Cile", "Cilic", 20, "male",
                new Place(7500, "Street", "Tuzla", "BiH")));
        personArrayList.add(new Developer("Hasan", "Maliko", 19, "famale",
                new Place(75200, "Street1", "Tuzla", "BiH"),
                31, "Angular Deveoper", 3, 4000));
        personArrayList.add(new Developer("Malik", "Mali", 40, "male",
                new Place(75200, "Street1", "Tuzla", "BiH"),
                30, "Angular Deveoper", 8, 2000));
        personArrayList.add(new Developer("Emir", "Topic", 30, "male",
                new Place(75200, "Street1", "Tuzla", "BiH"),
                30, "Angular Deveoper", 8, 5000));
        personArrayList.add(new Employee("Tito", "Broz", 26, "male",
                new Place(75200, "Street221", "Lukavac", "BiH"),
                "Marketing", 400, "Worker"));
        personArrayList.add(new Employee("Osmo", "Dedic", 26, "male",
                new Place(75200, "Street221", "Lukavac", "BiH"),
                "Marketing", 4200, "Worker"));
        personArrayList.add(new Student("Amer", "Hasanovic", 33, "male",
                new Place(75020, "Street61", "Mostar", "BiH"), "II-33/01",
                new School("SchoolOne", new Place(75000, "Street0", "Tuzla", "BiH"),
                        new Classroom("First", 33, 1))));
        personArrayList.add(new Student("Amor", "Hasic", 43, "male",
                new Place(75020, "Street1", "Tuzla", "BiH"), "II-33/01",
                new School("SchoolOne", new Place(75000, "Street0", "Tuzla", "BiH"),
                        new Classroom("First", 33, 1))));


        System.out.println("1. Ispisati sve Studente koji idu u skolu sa imenom \"SchoolOne\" i koja se nalazi u Tuzli:");
        for (Person person : personArrayList) {
            if (person instanceof Student)
                if (((Student) person).getSchool().getName().equals("SchoolOne") &&
                        ((Student) person).getSchool().getPlace().getCity().equals("Tuzla")) {
                    System.out.println(person.getName() + " " + ((Student) person).getSchool().getPlace().getCity());
                }
        }


        System.out.println("2. Svakom Developeru povecati salary za 100, i sortitati ih po visini salary-a:");
        for (Person person : personArrayList) {
            if (person instanceof Developer) {
                ((Developer) person).onSalaryUpdate(100);


                System.out.println(person.getName() + " " + ((Developer) person).getSalary());
            }

        }


        System.out.println("3. Ispisati sve Person-e cije ime poćinje sa slovom \"C\", i koja je mlađa od 22 godine:");
        for (Person person : personArrayList) {
            char c = person.getName().charAt(0);
            String temp = Character.toString(c);
            if (temp.equals("C") && person.getAge() < 22) {
                System.out.println(person.getName() + " " + person.getAge());
            }
        }


        System.out.println("4. Ispisati sve Person-e koji su instanca CompareStudent");
        for (Person person : personArrayList) {
            if (person instanceof CompareStudent) {
                System.out.println(person.getName());
            }
        }

        System.out.println(" 5. Ispisati Employee-a koji ima platu vecu od 1000, i koji je muškarac.");
        for (Person person : personArrayList) {
            if (person instanceof Employee)
                if (((Employee) person).getSalary() > 1000 &&
                        person.getSex().equals("male")) {
                    System.out.println(person.getName() + " " + ((Employee) person).getSalary() + " " + person.getSex());
                }
        }
    }


}