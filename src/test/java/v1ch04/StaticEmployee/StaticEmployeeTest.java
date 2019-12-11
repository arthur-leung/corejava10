package v1ch04.StaticEmployee;

import org.junit.Test;

public class StaticEmployeeTest {
    @Test
    public void testStaticEmployee() {
        StaticEmployee[] staff = new StaticEmployee[3];

        staff[0] = new StaticEmployee("Carl Cracker", 75000);
        staff[1] = new StaticEmployee("Harry Hacker", 50000);
        staff[2] = new StaticEmployee("Tony Tester", 40000);

        for (StaticEmployee employee : staff) {
            employee.setId();
            System.out.println("name=" + employee.getName() + ",id=" + employee.getId() + ",salary=" + employee.getSalary());
        }

        int n = StaticEmployee.getNextId();
        System.out.println("Next available id=" + n);
    }
}
