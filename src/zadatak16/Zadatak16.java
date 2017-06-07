package zadatak16;

import zadatak12.Classroom;

import java.util.ArrayList;

/**
 * Created by osman on 6/5/17.
 */
public class Zadatak16 {
    public static void main(String[] args) {



                ArrayList listaPersona = new ArrayList();
                listaPersona.add(new Person("Mujo", "Mujic", 22, "male", new Place(75000, "Ulica1", "Tuzla", "BiH")));
                listaPersona.add(new Developer("Hasan", "Maliko", 19, "female", new Place(75000, "Ulica2", "Lukavac", "Bih"), 31, "Angular Developer", 3, 1000));
                listaPersona.add(new Employee("Tito", "Broz", 20, "male", new Place(75300, "Ulica3", "Lukavac", "BiH"), "Marketing", 400, "Worker"));
                listaPersona.add(new Student("Amir", "Hasanovic", 33, "male", new Place(75020, "Ulica5", "Mostar", "BiH"), 23223, new School("Škola34"), new Place(75400, "Ulica54", "Modriča", "Bih"), new Classroom("Učionica1", 25, 2366)));
                listaPersona.add(new Developer("Malik", "Mali", 90, "male", new Place(64000, "Ulica8", "Čapljina", "BiH"), 23, "Menadžer", 8, 1200));

                for (Person person : listaPersona) {
                    if (person instanceof Student) {
                        Student student = (Student) person;
                        if (student.getSchool().getName().equals("")){}

                    }
                    if (person instanceof Developer){
                        Developer developer = (Developer)person;
                        developer.onSalaryUpdate(555);
                }

            }
        }
    }
}
