package v1ch03.InputTest;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = scanner.nextLine();

        System.out.println("how old are you?");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ". Next year you will be " + (age + 1));
    }
}
