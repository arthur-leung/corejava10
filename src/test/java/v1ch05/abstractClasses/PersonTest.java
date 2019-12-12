package v1ch05.abstractClasses;

import org.junit.Test;

public class PersonTest {
    @Test
    public void testPerson() {
        Person[] people = new Person[2];
        people[0] = new Employee("Harry", 5000, 1989, 10, 1);
        people[1] = new Student("Maria", "computer science");

        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
