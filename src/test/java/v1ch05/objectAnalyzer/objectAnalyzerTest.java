package v1ch05.objectAnalyzer;

import org.junit.Test;

import java.util.ArrayList;

public class objectAnalyzerTest {
    @Test
    public void testObjectAnalyzer() {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            squares.add(i * i);
        }

        System.out.println(new objectAnalyzer().toString(squares));
    }
}
