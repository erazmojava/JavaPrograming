package zadatak16;

/**
 * Created by pc on 7.6.2017.
 */
public class Person{
    private String name;
    private String surname;
    private Integer age;
    private String sex;
    private Place place;

    public Person(String name, String surname, Integer age, String sex, Place place) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.place = place;

    }
    public Person(){}

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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
}