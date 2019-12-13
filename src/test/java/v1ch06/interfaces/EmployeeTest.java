package v1ch06.interfaces;

import org.junit.Test;

import java.util.Arrays;

public class EmployeeTest {
    @Test
    public void testCompare() {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry", 35000);
        staff[1] = new Employee("Carl", 75000);
        staff[2] = new Employee("Tony", 80000);

        Arrays.sort(staff);

        for (Employee employee : staff) {
            System.out.println(employee);
        }
    }
}
