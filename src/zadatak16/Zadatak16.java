package zadatak16;

import zadatak12.Classroom;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by osman on 6/5/17.
 */
public class Zadatak16 {
    public static void main(String[] args) {


        ArrayList listaPersona = new ArrayList();
        listaPersona.add(new Person("Mujo", "Mujic", 22, "male", 75000, "Street1", "Tuzla", "BiH"));
        listaPersona.add(new Developer("Hasan", "Maliko", 19, "female", 75000, "Street1", "Tuzla", "BiH", 31, "Angular Developer", 3, 000));
        listaPersona.add(new Employee("Tito", "Broz", 20, "male", 75200, "Street221", "Lukavac", "BiH", "Marketing", 400, "Worker"));
        listaPersona.add(new Student("Amir", "Hasanovic", 33, "male", 75020, "Street61", "Tuzla", "BiH", "II-33/01", new School("OneSchool", 75000, "Street0", "Tuzal", "BiH"), new zadatak16.Classroom("First", 33, 1)));
        listaPersona.add(new Developer("Malik", "Mali", 18, "male", 75000, "Street1", "Tuzla", "BiH", 23, "Menadžer", 8, 1200));


        for (Object person : listaPersona) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.getSchool().getName().equals("OneSchool") && student.getCity().equals("Tuzla")) {
                    System.out.println("OneSchool u Tuzli; ");
                    System.out.println(student.getName() + " " + student.getSchool().getName() + " " + student.getCity());
                    System.out.println();

                }

            }
            if (person instanceof Developer) {
                Developer developer = (Developer) person;
                developer.onSalaryUpdate(100);
                System.out.println("Bonus na platu; ");
                System.out.println(developer.getName() + " " + developer.getSalary());
                System.out.println();


            }


            Person person1 = (Person) person;
            if (person1.getName().charAt(0) == 'M' && person1.getAge() < 22) {
                System.out.println("Ime počinje sa M i godine manje od 22; ");
                System.out.println(person1.getName() + " " + person1.getAge());
                System.out.println();

            }


            if (person instanceof CompareStudent) {
                Person person2 = (Person) person;
                System.out.println("Instanca CompareStudenta; ");
                System.out.println(person1.getName() + " " + person1.getSurname());
                System.out.println();

            }
            if (person instanceof Employee) {
                Employee employee = (Employee) person;
                if (employee.getSalary() < 1000 && employee.getSex().equals("male")) {
                    System.out.println("Manje od 1000, male; ");
                    System.out.println(employee.getName() + " " + employee.getSurname() + " " + employee.getSalary());
                    System.out.println();

                }
            }
        }


    }

}
