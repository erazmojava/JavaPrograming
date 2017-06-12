package zadatak16;

/**
 * Created by Mahir on 07.06.2017..
 */
public class Developer extends Person implements SalaryUpdate {

    private int project_number;
    private String title;
    private double work_hours;
    private double salary;

    public Developer(String name, String surname, int age, String sex, double zip_code, String street, String city, String country, int project_number, String title, double work_hours, double salary) {
        super(name, surname, age, sex, zip_code, street, city, country);
        this.project_number = project_number;
        this.title = title;
        this.work_hours = work_hours;
        this.salary = salary;
    }

    public int getProject_number() {
        return project_number;
    }

    public void setProject_number(int project_number) {
        this.project_number = project_number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getWork_hours() {
        return work_hours;
    }

    public void setWork_hours(double work_hours) {
        this.work_hours = work_hours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void onSalaryUpdate(double bonus) {
        setSalary(getSalary()+bonus);
    }
}
