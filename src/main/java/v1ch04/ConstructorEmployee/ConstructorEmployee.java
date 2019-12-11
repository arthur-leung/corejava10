package v1ch04.ConstructorEmployee;

import java.util.Random;

public class ConstructorEmployee {
    private static int nextId;

    private int id;
    private String name;
    private double salary;

    static
    {
        Random generator = new Random();
        nextId = generator.nextInt(1000);
    }

    {
        id = nextId;
        nextId++;
    }

    public ConstructorEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public ConstructorEmployee(double salary) {
        this.salary = salary;
    }

    public ConstructorEmployee() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
