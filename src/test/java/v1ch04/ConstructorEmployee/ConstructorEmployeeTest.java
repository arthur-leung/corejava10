package v1ch04.ConstructorEmployee;

import org.junit.Test;

public class ConstructorEmployeeTest {
    @Test
    public void testConstructorEmployee() {
        ConstructorEmployee[] staff = new ConstructorEmployee[3];
        staff[0] = new ConstructorEmployee("Harry", 40000);
        staff[1] = new ConstructorEmployee(60000);
        staff[2] = new ConstructorEmployee();

        for (ConstructorEmployee e : staff) {
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }
    }
}
