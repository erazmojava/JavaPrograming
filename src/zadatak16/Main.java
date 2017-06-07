package zadatak16;

import java.util.ArrayList;

/**
 * Created by User on 7.6.2017.
 */
public class Main {
    public static void main(String[] args){
        ArrayList<Person> newList= new ArrayList<>();

        newList.add(new Person("Suljo","Suljic",22,"Muski"));
        newList.add(new Person("mujo", "mujic",33,"Muski"));
        newList.add(new Person("Fata", "Fatic",44,"Zenski"));
        newList.add(new Person("Maja","majic",66,"Zenski"));
        newList.add(new Person("Jana","Janic",61,"Zenski"));

        Person person= new Person();

    }

}
