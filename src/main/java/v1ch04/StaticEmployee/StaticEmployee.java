package v1ch04.StaticEmployee;

import java.time.LocalDate;

public class StaticEmployee {
    private static int nextId = 1;

    private int id;
    private String name;
    private double salary;

    public StaticEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = 0;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
