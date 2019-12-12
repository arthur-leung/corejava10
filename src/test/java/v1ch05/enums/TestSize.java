package v1ch05.enums;

import org.junit.Test;

import java.util.Scanner;

public class TestSize {
    @Test
    public void testSize() {
        /*Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();*/
        String input = "EXTRA_LARGE";
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("Size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job -- you paid attention to the _.");
        }
    }
}
