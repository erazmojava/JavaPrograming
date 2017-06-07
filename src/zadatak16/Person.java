package zadatak16;

/**
 * Created by Mahir on 07.06.2017..
 */
public class Person implements ComparePerson {

    private String name;
    private String surname;
    private int age;
    private String sex;
    private Place place;

    public Person(String name, String surname, int age, String sex, Place place) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public int onPersonCompare(Person person) {
        if (this.age > person.getAge()) {
            return 1;
        }
        if (this.age < person.getAge()){
            return -1;
        }
        if (this.age == person.getAge()){
            return 0;
        }
    }
}
