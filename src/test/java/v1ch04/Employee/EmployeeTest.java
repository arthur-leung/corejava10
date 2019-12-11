package v1ch04.Employee;

import org.junit.Test;

public class EmployeeTest {
    @Test
    public void testEmployee() {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for (Employee employee : staff) {
            employee.raiseSalary(5);
        }

        for (Employee employee : staff) {
            System.out.printf("name=%s,salary=%.2f,hireDay=%s", employee.getName(), employee.getSalary(), employee.getHireDay());
            System.out.println();
        }
    }
}
