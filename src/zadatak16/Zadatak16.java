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
        listaPersona.add(new Person("Mujo", "Mujic", 22, "male", new Place(75000, "Ulica1", "Tuzla", "BiH")));
        listaPersona.add(new Developer("Hasan", "Maliko", 19, "female", new Place(75000, "Ulica2", "Lukavac", "Bih"), 31, "Angular Developer", 3, 1000));
        listaPersona.add(new Employee("Tito", "Broz", 20, "male", new Place(75300, "Ulica3", "Lukavac", "BiH"), "Marketing", 400, "Worker"));
        listaPersona.add(new Student("Amir", "Hasanovic", 33, "male", new Place(75020, "Ulica5", "Tuzla", "BiH"), 23223, new School("Škola34"), new Place(75400, "Ulica54", "Tuzla", "Bih"), new Classroom("Učionica1", 25, 2366)));
        listaPersona.add(new Developer("Caco", "Mali", 40, "male", new Place(64000, "Ulica8", "Čapljina", "BiH"), 23, "Menadžer", 8, 1200));

        System.out.println("Škola34" + " " + "Tuzla");
        for (Object person : listaPersona) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.getSchool().getName().equals("Škola34") && student.getPlace().getCity().equals("Tuzla")) {
                    System.out.println(student.getName());

                }

            }
            if (person instanceof Developer) {
                Developer developer = (Developer) person;
                developer.onSalaryUpdate(100);
                System.out.println(developer.getName()+ " " + developer.getSalary());


                Person person1 = (Person) person;
                if (person1.getName().charAt(0) == 'C' && person1.getAge() < 22) {
                    System.out.println(person1.getName());
                }

            }
            if (person instanceof CompareStudent){
                Person person1 = (Person)person;
                System.out.println(person1.getName());
            }
            if (person instanceof Employee){
                Employee employee = (Employee)person;
                if (employee.getSalary()<1000 && employee.getSex().equals("male")){
                    System.out.println(employee.getName()+ " " + employee.getSurname() + " " + employee.getSalary());
                }
            }
        }


    }


}