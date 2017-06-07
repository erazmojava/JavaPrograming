package zadatak16;

/**
 * Created by User on 7.6.2017.
 */
public class Person extends Place implements CompareStudent{
    @Override
    public void onStudentCompare() {

    }

    private String name;
    private String surname;
    private int age;
    private String sex;

    public Person(int zip_code, String street, String city, String country, String name, String surname, int age, String sex) {
        super(zip_code, street, city, country);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String surname, int age, String sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
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
    public Person(){}

}

