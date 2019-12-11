package v1ch03.Retirement;

import java.util.Scanner;

public class Retirement2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you need to retired?");
        double goal = scanner.nextDouble();

        System.out.println("How much money will you contribute every year?");
        double payment = scanner.nextDouble();

        System.out.println("Interest rate in %:");
        double interestRate = scanner.nextDouble();

        double balance = 0;
        int years = 0;

        String input;
        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
            System.out.printf("After year %d, your balance is %,.2f%n", years, balance);
            System.out.print("Ready to retire?(Y/N)");
            input = scanner.next();
        } while (input.equals("N"));
    }
}
