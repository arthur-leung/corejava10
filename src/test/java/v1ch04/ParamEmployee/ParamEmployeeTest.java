package v1ch04.ParamEmployee;

import org.junit.Test;

public class ParamEmployeeTest {
    @Test
    public void testParamEmployee() {
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        System.out.println("\nTesting tripleSalary:");
        ParamEmployee harry = new ParamEmployee("Harry", 100000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        System.out.println("\nTesting swap:");
        ParamEmployee a = new ParamEmployee("Alice", 70000);
        ParamEmployee b = new ParamEmployee("Bob", 60000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    private void swap(ParamEmployee a, ParamEmployee b) {
        ParamEmployee temp = a;
        a = b;
        b = temp;
        System.out.println("End of method: a=" + a.getName());
        System.out.println("End of method: b=" + b.getName());
    }

    private void tripleValue(double x) {
        x *= 3;
        System.out.println("End of method: x=" + x);
    }

    private void tripleSalary(ParamEmployee e) {
        e.raiseSalary(200);
        System.out.println("End of method: salary=" + e.getSalary());
    }
}
