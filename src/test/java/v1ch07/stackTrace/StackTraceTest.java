package v1ch07.stackTrace;

import org.junit.Test;

import java.util.Scanner;

public class StackTraceTest {

    @Test
    public void factorial() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter n: ");
//        int n = in.nextInt();
        int n = 3;
        StackTrace stackTrace = new StackTrace();
        stackTrace.factorial(n);
    }
}
