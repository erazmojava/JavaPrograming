package zadatak16;

/**
 * Created by User on 7.6.2017.
 */
public class Employee extends Person{

    private String department;
    private double salary;
    private String job_type;

    public Employee(String department, double salary, String job_type) {
        this.department = department;
        this.salary = salary;
        this.job_type = job_type;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob_type() {
        return job_type;
    }

    public void setJob_type(String job_type) {
        this.job_type = job_type;
    }
}
