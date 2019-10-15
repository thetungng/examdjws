package example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Calendar;

@Entity
//@Table(name = "employees")
public class Employees {
    @Id
    private long id;
    private String name;
    private int salary;

    public Employees() {
    }

    public Employees(long id, String name, int salary) {
        this.id = Calendar.getInstance().getTimeInMillis();
        this.name = name;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
