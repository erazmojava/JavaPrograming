package zadatak16;

/**
 * Created by User on 7.6.2017.
 */
public class Developer extends Person implements SalaryUpdate {
    @Override
    public void onSalaryUpdate() {

    }

    private int project_number;
    private String title;
    private int work_hours;
    private double salary;

    public Developer(int project_number, String title, int work_hours, double salary) {
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

    public int getWork_hours() {
        return work_hours;
    }

    public void setWork_hours(int work_hours) {
        this.work_hours = work_hours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
