package v1ch03.Retirement;

import java.util.Scanner;

public class Retirement {
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
        while (goal > balance) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }

        System.out.println("You can retire in " + years + "years.");
    }
}
