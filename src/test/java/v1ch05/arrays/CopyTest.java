package v1ch05.arrays;

import org.junit.Test;

import java.util.Arrays;

public class CopyTest {
    @Test
    public void testCopy() {
        Copy copy = new Copy();
        int[] a = {1, 2, 3, 4};
        a = (int[]) copy.goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = {"Tom", "Dick", "Harry"};
        b= (String[]) copy.goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will generate an exception.");
        b = (String[]) copy.badCopyOf(b, 10);
    }
}
