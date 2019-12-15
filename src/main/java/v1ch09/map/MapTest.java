package v1ch09.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Employee> staff = new HashMap<>();
        staff.put("144-25-5464", new Employee("Amy"));
        staff.put("567-24-4412", new Employee("Harry"));
        staff.put("144-25-5454", new Employee("Gary"));
        staff.put("144-25-5463", new Employee("Cruz"));

        System.out.println(staff);

        staff.remove("567-24-4412");
        staff.put("123-11-2222", new Employee("Arthur"));
        System.out.println(staff);
        System.out.println(staff.get("144-25-5454"));

        staff.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));
    }
}
