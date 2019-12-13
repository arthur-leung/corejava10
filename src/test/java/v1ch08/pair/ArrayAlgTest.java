package v1ch08.pair;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class ArrayAlgTest {

    @Test
    public void TestMinmax() {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }

    @Test
    public void TestCommonMinMax() {
        LocalDate[] birthdays = {
                LocalDate.of(1906, 12, 9),
                LocalDate.of(1815, 12, 9),
                LocalDate.of(1906, 12, 9),
                LocalDate.of(1903, 12, 9),
                LocalDate.of(1987, 12, 9),
                LocalDate.of(2000, 12, 9),
        };
        Pair<LocalDate> mm = ArrayAlg.commonMinMax(birthdays);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}