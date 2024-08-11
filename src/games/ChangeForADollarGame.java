package games;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String[] args) {

        double penny = 0.01;
        double nickle = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        int dollar = 1;

        System.out.println("Welcome to 'Change for a Dollar'!" +
                "Your goal is to enter enough change to make exactly $1.00");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number of pennies:");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickles:");
        int numOfNickles = scanner.nextInt();

        System.out.println("Enter your number of dimes:");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter your number of quarters:");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        double total = numOfPennies * penny + numOfNickles * nickle + numOfDimes * dime + numOfQuarters * quarter;

        if (total < dollar) {
            double amountShort = dollar - total;
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");
        } else if (total > dollar) {
            double amountOver = total - dollar;
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountOver) + " cents.");
        } else {
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
    }
}
